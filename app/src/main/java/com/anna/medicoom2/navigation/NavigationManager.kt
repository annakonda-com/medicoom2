package com.anna.medicoom2.navigation

import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey

class NavigationManager constructor(override val backStack: NavBackStack) :
    NavigationManagerInterface {
    override fun back() {
        when (backStack[backStack.size - 1]) {
            PharmacyScreen, TodayScreen, TreatmentScreen, HistoryScreen -> toHomeScreen()
            else -> backStack.removeLastOrNull()
        }
    }

    override fun route(path: NavKey) {
        backStack.add(path)
    }

    override fun toHomeScreen() {
        backStack.clear()
        backStack.add(TodayScreen)
    }
}