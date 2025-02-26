package com.example.cardandimage

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.cardandimage.ui.theme.CardAndImageTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CardAndImageTheme {
                Cardlayout()
            }
        }
    }
}

@Composable
fun Cardlayout(modifier: Modifier = Modifier) {
    Column (
        modifier= Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center
    ){
        Card(
            modifier = Modifier
                .padding(15.dp)
                .fillMaxWidth().height(200.dp),
            elevation = CardDefaults.cardElevation(defaultElevation = 10.dp)
        ) {
            Column (
                modifier=Modifier.fillMaxSize(),//.padding(10.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                Image(
                    painterResource(R.drawable.image),
                    contentDescription = null,
                    modifier = Modifier
                        .padding(15.dp)
                        .clip(RoundedCornerShape(CornerSize(20.dp))),

                    )
                Text(
                    text = "This is text",
                    modifier = Modifier
                        .padding(10.dp)
                        .align(alignment = Alignment.CenterHorizontally)
                )
            }
        }
    }
}