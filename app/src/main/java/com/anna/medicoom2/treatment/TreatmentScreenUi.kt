package com.anna.medicoom2.treatment

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.anna.medicoom2.navigation.NavigationManager

@Composable
fun TreatmentScreenUi(modifier: Modifier, navigationManager: NavigationManager){
    Text(modifier = modifier, text = "Это экран лечения")
}