package com.anna.medicoom2.pharmacy

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.anna.medicoom2.navigation.NavigationManager

@Composable
fun PharmacyScreenUi(modifier: Modifier, navigationManager: NavigationManager){
    Text( "Это экран аптечки", modifier = modifier)
}