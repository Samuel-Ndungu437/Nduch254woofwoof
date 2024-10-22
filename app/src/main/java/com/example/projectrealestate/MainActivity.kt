package com.example.projectrealestate

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.projectrealestate.ui.theme.ProjectRealEstateTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Home()
        }
    }
}


@Preview(showBackground = true)
@Composable
fun Home(){
    LazyColumn {
        item {
            Column (
                horizontalAlignment = Alignment.Start,
                modifier = Modifier
                    .fillMaxHeight()
            )
        }
    }
    Text(
        text = "Buy,Rent or Sell property using our app",
        fontSize = 30.sp,
        color = Color.Blue,
        fontWeight = FontWeight.Bold
    )



}
    Spacer
