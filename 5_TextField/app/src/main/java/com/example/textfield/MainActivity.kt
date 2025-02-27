package com.example.textfield

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.textfield.ui.theme.TextfieldTheme
import java.security.KeyStore.TrustedCertificateEntry

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TextfieldTheme {
                textfieldcontent()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun textfieldcontent(modifier: Modifier = Modifier) {
    var text by rememberSaveable { mutableStateOf("") } // State of textfield
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier.fillMaxSize()
        //.fillMaxWidth()
    ) {
        TextField(value = text, onValueChange = { text = it },
            enabled = true,
            readOnly = false,
            label = { Text(text = "Name") },
            placeholder = { Text(text = "Enter your name") },
            leadingIcon = { Icon(Icons.Default.Person, contentDescription = null) },
            trailingIcon = { Icon(Icons.Default.Info, contentDescription = null) },
            singleLine = true,
            modifier = Modifier
                .fillMaxWidth(0.8f)
                .padding(16.dp)
                .clip(RoundedCornerShape(15.dp))

        )
    }
}

