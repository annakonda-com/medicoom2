package com.anna.medicoom2.navigation

import android.graphics.drawable.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarDefaults
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.anna.medicoom2.R
import com.anna.medicoom2.history.HistoryScreenUi
import com.anna.medicoom2.today.TodayScreenUi


@Composable
fun NavigationBottomBar(backStack: NavBackStack, navigationManager: NavigationManager) {
    val destinationEntries = destinationsFactory()
    NavigationBar(windowInsets = NavigationBarDefaults.windowInsets) {
        destinationEntries.forEach { destination ->
            val selected = backStack[backStack.size - 1] == destination.key
            NavigationBarItem(
                selected = selected,
                onClick = {
                    navigationManager.route(path = destination.key)
                },
                icon = {
                    Icon(
                        painter = destination.icon,
                        contentDescription = destination.description
                    )
                },
                label = { Text(destination.label) }
            )
        }
    }
}

@Composable
fun destinationsFactory(): List<DestinationInterface> {
    val pharmacy = object : DestinationInterface {
        override val key: NavKey = PharmacyScreen
        override val icon = painterResource(R.drawable.outline_medical_services_24)
        override val description: String = stringResource(R.string.pharmacy)
        override val label: String = stringResource(R.string.pharmacy)
    }

    val today = object : DestinationInterface {
        override val key: NavKey = TodayScreen
        override val icon = painterResource(R.drawable.outline_calendar_today_24)
        override val description: String = stringResource(R.string.today)
        override val label: String = stringResource(R.string.today)
    }

    val treatment = object : DestinationInterface {
        override val key: NavKey = TreatmentScreen
        override val icon = painterResource(R.drawable.outline_insert_chart_24)
        override val description: String = stringResource(R.string.treatment)
        override val label: String = stringResource(R.string.treatment)
    }

    val history = object : DestinationInterface {
        override val key: NavKey = HistoryScreen
        override val icon = painterResource(R.drawable.outline_list_alt_24)
        override val description: String = stringResource(R.string.history)
        override val label: String = stringResource(R.string.history)
    }
    return listOf<DestinationInterface>(today, pharmacy, treatment, history)
}
