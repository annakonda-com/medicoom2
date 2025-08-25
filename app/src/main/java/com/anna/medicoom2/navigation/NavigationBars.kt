package com.anna.medicoom2.navigation

import android.icu.text.CaseMap
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarDefaults
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.anna.medicoom2.R


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

@Composable
fun SosFAB(){
    FloatingActionButton(
        onClick = {},
        shape = CircleShape,
        modifier = Modifier.offset(y = 48.dp).size(60.dp),
        containerColor = MaterialTheme.colorScheme.primary ) {
        Icon(painter = painterResource(R.drawable.sosbtn), stringResource(R.string.sosFab))
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BasicTopBar(title: String){
    TopAppBar(title = {Text(title)},
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = MaterialTheme.colorScheme.primary,
            titleContentColor = MaterialTheme.colorScheme.onPrimary,
        ),
        actions = {
            IconButton(onClick = { }) {
                Icon(
                    imageVector = Icons.Outlined.Settings,
                    tint = MaterialTheme.colorScheme.onPrimary,
                    contentDescription = stringResource(R.string.settings)
                )
            }
        })
}
