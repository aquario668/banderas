package SCREENS

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.GenericShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.R
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.res.painterResource
import kotlin.math.cos
import kotlin.math.sin


@Composable
fun banderacuba(modifier: Modifier=Modifier) {

    Canvas(modifier = modifier.fillMaxSize()) {
        val band=size.height /5f
        for (i in 0 until 5 ){
if(i % 2 == 0 ) drawRect(
    color = Color(0xFF002E6E),
    topLeft = Offset(0f,i * band ),
    size =Size(size.width, band)
)
        }

        val triWidth = size.width * 0.38f
        val trianglePath = Path().apply {
            moveTo(0f, 0f)
            lineTo(triWidth, size.height / 2f)
            lineTo(0f, size.height)
            close()
        }
        drawPath(trianglePath, color = Color(0xFFCB1428))

        val starCenterX = triWidth / 3f
        val starCenterY = size.height / 2f
        val outerRadius = size.height * 0.09f
        val innerRadius = outerRadius * 0.382f

        val starPath = Path().apply {
            val angleStep = Math.PI / 5
            for (i in 0 until 10) {
                val radius = if (i % 2 == 0) outerRadius else innerRadius
                val angle = -Math.PI / 2 + i * angleStep
                val x = (starCenterX + radius * cos(angle)).toFloat()
                val y = (starCenterY + radius * sin(angle)).toFloat()

                if (i == 0) {
                    moveTo(x, y)
                } else {
                    lineTo(x, y)
                }
            }
            close()
        }

        drawPath(starPath, color = Color.White)
    }


}




