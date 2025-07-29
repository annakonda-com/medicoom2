package com.anna.medicoom2.navigation

import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey

class NavigationManager constructor (override val backStack: NavBackStack) : NavigationManagerInterface{
    override fun back() {
        backStack.removeLastOrNull()
    }

    override fun route(path: NavKey) {
        backStack.add(path)
    }

    override fun toHomeScreen() {
        TODO("Not yet implemented")
    }
}