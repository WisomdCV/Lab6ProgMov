package com.example.lab06progmovil

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.lab06progmovil.ui.theme.Lab06ProgMovilTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Lab06ProgMovilTheme {
                // Surface with the background color defined in the theme
                Surface(color = MaterialTheme.colorScheme.background) {
                    MainScreen()
                }
            }
        }
    }
}

@Composable
fun MainScreen() {
    // Create a NavController
    val navController: NavHostController = rememberNavController()

    // Define the NavHost with different routes
    NavHost(
        navController = navController,
        startDestination = "home"
    ) {
        composable("home") { CustomScaffold(navController) }
        composable("profile") { UserProfileScreen() }
        composable("build") { BuildScreen() }
        composable("menu") { MenuScreen() }
        composable("favorite") { FavoriteScreen() }
        composable("delete") { DeleteScreen() }
        composable("new_screen") { NewScreen() }
    }
}

@Composable
fun UserProfileScreen() {
    TODO("Not yet implemented")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Lab06ProgMovilTheme {
        // A surface container using the 'background' color from the theme
        Surface(color = MaterialTheme.colorScheme.background) {
            MainScreen()
        }
    }
}