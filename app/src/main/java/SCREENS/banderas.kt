package SCREENS

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.drawscope.rotate
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.IntSize
import com.ecoversity.banderas.R
import kotlin.math.cos
import kotlin.math.min
import kotlin.math.sin


@Composable
fun BanderaButan(modifier: Modifier = Modifier) {
    val amarillo = colorResource(id = R.color.butan_amarillo)
    val naranja = colorResource(id = R.color.butan_naranja)
    val imagenDragon = ImageBitmap.imageResource(id = R.drawable.butan_removebg_preview)
    Canvas(modifier = modifier.fillMaxSize()) {
        val superior = Path().apply {
            moveTo(0f, 0f)
            lineTo(size.width, 0f)
            lineTo(0f, size.height)
            close()
        }
        drawPath(superior, amarillo)
        val inferior = Path().apply {
            moveTo(size.width, 0f)
            lineTo(size.width, size.height)
            lineTo(0f, size.height)
            close()
        }
        drawPath(inferior, naranja)
        val anchoDestino = (size.width * 0.65f).toInt()
        val proporcion = imagenDragon.height.toFloat() / imagenDragon.width.toFloat()
        val altoDestino = (anchoDestino * proporcion).toInt()
        val posicionX = ((size.width - anchoDestino) / 2).toInt()
        val posicionY = ((size.height - altoDestino) / 2).toInt()
        val centroX = posicionX + (anchoDestino / 2f)
        val centroY = posicionY + (altoDestino / 2f)
        rotate(
            degrees = -30f,
            pivot = Offset(centroX, centroY)
        ) {
            drawImage(
                image = imagenDragon,
                dstSize = IntSize(anchoDestino, altoDestino),
                dstOffset = IntOffset(posicionX, posicionY)
            )
        }
    }
}
@Preview(showBackground = true)
@Composable
fun BandPrev() {
    BanderaButan(Modifier.fillMaxSize())
}


