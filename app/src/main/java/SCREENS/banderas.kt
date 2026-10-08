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
import androidx.compose.foundation.shape.GenericShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.R
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kotlin.math.cos
import kotlin.math.sin


@Composable
fun banderaturquia(modifier: Modifier = Modifier) {
    Canvas(modifier = modifier.fillMaxSize()) {
        val redColor = Color(0xFFE30A17)
        drawRect(color = redColor)

        val flagHeight = minOf(size.height, size.width / 1.5f)
        val cy = size.height / 2f


        val rOut = flagHeight * 0.25f
        val cxOuter = size.width * 0.35f
        drawCircle(
            color = Color.White,
            radius = rOut,
            center = Offset(cxOuter, cy)
        )


        val cxInner = cxOuter + flagHeight * 0.0625f
        val rIn = flagHeight * 0.20f
        drawCircle(
            color = redColor,
            radius = rIn,
            center = Offset(cxInner, cy)
        )

        val starCenterX = cxInner + flagHeight * 0.333f
        val starOuterRadius = flagHeight * 0.125f
        val starInnerRadius = starOuterRadius * 0.381966f

        val starPath = Path().apply {
            val points = 5
            val angleStep = Math.PI / points
            val startAngle = Math.PI

            for (i in 0 until 2 * points) {
                val r = if (i % 2 == 0) starOuterRadius else starInnerRadius
                val angle = startAngle + i * angleStep
                val x = (starCenterX + r * cos(angle)).toFloat()
                val y = (cy + r * sin(angle)).toFloat()

                if (i == 0) {
                    moveTo(x, y)
                } else {
                    lineTo(x, y)
                }
            }
            close()
        }

        drawPath(
            path = starPath,
            color = Color.White
        )
    }
}


//@Preview
@Composable
fun bandprev(){
    banderaturquia(Modifier.fillMaxSize())
}




