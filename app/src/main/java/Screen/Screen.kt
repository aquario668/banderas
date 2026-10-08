package Screen

import android.R
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.constraintlayout.compose.ChainStyle
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension

@Composable
fun BanderaItaliaCL(modifier: Modifier = Modifier) {
    ConstraintLayout(modifier.fillMaxSize()) {
        val (f1, f2, f3) = createRefs()
        createHorizontalChain(f1, f2, f3, chainStyle = ChainStyle.Spread)
        Box(Modifier.constrainAs(f1) { width = Dimension.fillToConstraints; height = Dimension.matchParent; horizontalWeight = 1f }.background(colorResource(id = R.color.italia_verde)))
        Box(Modifier.constrainAs(f2) { width = Dimension.fillToConstraints; height = Dimension.matchParent; horizontalWeight = 1f }.background(colorResource(id = R.color.white)))
        Box(Modifier.constrainAs(f3) { width = Dimension.fillToConstraints; height = Dimension.matchParent; horizontalWeight = 1f }.background(colorResource(id = R.color.italia_rojo)))
    }
}
