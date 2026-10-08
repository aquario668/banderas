package SCREENS

import android.R
import android.text.Layout
import androidx.annotation.Dimension
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.FocusRequester.Companion.createRefs
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ChainStyle
import androidx.constraintlayout.compose.ConstraintLayout
import com.ecoversity.banderas.R


@Composable
fun BanderaMexicoCL(modifier: Modifier = Modifier) {
    ConstraintLayout(modifier.fillMaxSize()) {
        val (f1, f2, f3, escudo) = createRefs()
        createHorizontalChain(f1, f2, f3, chainStyle = ChainStyle.Spread)
        Box(Modifier.constrainAs(f1) { width = Dimension.fillToConstraints; height = Dimension.matchParent; horizontalWeight = 1f }.background(colorResource(id = R.color.mexico_verde)))
        Box(Modifier.constrainAs(f2) { width = Dimension.fillToConstraints; height = Dimension.matchParent; horizontalWeight = 1f }.background(colorResource(id = R.color.white)))
        Box(Modifier.constrainAs(f3) { width = Dimension.fillToConstraints; height = Dimension.matchParent; horizontalWeight = 1f }.background(colorResource(id = R.color.mexico_rojo)))
        Image(
            painter = painterResource(id = R.drawable.mex),
            contentDescription = null,
            modifier = Modifier.constrainAs(escudo) {
                top.linkTo(f2.top)
                bottom.linkTo(f2.bottom)
                start.linkTo(f2.start)
                end.linkTo(f2.end)
                width = Dimension.value(60.dp)
                height = Dimension.value(60.dp)
            }
        )
    }
}




