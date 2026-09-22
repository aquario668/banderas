package com.ecoversity.banderas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.BlendMode.Companion.Color
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.ecoversity.banderas.ui.theme.BanderasTheme


class francia : ComponentActivity() {
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
fun BanderaFrancia(modifier: Modifier = Modifier) {
    Row(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .fillMaxHeight()
                .background(Color(0xFF0055A4))
                .weight(1f)
        ) {

        }
        Column(
            modifier = Modifier
                .fillMaxHeight()
                .background(Color(0xFFFFFFFF))
                .weight(1f)
        ) {

        }
        Column(
            modifier = Modifier
                .fillMaxHeight()
                .weight(1f)
                .background(Color(0xFFEF4135))
        ){}
    }
}

@Preview
@Composable
fun BanderaFranciaPreview() {
    BanderasTheme {
        BanderaFrancia(modifier = Modifier)
    }
}







