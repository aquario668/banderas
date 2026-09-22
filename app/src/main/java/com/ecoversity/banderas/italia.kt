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
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.view.WindowCompat.enableEdgeToEdge
import com.ecoversity.banderas.ui.theme.BanderasTheme

class  italia: ComponentActivity() {
    override fun onCreate(SavedInstanceState: Bundle?) {
        super.onCreate(SavedInstanceState)
        enableEdgeToEdge()
        setContent {
            BanderasTheme {

            }
        }
    }
}
@Composable
fun BanderaItali(modifier: Modifier = Modifier){
    Row(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .fillMaxHeight()
                .weight(1f)
                .background(Color(0xFF009246))

        )
        {

        }
        Column(
            modifier = Modifier
                .fillMaxHeight()
                .weight(1f)
                .background(Color.White)

        )
        {

        }
        Column(
            modifier = Modifier
                .fillMaxHeight()
                .weight(1f)
                .background(Color(0xFFCE2B37))

        )
        {

        }


    }

}




@Preview
@Composable
fun italiantPreview(){
    BanderasTheme() {
        BanderaItali(modifier = Modifier)
    }
    }
