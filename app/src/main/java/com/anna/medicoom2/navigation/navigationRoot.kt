package com.anna.medicoom2.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocal
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavEntry
import androidx.navigation3.runtime.NavKey
import androidx.navigation3.runtime.rememberNavBackStack
import androidx.navigation3.ui.NavDisplay
import com.anna.medicoom2.pharmacy.PharmacyScreenUi
import com.anna.medicoom2.today.TodayScreenUi
import kotlinx.serialization.Serializable

@Serializable
data object PharmacyScreen : NavKey

@Serializable
data object TodayScreen : NavKey

@Serializable
data object TreatmentScreen : NavKey

@Serializable
data object HistoryScreen : NavKey

@Composable
fun NavigationRoot(modifier: Modifier, backStack: NavBackStack, navigationManager: NavigationManager) {
    NavDisplay(
        backStack = backStack,
        entryProvider = { key ->
            when (key) {
                is PharmacyScreen -> NavEntry(key) {
                    PharmacyScreenUi(modifier, navigationManager)
                }

                is TodayScreen -> NavEntry(key) {
                    TodayScreenUi(  modifier, navigationManager)
                }

                else -> throw RuntimeException("Invalid NavKey")

            }
        })


}
