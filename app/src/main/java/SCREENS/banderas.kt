package SCREENS

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
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
fun BanderaEstadosUnidos(modifier: Modifier = Modifier) {
    Box(modifier = modifier.fillMaxSize()) {
        Column(Modifier.fillMaxSize()) {
            repeat(13) { index ->
                Box(
                    Modifier
                        .weight(1f)
                        .fillMaxWidth()
                        .background(if (index % 2 == 0) colorResource(id = R.color.eeuu_rojo) else colorResource(id = R.color.white))
                )
            }
        }
        Box(
            modifier = Modifier
                .fillMaxWidth(0.4f)
                .fillMaxHeight(0.54f)
                .background(colorResource(id = R.color.eeuu_azul))
        ) {
            Canvas(modifier = Modifier.fillMaxSize()) {
                val rows = 9
                val rowHeight = size.height / (rows + 1)
                val starRadius = rowHeight * 0.32f
                val colWidth = size.width / 12f
                val starPath = Path()

                for (r in 0 until rows) {
                    val isEvenRow = (r % 2 == 0)
                    val starsInRow = if (isEvenRow) 6 else 5
                    val y = rowHeight * (r + 1)

                    for (c in 0 until starsInRow) {
                        val x = if (isEvenRow) {
                            colWidth * (2 * c + 1)
                        } else {
                            colWidth * (2 * c + 2)
                        }
                        starPath.addStar(x, y, starRadius)
                    }
                }

                drawPath(
                    path = starPath,
                    color = Color.White
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BandPrev(){
    BanderaEstadosUnidos(Modifier.fillMaxSize())
}
