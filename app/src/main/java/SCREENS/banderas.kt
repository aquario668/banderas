package SCREENS

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
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

fun Path.addStar(
    centerX: Float,
    centerY: Float,
    outerRadius: Float,
    innerRadius: Float = outerRadius * 0.382f
) {
    val angleStep = (2 * Math.PI) / 5
    var angle = -Math.PI / 2

    moveTo(
        (centerX + outerRadius * Math.cos(angle)).toFloat(),
        (centerY + outerRadius * Math.sin(angle)).toFloat()
    )

    repeat(5) {
        angle += angleStep / 2
        lineTo(
            (centerX + innerRadius * Math.cos(angle)).toFloat(),
            (centerY + innerRadius * Math.sin(angle)).toFloat()
        )
        angle += angleStep / 2
        lineTo(
            (centerX + outerRadius * Math.cos(angle)).toFloat(),
            (centerY + outerRadius * Math.sin(angle)).toFloat()
        )
    }
    close()
}

@Composable
fun BanderaEstadosUnidosCL(modifier: Modifier = Modifier) {
    ConstraintLayout(modifier.fillMaxSize()) {
        val franjas = Array(13) { createRef() }
        createVerticalChain(*franjas, chainStyle = ChainStyle.Spread)
        franjas.forEachIndexed { index, ref ->
            Box(Modifier.constrainAs(ref) {
                width = Dimension.matchParent
                height = Dimension.fillToConstraints
                verticalWeight = 1f
            }.background(if (index % 2 == 0) colorResource(id = R.color.eeuu_rojo) else colorResource(id = R.color.white)))
        }
        val canton = createRef()
        Box(Modifier.constrainAs(canton) {
            top.linkTo(parent.top)
            start.linkTo(parent.start)
            width = Dimension.percent(0.4f)
            height = Dimension.percent(0.54f)
        }.background(colorResource(id = R.color.eeuu_azul)))
    }
}

@Preview(showBackground = true)
@Composable
fun BandPrev(){
    BanderaEstadosUnidosCL(Modifier.fillMaxSize())
}
