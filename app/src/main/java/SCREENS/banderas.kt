package SCREENS

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.GenericShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.ecoversity.banderas.R
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kotlin.math.cos
import kotlin.math.sin


@Composable
fun BanderaArgentina(modifier: Modifier = Modifier) {
    Box(modifier = modifier.fillMaxSize()) {
        Column(Modifier.fillMaxSize()) {
            Box(Modifier.weight(1f).fillMaxWidth().background(colorResource(id = R.color.argentina_celeste)))
            Box(Modifier.weight(1f).fillMaxWidth().background(colorResource(id = R.color.white)))
            Box(Modifier.weight(1f).fillMaxWidth().background(colorResource(id = R.color.argentina_celeste)))
        }
        Box(
            modifier = Modifier
                .align(Alignment.Center)
                .size(50.dp)
                .clip(CircleShape)
                .background(colorResource(id = R.color.argentina_sol))
        )
    }
}


//@Preview
@Composable
fun bandprev(){
    BanderaArgentina(Modifier.fillMaxSize())
}




