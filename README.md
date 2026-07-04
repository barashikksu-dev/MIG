# Teremok Android App

[![Build Status](https://github.com/yourusername/teremok-android-app/actions/workflows/android-build.yml/badge.svg)](https://github.com/yourusername/teremok-android-app/actions/workflows/android-build.yml)

Мобильное приложение для сети ресторанов русской кухни «Теремок». Это нативное Android-приложение, разработанное в рамках выпускной квалификационной работы.

## Особенности

*   **Современный стек:** Kotlin, Jetpack Compose, Coroutines, Flow, Hilt, Room, Retrofit.
*   **Архитектура:** Clean Architecture + MVI (Model-View-Intent) для предсказуемого и тестируемого кода.
*   **Интеграция с Wear OS:** Получение уведомлений о статусе заказа и управление заказом с умных часов.
*   **Геолокация:** Автоматическое определение ближайшего ресторана и уведомления в геозонах.
*   **Офлайн-режим:** Кэширование меню и истории заказов с помощью Room для работы без интернета.
*   **Безопасность:** JWT-аутентификация, защита данных, интеграция с платежными шлюзами.

## Технологии

*   **Язык:** Kotlin
*   **Минимальная версия API:** 30 (Android 11)
*   **Целевая версия API:** 34 (Android 14)
*   **UI:** Jetpack Compose + Material Design 3
*   **Архитектура:** Clean Architecture (Presentation, Domain, Data) + MVI
*   **DI:** Dagger Hilt
*   **Асинхронность:** Kotlin Coroutines & Flow
*   **Локальное хранилище:** Room, DataStore Preferences
*   **Сеть:** Retrofit, OkHttp, Moshi
*   **Уведомления:** Firebase Cloud Messaging (FCM)
*   **Wear OS:** Wear Compose
*   **Тестирование:** JUnit5, MockK, Turbine, Espresso, Robolectric

## Начало работы

### Требования

*   Android Studio Hedgehog (2023.1.1) или выше
*   JDK 17
*   Android SDK (API 34)

### Сборка

1.  Клонируйте репозиторий:
    ```bash
    git clone https://github.com/yourusername/teremok-android-app.git
