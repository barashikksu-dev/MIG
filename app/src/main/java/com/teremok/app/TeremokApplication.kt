package com.teremok.app

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class TeremokApplication : Application() {
    // Инициализация Firebase, LeakCanary, и т.д.
    override fun onCreate() {
        super.onCreate()
        // Здесь можно добавить инициализацию библиотек
    }
}
