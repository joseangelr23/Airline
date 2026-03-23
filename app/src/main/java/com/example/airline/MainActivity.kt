package com.example.airline

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.airline.components.CustomButton
import com.example.airline.components.CustomInput

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Greeting("Android")
        }
    }
}

@Composable
fun Greeting(name: String) {
    Column(
        modifier = Modifier.padding(top = 40.dp)
    ) {
        CustomButton("Boton", {})
        Spacer(modifier = Modifier.height(16.dp))
        CustomInput("Input", "", "Escribe el texto...", {})
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Greeting("Android")
}