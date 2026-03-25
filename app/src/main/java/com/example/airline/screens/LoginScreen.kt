package com.example.airline.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.airline.R
import com.example.airline.components.AuthLayout
import com.example.airline.components.CustomInput
import com.example.airline.components.PasswordInput
import com.example.airline.components.PrimaryButton

@Composable
fun LoginScreen(navController: NavController) {

    var email by remember { mutableStateOf("") }
    var pass by remember { mutableStateOf("") }

    AuthLayout("Iniciar Sesión") {

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

        Spacer(modifier = Modifier.height(8.dp))

        PrimaryButton(
            text = "ENTRAR",
            onClick = {
                navController.navigate("home")
            },
            enabled = email.isNotEmpty() && pass.isNotEmpty()
        )

        Text(
            text = "No tengo cuenta... Regístrate",
            color = Color.LightGray,
            modifier = Modifier.clickable { navController.navigate("signup") }
        )

        Spacer(modifier = Modifier.height(12.dp))

        // Redes sociales
        Row(
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier.fillMaxWidth()
        ) {
            Icon(
                painter = painterResource(id = R.drawable.ic_facebook),
                contentDescription = null,
                tint = Color.Unspecified,
                modifier = Modifier.size(40.dp)
            )

            Spacer(modifier = Modifier.width(20.dp))

            Icon(
                painter = painterResource(id = R.drawable.ic_google),
                contentDescription = null,
                tint = Color.Unspecified,
                modifier = Modifier.size(40.dp)
            )
        }
    }
}