package SCREENS

import android.R
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
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
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import com.ecoversity.banderas.R
import kotlin.math.cos
import kotlin.math.min
import kotlin.math.sin


@Composable
fun BanderaNepalCL(modifier: Modifier = Modifier) {
    val azul = colorResource(id = R.color.nepal_azul)
    val carmesi = colorResource(id = R.color.nepal_carmesi)
    val blanco = colorResource(id = R.color.white)
    ConstraintLayout(modifier.fillMaxSize()) {
        val canvasRef = createRef()
        Canvas(Modifier.constrainAs(canvasRef) {
            top.linkTo(parent.top)
            bottom.linkTo(parent.bottom)
            start.linkTo(parent.start)
            end.linkTo(parent.end)
            width = Dimension.value(240.dp)
            height = Dimension.value(290.dp)
        }) {
            val mid = size.height / 2f
            val superior = Path().apply { moveTo(0f, 0f); lineTo(size.width * 0.92f, size.height * 0.40f); lineTo(0f, mid); close() }
            drawPath(superior, color = azul)
            val interiorSup = Path().apply { moveTo(size.width * 0.05f, size.height * 0.05f); lineTo(size.width * 0.85f, size.height * 0.40f); lineTo(size.width * 0.05f, mid - size.height * 0.02f); close() }
            drawPath(interiorSup, color = carmesi)
            val inferior = Path().apply { moveTo(0f, mid - size.height * 0.1f); lineTo(size.width * 0.92f, size.height * 0.8f); lineTo(0f, size.height); close() }
            drawPath(inferior, color = azul)
            val interiorInf = Path().apply { moveTo(size.width * 0.05f, mid - size.height * 0.05f); lineTo(size.width * 0.85f, size.height * 0.8f); lineTo(size.width * 0.05f, size.height * 0.95f); close() }
            drawPath(interiorInf, color = carmesi)
            drawCircle(color = blanco, radius = size.height * 0.08f, center = Offset(size.width * 0.25f, size.height * 0.3f))
            drawCircle(color = carmesi, radius = size.height * 0.07f, center = Offset(size.width * 0.25f, size.height * 0.28f))
            drawCircle(color = blanco, radius = size.height * 0.08f, center = Offset(size.width * 0.25f, size.height * 0.75f))
        }
    }
}
@Preview(showBackground = true)
@Composable
fun BandPrev() {
    BanderaNepalCL(Modifier.fillMaxSize())
}


