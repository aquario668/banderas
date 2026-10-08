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
import androidx.compose.foundation.layout.padding
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
import androidx.constraintlayout.compose.ConstrainedLayoutReference
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import com.ecoversity.banderas.R



@Composable
fun GPA() {
    val T = Color.Transparent
    val B = Color.Black
    val O = Color(0xFFF29B38)
    val C = Color(0xFFFDE4B3)
    val RO= Color(0xFFF238E9)

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .aspectRatio(1f)
            .padding(16.dp)
    ) {
        Row(modifier = Modifier.weight(1f).fillMaxWidth()) {
            Box(modifier = Modifier.weight(1f).fillMaxHeight().background(T))
            Box(modifier = Modifier.weight(1f).fillMaxHeight().background(T))
            Box(modifier = Modifier.weight(1f).fillMaxHeight().background(T))
            Box(modifier = Modifier.weight(1f).fillMaxHeight().background(O))
            Box(modifier = Modifier.weight(1f).fillMaxHeight().background(T))
            Box(modifier = Modifier.weight(1f).fillMaxHeight().background(T))
            Box(modifier = Modifier.weight(1f).fillMaxHeight().background(T))
            Box(modifier = Modifier.weight(1f).fillMaxHeight().background(O))
            Box(modifier = Modifier.weight(1f).fillMaxHeight().background(T))
            Box(modifier = Modifier.weight(1f).fillMaxHeight().background(T))

        }
        Row(modifier = Modifier.weight(1f).fillMaxWidth()) {
            Box(modifier = Modifier.weight(1f).fillMaxHeight().background(T))
            Box(modifier = Modifier.weight(1f).fillMaxHeight().background(T))
            Box(modifier = Modifier.weight(1f).fillMaxHeight().background(O))
            Box(modifier = Modifier.weight(1f).fillMaxHeight().background(C))
            Box(modifier = Modifier.weight(1f).fillMaxHeight().background(T))
            Box(modifier = Modifier.weight(1f).fillMaxHeight().background(T))
            Box(modifier = Modifier.weight(1f).fillMaxHeight().background(O))
            Box(modifier = Modifier.weight(1f).fillMaxHeight().background(C))
            Box(modifier = Modifier.weight(1f).fillMaxHeight().background(T))
            Box(modifier = Modifier.weight(1f).fillMaxHeight().background(T))

        }
        Row(modifier = Modifier.weight(1f).fillMaxWidth()) {
            Box(modifier = Modifier.weight(1f).fillMaxHeight().background(T))
            Box(modifier = Modifier.weight(1f).fillMaxHeight().background(T))
            Box(modifier = Modifier.weight(1f).fillMaxHeight().background(O))
            Box(modifier = Modifier.weight(1f).fillMaxHeight().background(C))
            Box(modifier = Modifier.weight(1f).fillMaxHeight().background(T))
            Box(modifier = Modifier.weight(1f).fillMaxHeight().background(T))
            Box(modifier = Modifier.weight(1f).fillMaxHeight().background(O))
            Box(modifier = Modifier.weight(1f).fillMaxHeight().background(C))
            Box(modifier = Modifier.weight(1f).fillMaxHeight().background(T))
            Box(modifier = Modifier.weight(1f).fillMaxHeight().background(T))

        }
        Row(modifier = Modifier.weight(1f).fillMaxWidth()) {
            Box(modifier = Modifier.weight(1f).fillMaxHeight().background(T))
            Box(modifier = Modifier.weight(1f).fillMaxHeight().background(O))
            Box(modifier = Modifier.weight(1f).fillMaxHeight().background(O))
            Box(modifier = Modifier.weight(1f).fillMaxHeight().background(O))
            Box(modifier = Modifier.weight(1f).fillMaxHeight().background(O))
            Box(modifier = Modifier.weight(1f).fillMaxHeight().background(O))
            Box(modifier = Modifier.weight(1f).fillMaxHeight().background(O))
            Box(modifier = Modifier.weight(1f).fillMaxHeight().background(T))
        }
        Row(modifier = Modifier.weight(1f).fillMaxWidth()) {
            Box(modifier = Modifier.weight(1f).fillMaxHeight().background(T))
            Box(modifier = Modifier.weight(1f).fillMaxHeight().background(O))
            Box(modifier = Modifier.weight(1f).fillMaxHeight().background(B))
            Box(modifier = Modifier.weight(1f).fillMaxHeight().background(O))
            Box(modifier = Modifier.weight(1f).fillMaxHeight().background(O))
            Box(modifier = Modifier.weight(1f).fillMaxHeight().background(B))
            Box(modifier = Modifier.weight(1f).fillMaxHeight().background(O))
            Box(modifier = Modifier.weight(1f).fillMaxHeight().background(T))
        }
        Row(modifier = Modifier.weight(1f).fillMaxWidth()) {
            Box(modifier = Modifier.weight(1f).fillMaxHeight().background(T))
            Box(modifier = Modifier.weight(1f).fillMaxHeight().background(O))
            Box(modifier = Modifier.weight(1f).fillMaxHeight().background(C))
            Box(modifier = Modifier.weight(1f).fillMaxHeight().background(RO))
            Box(modifier = Modifier.weight(1f).fillMaxHeight().background(RO))
            Box(modifier = Modifier.weight(1f).fillMaxHeight().background(C))
            Box(modifier = Modifier.weight(1f).fillMaxHeight().background(O))
            Box(modifier = Modifier.weight(1f).fillMaxHeight().background(T))
        }
        Row(modifier = Modifier.weight(1f).fillMaxWidth()) {
            Box(modifier = Modifier.weight(1f).fillMaxHeight().background(O))
            Box(modifier = Modifier.weight(1f).fillMaxHeight().background(O))
            Box(modifier = Modifier.weight(1f).fillMaxHeight().background(B))
            Box(modifier = Modifier.weight(1f).fillMaxHeight().background(C))
            Box(modifier = Modifier.weight(1f).fillMaxHeight().background(C))
            Box(modifier = Modifier.weight(1f).fillMaxHeight().background(B))
            Box(modifier = Modifier.weight(1f).fillMaxHeight().background(O))
            Box(modifier = Modifier.weight(1f).fillMaxHeight().background(T))
        }
        Row(modifier = Modifier.weight(1f).fillMaxWidth()) {
            Box(modifier = Modifier.weight(1f).fillMaxHeight().background(O))
            Box(modifier = Modifier.weight(1f).fillMaxHeight().background(B))
            Box(modifier = Modifier.weight(1f).fillMaxHeight().background(C))
            Box(modifier = Modifier.weight(1f).fillMaxHeight().background(C))
            Box(modifier = Modifier.weight(1f).fillMaxHeight().background(C))
            Box(modifier = Modifier.weight(1f).fillMaxHeight().background(C))
            Box(modifier = Modifier.weight(1f).fillMaxHeight().background(B))
            Box(modifier = Modifier.weight(1f).fillMaxHeight().background(T))
        }
        Row(modifier = Modifier.weight(1f).fillMaxWidth()) {
            Box(modifier = Modifier.weight(1f).fillMaxHeight().background(T))
            Box(modifier = Modifier.weight(1f).fillMaxHeight().background(O))
            Box(modifier = Modifier.weight(1f).fillMaxHeight().background(O))
            Box(modifier = Modifier.weight(1f).fillMaxHeight().background(O))
            Box(modifier = Modifier.weight(1f).fillMaxHeight().background(O))
            Box(modifier = Modifier.weight(1f).fillMaxHeight().background(O))
            Box(modifier = Modifier.weight(1f).fillMaxHeight().background(O))
            Box(modifier = Modifier.weight(1f).fillMaxHeight().background(T))
        }
        Row(modifier = Modifier.weight(1f).fillMaxWidth()) {
            Box(modifier = Modifier.weight(1f).fillMaxHeight().background(T))
            Box(modifier = Modifier.weight(1f).fillMaxHeight().background(T))
            Box(modifier = Modifier.weight(1f).fillMaxHeight().background(B))
            Box(modifier = Modifier.weight(1f).fillMaxHeight().background(O))
            Box(modifier = Modifier.weight(1f).fillMaxHeight().background(O))
            Box(modifier = Modifier.weight(1f).fillMaxHeight().background(B))
            Box(modifier = Modifier.weight(1f).fillMaxHeight().background(T))
            Box(modifier = Modifier.weight(1f).fillMaxHeight().background(T))
        }}}

@Preview(showBackground = true)
@Composable
fun BandPrev(){
    GPA()
}
