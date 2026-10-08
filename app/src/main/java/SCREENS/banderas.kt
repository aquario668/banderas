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



@Composable
fun BanderaIsrael(modifier: Modifier = Modifier) {
    Box(modifier = modifier.fillMaxSize().background(colorResource(id = R.color.white))) {
        Column(Modifier.fillMaxSize()) {
            Box(Modifier.weight(3f).fillMaxWidth())
            Box(Modifier.weight(5f).fillMaxWidth().background(colorResource(id = R.color.israel_azul)))
            Box(Modifier.weight(24f).fillMaxWidth())
            Box(Modifier.weight(5f).fillMaxWidth().background(colorResource(id = R.color.israel_azul)))
            Box(Modifier.weight(3f).fillMaxWidth())
        }
        val azul = colorResource(id = R.color.israel_azul)
        Canvas(modifier = Modifier.fillMaxSize()) {
            val cx = size.width / 2f
            val cy = size.height / 2f
            val r = size.height * 0.165f
            val sin60 = 0.8660254f
            val strokeWidth = size.height * 0.0275f
            val pathSup = Path().apply {
                moveTo(cx, cy - r)
                lineTo(cx + r * sin60, cy + r * 0.5f)
                lineTo(cx - r * sin60, cy + r * 0.5f)
                close()
            }
            val pathInf = Path().apply {
                moveTo(cx, cy + r)
                lineTo(cx + r * sin60, cy - r * 0.5f)
                lineTo(cx - r * sin60, cy - r * 0.5f)
                close()
            }

            val stroke = androidx.compose.ui.graphics.drawscope.Stroke(
                width = strokeWidth,
                join = androidx.compose.ui.graphics.StrokeJoin.Miter
            )

            drawPath(pathSup, color = azul, style = stroke)
            drawPath(pathInf, color = azul, style = stroke)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BandPrev(){
    BanderaIsrael(Modifier.fillMaxSize())
}
