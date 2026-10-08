package Screen

import android.R
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ChainStyle
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import com.ecoversity.banderas.R

@Composable
fun BanderaEspanaCL(modifier: Modifier = Modifier) {
    ConstraintLayout(modifier.fillMaxSize()) {
        val (f1, f2, f3) = createRefs()
        createVerticalChain(f1, f2, f3, chainStyle = ChainStyle.Spread)
        Box(Modifier.constrainAs(f1) { width = Dimension.matchParent; height = Dimension.fillToConstraints; verticalWeight = 1f }.background(colorResource(id = R.color.espana_rojo)))
        Box(Modifier.constrainAs(f2) { width = Dimension.matchParent; height = Dimension.fillToConstraints; verticalWeight = 2f }.background(colorResource(id = R.color.espana_amarillo)))
        Box(Modifier.constrainAs(f3) { width = Dimension.matchParent; height = Dimension.fillToConstraints; verticalWeight = 1f }.background(colorResource(id = R.color.espana_rojo)))
    }
}