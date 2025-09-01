package ru.medicoom.navigation

import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey

interface NavigationManagerInterface {
    val backStack: NavBackStack
    fun route(path: NavKey): Unit
    fun toHomeScreen(): Unit
    fun back(): Unit
    fun currentDestination(): NavKey
}