package com.example.lab06progmovil

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material.icons.outlined.AccountCircle
import androidx.compose.material.icons.rounded.Menu
import androidx.compose.material.icons.rounded.Search
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun CustomScaffold(navController: NavHostController) {
    Scaffold(
        topBar = { CustomTopBar() },
        bottomBar = { CustomBottomBar(navController) },
        floatingActionButton = { CustomFAB(navController) },
        content = { padding ->
            CustomContent(padding)
        }
    )
}

// Barra superior
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CustomTopBar() {
    TopAppBar(
        navigationIcon = {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(imageVector = Icons.Rounded.Menu, contentDescription = null)
            }
        },
        title = { Text(text = "Sample Title") },
        actions = {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    imageVector = Icons.Rounded.Search,
                    contentDescription = null
                )
            }
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    imageVector = Icons.Outlined.AccountCircle,
                    contentDescription = null
                )
            }
        }
    )
}

// Barra inferior
@Composable
fun CustomBottomBar(navController: NavHostController) {
    BottomAppBar(
        modifier = Modifier.fillMaxWidth()
    ) {
        Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {
            IconButton(onClick = { navController.navigate("build") }) {
                Icon(Icons.Filled.Refresh, contentDescription = "Build description")
            }
            IconButton(onClick = { navController.navigate("menu") }) {
                Icon(
                    Icons.Filled.Warning,
                    contentDescription = "Menu description",
                )
            }
            IconButton(onClick = { navController.navigate("favorite") }) {
                Icon(
                    Icons.Filled.Person,
                    contentDescription = "Favorite description",
                )
            }
            IconButton(onClick = { navController.navigate("delete") }) {
                Icon(
                    Icons.Filled.Share,
                    contentDescription = "Delete description",
                )
            }
        }
    }
}

// Botón flotante
@Composable
fun CustomFAB(navController: NavHostController) {
    FloatingActionButton(
        onClick = { navController.navigate("new_screen") } // Navega a la nueva pantalla
    ) {
        Text(
            fontSize = 24.sp,
            text = "+"
        )
    }
}


// Contenido principal
@Composable
fun CustomContent(padding: PaddingValues) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(padding),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "My app content")
    }
}

// Pantallas nuevas
@Composable
fun BuildScreen() {
    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        Text(text = "Recargando página", fontSize = 24.sp)
        Text(
            text = "Esta pantalla se utiliza para la recarga de la página. Aquí puedes actualizar o reiniciar los datos que se muestran en la pantalla de la aplicación. Utiliza esta sección para implementar funciones relacionadas con la actualización y la sincronización de la información.",
            fontSize = 16.sp
        )
    }
}

@Composable
fun MenuScreen() {
    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        Text(text = "Peligro de página", fontSize = 24.sp)
        Text(
            text = "Esta pantalla muestra una advertencia de peligro. Aquí puedes implementar mensajes importantes o alertas que necesitan la atención del usuario. Utiliza esta sección para destacar situaciones críticas o mensajes urgentes.",
            fontSize = 16.sp
        )
    }
}

@Composable
fun FavoriteScreen() {
    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        Text(text = "Usuario Principal", fontSize = 24.sp)
        Text(
            text = "Información del usuario:\n\nNombre: Wilson Del Carpio\nDetalles adicionales: Aquí puedes mostrar más información relevante sobre el usuario, como estadísticas, preferencias y cualquier dato importante que quieras destacar.",
            fontSize = 16.sp
        )
    }
}

@Composable
fun DeleteScreen() {
    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        Text(text = "Compartir datos generales", fontSize = 24.sp)
        Text(
            text = "Esta pantalla permite compartir datos generales. Puedes implementar funciones para exportar o compartir información de la aplicación. Utiliza esta sección para agregar opciones de exportación o compartir datos con otros usuarios o aplicaciones.",
            fontSize = 16.sp
        )
    }
}

@Composable
fun NewScreen() {
    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        Text(text = "New Screen", fontSize = 24.sp)
        Text(
            text = "Este es el contenido de la nueva pantalla a la que navega el botón flotante. Aquí puedes agregar el contenido que desees mostrar en esta vista.",
            fontSize = 16.sp
        )
    }
}