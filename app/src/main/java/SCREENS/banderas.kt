package SCREENS

import android.R
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.GenericShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import com.ecoversity.banderas.R


@Composable
fun BanderaJaponCL(modifier: Modifier = Modifier) {
    ConstraintLayout(modifier.fillMaxSize().background(colorResource(id = R.color.white))) {
        val circulo = createRef()
        Box(Modifier.constrainAs(circulo) {
            top.linkTo(parent.top)
            bottom.linkTo(parent.bottom)
            start.linkTo(parent.start)
            end.linkTo(parent.end)
            width = Dimension.value(100.dp)
            height = Dimension.value(100.dp)
        }.clip(CircleShape).background(colorResource(id = R.color.japon_rojo)))
    }
}


@Preview(showBackground = true)
@Composable
fun BandPrev(){
    BanderaJaponCL(Modifier.fillMaxSize())
}




