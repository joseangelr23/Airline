package com.example.airline.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.airline.components.AuthLayout
import com.example.airline.components.CustomInput
import com.example.airline.components.PasswordInput
import com.example.airline.components.PrimaryButton

@Composable
fun SignUpScreen(navController: NavController) {

    var name by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var pass by remember { mutableStateOf("") }
    var confirm by remember { mutableStateOf("") }

    AuthLayout("Crear Cuenta") {

        CustomInput(
            value = name,
            onValueChange = { name = it },
            placeholder = "Nombre Completo",
            icon = Icons.Default.Person
        )

        CustomInput(
            value = email,
            onValueChange = { email = it },
            placeholder = "Correo electrónico",
            icon = Icons.Default.Email
        )

        PasswordInput(
            value = pass,
            onValueChange = { pass = it },
            placeholder = "Contraseña",
            icon = Icons.Default.Lock
        )

        PasswordInput(
            value = confirm,
            onValueChange = { confirm = it },
            placeholder = "Confirmar contraseña",
            icon = Icons.Default.Lock
        )

        Spacer(modifier = Modifier.height(8.dp))

        PrimaryButton(
            text = "CREAR MI CUENTA",
            onClick = {
                navController.navigate("home")
            },
            enabled = name.isNotEmpty() &&
                    email.isNotEmpty() &&
                    pass.isNotEmpty() &&
                    confirm == pass
        )

        Text(
            text = "Ya tengo cuenta... Iniciar Sesión",
            color = Color.LightGray,
            modifier = Modifier.clickable { navController.navigate("login") }
        )
    }
}