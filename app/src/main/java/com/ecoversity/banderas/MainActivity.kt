package com.ecoversity.banderas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ecoversity.banderas.ui.theme.BanderasTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BanderasTheme {
              
            }
        }
    }
}

@Composable
fun banderaMexico(modifier: Modifier=Modifier) {
    Row(modifier = Modifier.fillMaxSize()) {
        Column (
            modifier = Modifier
                .fillMaxHeight()
                .background(Color.Green)
                .weight(1f)

        ) {

        }
        Box(
            modifier = Modifier
                .fillMaxHeight()
                .background(Color.White)
                .weight(1f),
                contentAlignment=Alignment.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.mex),
                contentDescription = "bandera mexico",
                modifier = Modifier.size(80.dp)
            )

        }
        Column(
            modifier = Modifier
                .fillMaxHeight()
                .background(Color.Red)
                .weight(1f)
        ) {

        }

    }
}

@Preview(showBackground = true)
@Composable
fun banderaMex(){
    BanderasTheme() {banderaMexico(modifier = Modifier.fillMaxSize()) }
}
