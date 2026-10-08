package SCREENS

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import com.ecoversity.banderas.R
import kotlin.math.cos
import kotlin.math.min
import kotlin.math.sin


@Composable
fun BanderaSudafrica(modifier: Modifier = Modifier) {
    val verde = colorResource(id = R.color.sa_verde)
    val blanco = colorResource(id = R.color.white)
    val negro = colorResource(id = R.color.sa_negro)
    val azul = colorResource(id = R.color.sa_azul)
    val dorado = colorResource(id = R.color.sa_dorado)
    Canvas(modifier = modifier.fillMaxSize()) {
        drawRect(color = azul, topLeft = Offset(0f, 0f), size = Size(size.width, size.height / 2f))
        drawRect(color = dorado, topLeft = Offset(0f, size.height / 2f), size = Size(size.width, size.height / 2f))
        val apex = Offset(size.width * 0.36f, size.height / 2f)
        drawLine(blanco, Offset(0f, 0f), apex, size.height * 0.30f)
        drawLine(blanco, Offset(0f, size.height), apex, size.height * 0.30f)
        drawLine(blanco, apex, Offset(size.width, size.height * 0.14f), size.height * 0.30f)
        drawLine(blanco, apex, Offset(size.width, size.height * 0.86f), size.height * 0.30f)
        drawLine(verde, Offset(0f, 0f), apex, size.height * 0.20f)
        drawLine(verde, Offset(0f, size.height), apex, size.height * 0.20f)
        drawLine(verde, apex, Offset(size.width, size.height * 0.14f), size.height * 0.20f)
        drawLine(verde, apex, Offset(size.width, size.height * 0.86f), size.height * 0.20f)
        val trianguloPath = Path().apply {
            moveTo(0f, 0f)
            lineTo(size.width * 0.28f, size.height / 2f)
            lineTo(0f, size.height)
            close()
        }
        drawPath(trianguloPath, color = dorado)
        val trianguloNegro = Path().apply {
            moveTo(0f, size.height * 0.08f)
            lineTo(size.width * 0.22f, size.height / 2f)
            lineTo(0f, size.height * 0.92f)
            close()
        }
        drawPath(trianguloNegro, color = negro)
    }
}

@Preview(showBackground = true)
@Composable
fun BandPrev() {
    BanderaSudafrica(Modifier.fillMaxSize())
}


