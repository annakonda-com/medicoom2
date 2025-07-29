package com.anna.medicoom2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation3.runtime.rememberNavBackStack
import com.anna.medicoom2.navigation.NavigationBottomBar
import com.anna.medicoom2.navigation.NavigationManager
import com.anna.medicoom2.navigation.NavigationRoot
import com.anna.medicoom2.navigation.TodayScreen
import com.anna.medicoom2.ui.theme.Medicoom2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val backStack = rememberNavBackStack(TodayScreen)
            val navigationManager = NavigationManager(backStack)
            Scaffold(modifier = Modifier.fillMaxSize(),
                bottomBar = { NavigationBottomBar(backStack, navigationManager) }
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
}



