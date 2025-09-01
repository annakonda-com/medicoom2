package ru.medicoom.today

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import ru.medicoom.navigation.NavigationManager
import ru.medicoom.navigation.PharmacyScreen

@Composable
fun TodayScreenUi(modifier: Modifier, navigationManager: NavigationManager){
    Column (modifier = modifier) {
        Text( "Это экран сегодня")
        Button(onClick = { navigationManager.route(PharmacyScreen) }) {
            Text("Го на экран аптечки")
        }
    }
}