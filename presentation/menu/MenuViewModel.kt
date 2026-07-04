package com.teremok.app.presentation.menu

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.teremok.app.domain.usecases.GetMenuUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.launch
import javax.inject.Inject

// Состояние экрана меню
sealed class MenuState {
    object Loading : MenuState()
    data class Success(val items: List<MenuItem>) : MenuState()
    data class Error(val message: String) : MenuState()
}

// Действия пользователя (Intent)
sealed class MenuIntent {
    object Load : MenuIntent()
    data class SelectCategory(val category: String) : MenuIntent()
}

@HiltViewModel
class MenuViewModel @Inject constructor(
    private val getMenuUseCase: GetMenuUseCase
) : ViewModel() {

    private val _state = MutableStateFlow<MenuState>(MenuState.Loading)
    val state: StateFlow<MenuState> = _state

    init {
        // Автоматическая загрузка при создании ViewModel
        processIntent(MenuIntent.Load)
    }

    fun processIntent(intent: MenuIntent) {
        when (intent) {
            is MenuIntent.Load -> loadMenu()
            is MenuIntent.SelectCategory -> filterMenuByCategory(intent.category)
        }
    }

    private fun loadMenu() {
        viewModelScope.launch {
            _state.value = MenuState.Loading
            getMenuUseCase.execute()
                .catch { exception ->
                    _state.value = MenuState.Error(exception.message ?: "Unknown error")
                }
                .collect { menuItems ->
                    _state.value = MenuState.Success(menuItems)
                }
        }
    }

    private fun filterMenuByCategory(category: String) {
        // Логика фильтрации категории
    }
}
