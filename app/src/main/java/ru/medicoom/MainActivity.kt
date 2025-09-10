package ru.medicoom

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
import androidx.compose.ui.unit.dp
import androidx.navigation3.runtime.rememberNavBackStack
import ru.medicoom.navigation.BasicTopBar
import ru.medicoom.navigation.HistoryScreen
import ru.medicoom.navigation.NavigationBottomBar
import ru.medicoom.navigation.NavigationManager
import ru.medicoom.navigation.NavigationRoot
import ru.medicoom.navigation.PharmacyScreen
import ru.medicoom.navigation.SosFAB
import ru.medicoom.navigation.TodayScreen
import ru.medicoom.navigation.TreatmentScreen
import ru.medicoom.ui.theme.Medicoom2Theme


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
                    .padding(innerPadding)
                    .padding(8.dp),
                backStack, navigationManager
            )
        }
    }
}





