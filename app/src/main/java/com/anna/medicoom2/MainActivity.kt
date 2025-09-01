package com.anna.medicoom2

import android.content.Context
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.FabPosition
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.navigation3.runtime.rememberNavBackStack
import com.anna.medicoom2.navigation.BasicTopBar
import com.anna.medicoom2.navigation.HistoryScreen
import com.anna.medicoom2.navigation.NavigationBottomBar
import com.anna.medicoom2.navigation.NavigationManager
import com.anna.medicoom2.navigation.NavigationRoot
import com.anna.medicoom2.navigation.PharmacyScreen
import com.anna.medicoom2.navigation.SosFAB
import com.anna.medicoom2.navigation.TodayScreen
import com.anna.medicoom2.navigation.TreatmentScreen
import com.anna.medicoom2.ui.theme.Medicoom2Theme
import java.security.AccessController.getContext


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Medicoom2Theme {
                MedicoomApp()
            }
        }
    }

    @Composable
    fun MedicoomApp(){
        val backStack = rememberNavBackStack(TodayScreen)
        val navigationManager = NavigationManager(backStack)
        Scaffold(
            modifier = Modifier.fillMaxSize(),
            bottomBar = { NavigationBottomBar(backStack, navigationManager) },
            topBar = { BasicTopBar(stringResource(when (navigationManager.currentDestination()) {
                TodayScreen -> R.string.today
                PharmacyScreen -> R.string.pharmacy
                TreatmentScreen -> R.string.treatment
                HistoryScreen -> R.string.history
                else -> R.string.medicoom
            })) },
            floatingActionButton = { SosFAB(this) },
            floatingActionButtonPosition = FabPosition.Center,
        ) { innerPadding ->
            NavigationRoot(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(innerPadding),
                backStack, navigationManager
            )
        }
    }
}





