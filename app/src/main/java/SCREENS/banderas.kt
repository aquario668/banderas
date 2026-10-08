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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ChainStyle
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import com.ecoversity.banderas.R



@Composable
    fun BanderaIsraelCL(modifier: Modifier = Modifier) {
        ConstraintLayout(modifier.fillMaxSize()) {
            val (f1, f2, f3, f4, f5, hexagrama) = createRefs()
            createVerticalChain(f1, f2, f3, f4, f5, chainStyle = ChainStyle.Spread)
            Box(Modifier.constrainAs(f1) { width = Dimension.matchParent; height = Dimension.fillToConstraints; verticalWeight = 2f }.background(colorResource(id = R.color.white)))
            Box(Modifier.constrainAs(f2) { width = Dimension.matchParent; height = Dimension.fillToConstraints; verticalWeight = 1f }.background(colorResource(id = R.color.israel_azul)))
            Box(Modifier.constrainAs(f3) { width = Dimension.matchParent; height = Dimension.fillToConstraints; verticalWeight = 4f }.background(colorResource(id = R.color.white)))
            Box(Modifier.constrainAs(f4) { width = Dimension.matchParent; height = Dimension.fillToConstraints; verticalWeight = 1f }.background(colorResource(id = R.color.israel_azul)))
            Box(Modifier.constrainAs(f5) { width = Dimension.matchParent; height = Dimension.fillToConstraints; verticalWeight = 2f }.background(colorResource(id = R.color.white)))
            val azul = colorResource(id = R.color.israel_azul)
            Canvas(Modifier.constrainAs(hexagrama) {
                top.linkTo(f3.top)
                bottom.linkTo(f3.bottom)
                start.linkTo(parent.start)
                end.linkTo(parent.end)
                width = Dimension.matchParent
                height = Dimension.fillToConstraints
            }) {
                val pathSup = Path().apply {
                    moveTo(size.width / 2f, 0f)
                    lineTo(size.width / 2f + size.height * 0.5f, size.height * 0.75f)
                    lineTo(size.width / 2f - size.height * 0.5f, size.height * 0.75f)
                    close()
                }
                val pathInf = Path().apply {
                    moveTo(size.width / 2f, size.height)
                    lineTo(size.width / 2f + size.height * 0.5f, size.height * 0.25f)
                    lineTo(size.width / 2f - size.height * 0.5f, size.height * 0.25f)
                    close()
                }
                drawPath(pathSup, color = azul, style = androidx.compose.ui.graphics.drawscope.Stroke(width = 8f))
                drawPath(pathInf, color = azul, style = androidx.compose.ui.graphics.drawscope.Stroke(width = 8f))
            }
        }
    }

@Preview(showBackground = true)
@Composable
fun BandPrev(){
    BanderaIsraelCL(Modifier.fillMaxSize())
}
