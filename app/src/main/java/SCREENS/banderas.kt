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
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import kotlin.math.cos
import kotlin.math.sin


@Composable
fun BanderaTurquiaCL(modifier: Modifier = Modifier) {
    val rojo = colorResource(id = R.color.turquia_rojo)
    val blanco = colorResource(id = R.color.white)
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
            drawRect(color = rojo)
            val cy = size.height / 2f
            drawCircle(color = blanco, radius = size.height * 0.30f, center = Offset(size.width * 0.38f, cy))
            drawCircle(color = rojo, radius = size.height * 0.24f, center = Offset(size.width * 0.38f + size.height * 0.09f, cy))
        }
    }
}


//@Preview
@Composable
fun bandprev(){
    BanderaTurquiaCL(Modifier.fillMaxSize())
}




