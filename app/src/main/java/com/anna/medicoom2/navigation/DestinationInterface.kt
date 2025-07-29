package com.anna.medicoom2.navigation

import android.graphics.drawable.Icon
import androidx.compose.ui.graphics.painter.Painter
import androidx.navigation3.runtime.NavKey

interface DestinationInterface {
    val key : NavKey
    val icon : Painter
    val description : String
    val label : String
}