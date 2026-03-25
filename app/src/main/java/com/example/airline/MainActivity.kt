package com.example.airline

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.airline.components.CustomInput
import com.example.airline.components.PrimaryButton
import com.example.airline.navigation.AppNavigation

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppNavigation()
        }
    }
}

@Composable
fun Greeting(name: String) {

    var text by remember { mutableStateOf("") }

    Column(
        modifier = Modifier.padding(top = 40.dp)
    ) {

        PrimaryButton(
            text = "Botón",
            onClick = { }
        )

        Spacer(modifier = Modifier.height(16.dp))

        CustomInput(
            value = text,
            onValueChange = { text = it },
            placeholder = "Escribe el texto...",
            icon = Icons.Default.Email
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Greeting("Android")
}