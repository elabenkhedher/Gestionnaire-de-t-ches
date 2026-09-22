package com.example.complited

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.complited.ui.theme.ComplitedTheme
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Surface
import androidx.compose.ui.Alignment
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComplitedTheme {
                Surface(
                    modifier= Modifier.fillMaxSize()

                ) {
                    completed()
                }
            }
        }
    }
}

@Composable
fun completed( modifier: Modifier = Modifier) {
    Column(
        verticalArrangement =  Arrangement.Center ,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id=R.drawable.ic_task_completed),
            modifier = modifier,
            contentDescription = null
        )
        Text(
            text="All tasks completed",
            fontWeight = FontWeight.Bold,
            modifier=Modifier
                .padding(top = 24.dp , bottom = 8.dp)
        )
        Text (
            text="Nice work!",
            fontSize = 16.sp
        )
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComplitedTheme {
        completed()
    }
}