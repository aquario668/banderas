package SCREENS

import android.R
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
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.GenericShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.ecoversity.banderas.R
import androidx.compose.ui.draw.clip
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
import androidx.constraintlayout.compose.ChainStyle
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import kotlin.math.cos
import kotlin.math.sin


@Composable
fun BanderaArgentinaCL(modifier: Modifier = Modifier) {
    ConstraintLayout(modifier.fillMaxSize()) {
        val (f1, f2, f3, sol) = createRefs()
        createVerticalChain(f1, f2, f3, chainStyle = ChainStyle.Spread)
        Box(Modifier.constrainAs(f1) { width = Dimension.matchParent; height = Dimension.fillToConstraints; verticalWeight = 1f }.background(colorResource(id = R.color.argentina_celeste)))
        Box(Modifier.constrainAs(f2) { width = Dimension.matchParent; height = Dimension.fillToConstraints; verticalWeight = 1f }.background(colorResource(id = R.color.white)))
        Box(Modifier.constrainAs(f3) { width = Dimension.matchParent; height = Dimension.fillToConstraints; verticalWeight = 1f }.background(colorResource(id = R.color.argentina_celeste)))
        Box(
            Modifier.constrainAs(sol) {
                top.linkTo(parent.top)
                bottom.linkTo(parent.bottom)
                start.linkTo(parent.start)
                end.linkTo(parent.end)
                width = Dimension.value(50.dp)
                height = Dimension.value(50.dp)
            }.clip(CircleShape).background(colorResource(id = R.color.argentina_sol))
        )
    }
}


//@Preview
@Composable
fun bandprev(){
    BanderaArgentinaCL(Modifier.fillMaxSize())
}




