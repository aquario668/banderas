package SCREENS

import android.R
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
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import com.ecoversity.banderas.R
import kotlin.math.cos
import kotlin.math.min
import kotlin.math.sin


@Composable
fun BanderaReinoUnidoCL(modifier: Modifier = Modifier) {
    val azul = colorResource(id = R.color.uk_azul)
    val blanco = colorResource(id = R.color.white)
    val rojo = colorResource(id = R.color.uk_rojo)
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
            drawRect(color = azul)
            val grosorDiag = size.height * 0.22f
            drawLine(blanco, Offset(0f, 0f), Offset(size.width, size.height), grosorDiag)
            drawLine(blanco, Offset(size.width, 0f), Offset(0f, size.height), grosorDiag)
            drawLine(rojo, Offset(0f, 0f), Offset(size.width, size.height), grosorDiag * 0.4f)
            drawLine(rojo, Offset(size.width, 0f), Offset(0f, size.height), grosorDiag * 0.4f)
            drawRect(color = blanco, topLeft = Offset(size.width / 2f - size.height * 0.16f, 0f), size = Size(size.height * 0.32f, size.height))
            drawRect(color = blanco, topLeft = Offset(0f, size.height / 2f - size.height * 0.16f), size = Size(size.width, size.height * 0.32f))
            drawRect(color = rojo, topLeft = Offset(size.width / 2f - size.height * 0.1f, 0f), size = Size(size.height * 0.2f, size.height))
            drawRect(color = rojo, topLeft = Offset(0f, size.height / 2f - size.height * 0.1f), size = Size(size.width, size.height * 0.2f))
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BandPrev() {
    BanderaReinoUnidoCL(Modifier.fillMaxSize())
}


