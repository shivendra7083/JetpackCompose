package com.example.layout

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Divider
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.layout.ui.theme.LayoutTheme
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
                //layout()
                //MyLazyColumn()
                MyLazyColumnWithDivider()
        }

    }
}

@Preview
@Composable
fun layout(modifier: Modifier = Modifier) {
    Column (
        modifier = Modifier
//            .fillMaxWidth(.5f)
//            .fillMaxHeight()
            .fillMaxSize()
            .background(Color.Green)
            .verticalScroll(rememberScrollState()) ,
            verticalArrangement = Arrangement.Center ,
            horizontalAlignment = Alignment.CenterHorizontally ,


    ) {
        for (i in 1..5) {
            Text(text = "Abhay"
                //,modifier = Modifier.padding(30.dp, 15.dp,0.dp,0.dp)
                , fontSize = 28.sp)

        }
    }
}
@Composable
fun MyLazyColumn() { // AutoScroll
    LazyColumn {
        items(100) { index ->
            Text(
                text = "Item #$index",
                fontSize = 20.sp,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            )
        }
    }
}

// Adding a Divider Between Items

@Composable
fun MyLazyColumnWithDivider() {
    LazyColumn {
        items(50) { index ->
            Column {
                Text(
                    text = "Item #$index",
                    fontSize = 20.sp,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp)
                )
                Divider(color = Color.Gray, thickness = 1.dp)
            }
        }
    }
}



