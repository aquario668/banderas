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
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import com.ecoversity.banderas.R



@Composable
fun BanderaSuizaCL(modifier: Modifier = Modifier) {
    ConstraintLayout(modifier.aspectRatio(1f).background(colorResource(id = R.color.suiza_rojo))) {
        val (vert, horiz) = createRefs()
        Box(Modifier.constrainAs(vert) {
            top.linkTo(parent.top)
            bottom.linkTo(parent.bottom)
            start.linkTo(parent.start)
            end.linkTo(parent.end)
            width = Dimension.percent(0.2f)
            height = Dimension.percent(0.62f)
        }.background(colorResource(id = R.color.white)))
        Box(Modifier.constrainAs(horiz) {
            top.linkTo(parent.top)
            bottom.linkTo(parent.bottom)
            start.linkTo(parent.start)
            end.linkTo(parent.end)
            width = Dimension.percent(0.62f)
            height = Dimension.percent(0.2f)
        }.background(colorResource(id = R.color.white)))
    }
}

@Preview(showBackground = true)
@Composable
fun BandPrev(){
    BanderaSuizaCL(Modifier.fillMaxSize())
}
