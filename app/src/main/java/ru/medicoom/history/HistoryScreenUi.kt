package ru.medicoom.history

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import ru.medicoom.navigation.NavigationManager


@Composable
fun HistoryScreenUi(modifier: Modifier, navigationManager: NavigationManager){
    Text(modifier = modifier, text = "Это экран истории")
}