package SCREENS

import android.R
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
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import com.ecoversity.banderas.R
import kotlin.math.cos
import kotlin.math.min
import kotlin.math.sin


@Composable
fun BanderaButanCL(modifier: Modifier = Modifier) {
    val amarillo = colorResource(id = R.color.butan_amarillo)
    val naranja = colorResource(id = R.color.butan_naranja)
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
            val superior = Path().apply { moveTo(0f, 0f); lineTo(size.width, 0f); lineTo(0f, size.height); close() }
            drawPath(superior, amarillo)
            val inferior = Path().apply { moveTo(size.width, 0f); lineTo(size.width, size.height); lineTo(0f, size.height); close() }
            drawPath(inferior, naranja)
            val dragonPath = Path().apply { moveTo(size.width * 0.3f, size.height * 0.6f); quadraticBezierTo(size.width * 0.5f, size.height * 0.3f, size.width * 0.7f, size.height * 0.4f) }
            drawPath(dragonPath, blanco, style = androidx.compose.ui.graphics.drawscope.Stroke(width = 12f))
        }
    }
}
@Preview(showBackground = true)
@Composable
fun BandPrev() {
    BanderaButanCL(Modifier.fillMaxSize())
}


