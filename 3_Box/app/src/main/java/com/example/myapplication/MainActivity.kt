package com.example.myapplication

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplicationTheme {
                boxcontent()
            }
        }
    }
}

@Preview
@Composable
fun boxcontent() {
    val context = LocalContext.current  // Get context for Toast
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Yellow),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "SHIvendra Singh",
            color = Color.Red,
            fontSize = 28.sp,
            modifier = Modifier.align(Alignment.TopCenter)
        )
        Text(
            text = "SHIvendra Singh",
            color = Color.Green,
            fontSize = 28.sp,
            modifier = Modifier.align(Alignment.Center)
        )
        Text(
            text = "SHIvendra Singh",
            color = Color.Blue,
            fontSize = 28.sp,
            modifier = Modifier.align(Alignment.BottomCenter )
        )
        Button(onClick = {
            Toast.makeText(context, "Button Clicked!", Toast.LENGTH_SHORT).show()
        } , modifier = Modifier.align(Alignment.CenterEnd)) {
            Text(text = "CLick me")
        }
    }

}

