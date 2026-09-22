package com.ecoversity.banderas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.ecoversity.banderas.ui.theme.BanderasTheme


class alemania : ComponentActivity() {
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
fun BanderaAlemana(modifier: Modifier = Modifier)
{
    Column(modifier = Modifier.fillMaxSize()){
        Row(modifier = Modifier
            .fillMaxWidth()
            .weight(1f)
            .background(Color.Black)
        ){

        }
        Row(modifier = Modifier
            .fillMaxWidth()
            .weight(1f)
            .background(Color(0xFFDD0000))
        ){

        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .background(Color(0xFFFFCE00))
        ) { }
    }
}


@Preview
@Composable
fun BanderaalemaniaPreview(){
    BanderasTheme {
        BanderaAlemana(modifier = Modifier)
    }
}
