package com.example.a1_textwidget

import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.a1_textwidget.ui.theme._1_TextWidgetTheme

class MainActivity() : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column {
                showtext()

                Spacer(Modifier.height(100.dp))

                showtext()
            }
        }
    }
}
@Preview
@Composable
fun showtext(modifier: Modifier = Modifier) {
    //            Row {
//                Text(text = "Shivendra singh" , color = Color.Red)
//                Text(text = " Hello Shivendra singh" , color = Color.Blue)
//            }
    // Row {
    Column {
        Spacer(Modifier.height(30.dp))
        Text(text = " Hello Shivendra singh",
            //.repeat(3)
            color = Color.Red ,
            fontSize = 20.sp ,
            fontFamily = FontFamily.Monospace ,
            fontStyle = FontStyle.Normal ,
            fontWeight = FontWeight.ExtraBold,
            textAlign = TextAlign.Center ,
            letterSpacing = 3.sp,
            maxLines = 4 ,
            modifier = Modifier
                .padding(20.dp,5.dp,0.dp,0.dp)
                //.fillMaxSize()
                .fillMaxWidth()
                .background(Color.Yellow).padding(8.dp)
        )
        Spacer(Modifier.height(50.dp))
        val arr = arrayOf("Abhay" , "Kunal" , "Chotu" , "Shivendra")
        for (i in arr){
            Text(text = i .repeat(1),
                fontSize = 20.sp ,
                fontWeight = FontWeight.ExtraBold ,
                letterSpacing = 2.sp ,
                modifier = Modifier
                    .padding(10.dp,8.dp,0.dp,0.dp))
        }
    }
}