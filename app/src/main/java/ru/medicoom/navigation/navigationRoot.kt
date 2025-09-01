package ru.medicoom.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavEntry
import androidx.navigation3.runtime.NavKey
import androidx.navigation3.ui.NavDisplay
import ru.medicoom.history.HistoryScreenUi
import ru.medicoom.pharmacy.PharmacyScreenUi
import ru.medicoom.today.TodayScreenUi
import ru.medicoom.treatment.TreatmentScreenUi
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
fun NavigationRoot(
    modifier: Modifier,
    backStack: NavBackStack,
    navigationManager: NavigationManager
) {
    NavDisplay(
        backStack = backStack,
        onBack = {navigationManager.back()},
        entryProvider = { key ->
            when (key) {
                is PharmacyScreen -> NavEntry(key) {
                    PharmacyScreenUi(modifier, navigationManager)
                }

                is TodayScreen -> NavEntry(key) {
                    TodayScreenUi(modifier, navigationManager)
                }

                is HistoryScreen -> NavEntry(key) {
                    HistoryScreenUi(modifier, navigationManager)
                }

                is TreatmentScreen -> NavEntry(key) {
                    TreatmentScreenUi(modifier, navigationManager)
                }

                else -> throw RuntimeException("Invalid NavKey")

            }
        })


}
