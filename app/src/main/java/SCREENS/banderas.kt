package SCREENS

import android.R
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
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
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.constraintlayout.compose.ChainStyle
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import kotlin.math.cos
import kotlin.math.sin


@Composable
fun BanderaCubaCL(modifier: Modifier = Modifier) {
    ConstraintLayout(modifier.fillMaxSize()) {
        val franjas = Array(5) { createRef() }
        createVerticalChain(*franjas, chainStyle = ChainStyle.Spread)
        franjas.forEachIndexed { index, ref ->
            Box(Modifier.constrainAs(ref) {
                width = Dimension.matchParent
                height = Dimension.fillToConstraints
                verticalWeight = 1f
            }.background(if (index % 2 == 0) colorResource(id = R.color.cuba_azul) else colorResource(id = R.color.white)))
        }
        val canvasTriangulo = createRef()
        val rojo = colorResource(id = R.color.cuba_rojo)
        Canvas(Modifier.constrainAs(canvasTriangulo) {
            top.linkTo(parent.top)
            bottom.linkTo(parent.bottom)
            start.linkTo(parent.start)
            width = Dimension.percent(0.38f)
            height = Dimension.matchParent
        }) {
            val triangle = Path().apply {
                moveTo(0f, 0f)
                lineTo(size.width, size.height / 2f)
                lineTo(0f, size.height)
                close()
            }
            drawPath(triangle, color = rojo)
        }
    }
}



