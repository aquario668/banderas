package SCREENS

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.GenericShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ecoversity.banderas.R

fun Path.addStar(
    centerX: Float,
    centerY: Float,
    outerRadius: Float,
    innerRadius: Float = outerRadius * 0.382f
) {
    val angleStep = (2 * Math.PI) / 5
    var angle = -Math.PI / 2

    moveTo(
        (centerX + outerRadius * Math.cos(angle)).toFloat(),
        (centerY + outerRadius * Math.sin(angle)).toFloat()
    )

    repeat(5) {
        angle += angleStep / 2
        lineTo(
            (centerX + innerRadius * Math.cos(angle)).toFloat(),
            (centerY + innerRadius * Math.sin(angle)).toFloat()
        )
        angle += angleStep / 2
        lineTo(
            (centerX + outerRadius * Math.cos(angle)).toFloat(),
            (centerY + outerRadius * Math.sin(angle)).toFloat()
        )
    }
    close()
}

@Composable
fun BanderaSuiza(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .aspectRatio(1f)
            .background(colorResource(id = R.color.suiza_rojo))
    ) {
        Row(Modifier.weight(0.19f).fillMaxWidth()) { }

        Row(Modifier.weight(0.21f).fillMaxWidth()) {
            Box(Modifier.weight(0.40f).fillMaxHeight())
            Box(
                Modifier
                    .weight(0.20f)
                    .fillMaxHeight()
                    .background(colorResource(id = R.color.white))
            )
            Box(Modifier.weight(0.40f).fillMaxHeight())
        }

        Row(Modifier.weight(0.20f).fillMaxWidth()) {
            Box(Modifier.weight(0.19f).fillMaxHeight())
            Box(
                Modifier
                    .weight(0.62f)
                    .fillMaxHeight()
                    .background(colorResource(id = R.color.white))
            )
            Box(Modifier.weight(0.19f).fillMaxHeight())
        }

        Row(Modifier.weight(0.21f).fillMaxWidth()) {
            Box(Modifier.weight(0.40f).fillMaxHeight())
            Box(
                Modifier
                    .weight(0.20f)
                    .fillMaxHeight()
                    .background(colorResource(id = R.color.white))
            )
            Box(Modifier.weight(0.40f).fillMaxHeight())
        }

        Row(Modifier.weight(0.19f).fillMaxWidth()) { }
    }
}

@Preview(showBackground = true)
@Composable
fun BandPrev(){
    BanderaSuiza(Modifier.fillMaxSize())
}
