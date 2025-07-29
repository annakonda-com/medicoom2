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


@Composable
fun NavigationBottomBar(backStack : NavBackStack, navigationManager: NavigationManager){
    val pharmacy = object : DestinationInterface {
        override val key: NavKey = PharmacyScreen
        override val icon = painterResource(R.drawable.outline_medical_services_24)
        override val description: String = stringResource(R.string.pharmacy)



    }
    val destinationEntries = listOf<NavKey>(PharmacyScreen, TodayScreen, TreatmentScreen, HistoryScreen)
    NavigationBar(windowInsets = NavigationBarDefaults.windowInsets) {
        destinationEntries.forEachIndexed { index, destination ->
            val selected = backStack[backStack.size - 1] == destination
            NavigationBarItem(
                selected = selected,
                onClick = {
                    navigationManager.route(path = destination)
                },
                icon = {
                    Icon(
                        painter = painterResource(R.drawable.outline_calendar_today_24),
                        contentDescription = "QQQ"
                    )
                },
                label = { Text("qqq") }
            )
        }
    }
}
