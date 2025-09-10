package ru.medicoom.today

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import ru.medicoom.navigation.NavigationManager
import ru.medicoom.navigation.PharmacyScreen
import ru.medicoom.ui.components.TodayListItem

@Composable
fun TodayScreenUi(modifier: Modifier, navigationManager: NavigationManager){
    Column (modifier = modifier) {
        TodayListItem()
    }
}