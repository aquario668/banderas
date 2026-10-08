package SCREENS

import android.R
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
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
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
fun BanderaPapuaNuevaGuineaCL(modifier: Modifier = Modifier) {
    val negro = colorResource(id = R.color.papua_negro)
    val rojo = colorResource(id = R.color.papua_rojo)
    ConstraintLayout(modifier.fillMaxSize()) {
        val canvasRef = createRef()
        Canvas(Modifier.constrainAs(canvasRef) {
            top.linkTo(parent.top)
            bottom.linkTo(parent.bottom)
            start.linkTo(parent.start)
            end.linkTo(parent.end)
            width = Dimension.matchParent
            height = Dimension.matchParent
        }) {
            val trianguloSuperior = Path().apply {
                moveTo(0f, 0f)
                lineTo(size.width, 0f)
                lineTo(size.width, size.height)
                close()
            }
            drawPath(trianguloSuperior, color = rojo)
            val trianguloInferior = Path().apply {
                moveTo(0f, 0f)
                lineTo(size.width, size.height)
                lineTo(0f, size.height)
                close()
            }
            drawPath(trianguloInferior, color = negro)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BandPrev() {
    BanderaPapuaNuevaGuineaCL(Modifier.fillMaxSize())
}


