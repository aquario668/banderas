package Screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ComposableTarget
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color


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
