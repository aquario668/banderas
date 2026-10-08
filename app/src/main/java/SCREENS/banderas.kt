package SCREENS

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.GenericShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ecoversity.banderas.R



@Composable
fun BanderaSeychelles(modifier: Modifier = Modifier) {
    val azul = colorResource(id = R.color.sey_azul)
    val amarillo = colorResource(id = R.color.sey_amarillo)
    val rojo = colorResource(id = R.color.sey_rojo)
    val blanco = colorResource(id = R.color.white)
    val verde = colorResource(id = R.color.sey_verde)
    Canvas(modifier = modifier.fillMaxSize()) {
        val origin = Offset(0f, size.height)

        val p1 = Path().apply {
            moveTo(origin.x, origin.y)
            lineTo(0f, 0f)
            lineTo(size.width * 0.33f, 0f)
            close()
        }
        drawPath(p1, azul)

        val p2 = Path().apply {
            moveTo(origin.x, origin.y)
            lineTo(size.width * 0.33f, 0f)
            lineTo(size.width * 0.66f, 0f)
            close()
        }
        drawPath(p2, amarillo)

        val p3 = Path().apply {
            moveTo(origin.x, origin.y)
            lineTo(size.width * 0.66f, 0f)
            lineTo(size.width, 0f)
            lineTo(size.width, size.height * 0.33f)
            close()
        }
        drawPath(p3, rojo)

        val p4 = Path().apply {
            moveTo(origin.x, origin.y)
            lineTo(size.width, size.height * 0.33f)
            lineTo(size.width, size.height * 0.66f)
            close()
        }
        drawPath(p4, blanco)

        val p5 = Path().apply {
            moveTo(origin.x, origin.y)
            lineTo(size.width, size.height * 0.66f)
            lineTo(size.width, size.height)
            close()
        }
        drawPath(p5, verde)
    }
}

@Preview(showBackground = true)
@Composable
fun BandPrev(){
    BanderaSeychelles(Modifier.fillMaxSize())
}
