package ru.medicoom.pharmacy

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import ru.medicoom.navigation.NavigationManager

@Composable
fun PharmacyScreenUi(modifier: Modifier, navigationManager: NavigationManager){
    Text( "Это экран аптечки", modifier = modifier)
}