package com.anna.medicoom2.today

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.anna.medicoom2.navigation.NavigationManager
import com.anna.medicoom2.navigation.PharmacyScreen

@Composable
fun TodayScreenUi(modifier: Modifier, navigationManager: NavigationManager){
    Column (modifier = modifier) {
        Text( "Это экран сегодня")
        Button(onClick = { navigationManager.route(PharmacyScreen) }) {
            Text("Го на экран аптечки")
        }
    }
}