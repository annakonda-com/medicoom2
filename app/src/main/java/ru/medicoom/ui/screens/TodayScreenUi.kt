package ru.medicoom.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import ru.medicoom.navigation.NavigationManager
import ru.medicoom.ui.components.TodayListItem

@Composable
fun TodayScreenUi(modifier: Modifier, navigationManager: NavigationManager){
    Column (modifier = modifier) {
        TodayListItem()
    }
}