package SCREENS

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
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

private fun Path.addStar(
    centerX: Float,
    centerY: Float,
    outerRadius: Float,
    innerRadius: Float = outerRadius * 0.382f,
    numPoints: Int = 5,
) {
    val angleStep = Math.PI / numPoints
    var angle = -Math.PI / 2
    moveTo(
        (centerX + outerRadius * cos(angle)).toFloat(),
        (centerY + outerRadius * sin(angle)).toFloat(),
    )
    for (i in 1 until numPoints * 2) {
        angle += angleStep
        val radius = if (i % 2 == 1) innerRadius else outerRadius
        lineTo(
            (centerX + radius * cos(angle)).toFloat(),
            (centerY + radius * sin(angle)).toFloat(),
        )
    }
    close()
}

@Composable
fun BanderaPapuaNuevaGuinea(modifier: Modifier = Modifier) {
    val negro = colorResource(id = R.color.papua_negro)
    val rojo = colorResource(id = R.color.papua_rojo)
    val amarillo = Color(0xFFFFCE00)

    Canvas(modifier = modifier.fillMaxSize()) {
        // 1. Triángulo superior (Rojo)
        val trianguloSuperior = Path().apply {
            moveTo(0f, 0f)
            lineTo(size.width, 0f)
            lineTo(size.width, size.height)
            close()
        }
        drawPath(trianguloSuperior, color = rojo)

        // 2. Triángulo inferior (Negro)
        val trianguloInferior = Path().apply {
            moveTo(0f, 0f)
            lineTo(size.width, size.height)
            lineTo(0f, size.height)
            close()
        }
        drawPath(trianguloInferior, color = negro)

        val s = min(size.width, size.height)


        val cxCruz = size.width * 0.25f
        val cyCruz = size.height * 0.62f

        val rGrande = s * 0.045f
        val rPequena = s * 0.026f

        val cruzDelSurPath = Path().apply {
            addStar(cxCruz, cyCruz - size.height * 0.18f, rGrande)
            addStar(cxCruz, cyCruz + size.height * 0.18f, rGrande)
            addStar(cxCruz - size.width * 0.10f, cyCruz - size.height * 0.02f, rGrande)
            addStar(cxCruz + size.width * 0.10f, cyCruz - size.height * 0.02f, rGrande)
            addStar(cxCruz + size.width * 0.04f, cyCruz + size.height * 0.07f, rPequena)
        }
        drawPath(cruzDelSurPath, color = Color.White)

    }
}

@Preview(showBackground = true)
@Composable
fun BandPrev() {
    BanderaPapuaNuevaGuinea(Modifier.fillMaxSize())
}


