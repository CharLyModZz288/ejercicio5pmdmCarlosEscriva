package com.example.appkotlinempty

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.appkotlinempty.ui.theme.AppKotlinEmptyTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppKotlinEmptyTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AppKotlinEmptyTheme {
        Greeting("Android")
    }
}
@Composable
fun Main() {
    MaterialTheme {
        // Llamada a la función que define el cuerpo
        ColoredBody(color = Color.Black)
    }
}
@Composable
fun ColoredBody(color: Color) {
    // Definición del cuerpo con un fondo de color específico
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color)
            .size(200.dp) // Tamaño más pequeño que la pantalla
    ) {
        // Contenido del cuerpo
    }
}
@Preview
@Composable
fun MainPreview() {
    Main()
}