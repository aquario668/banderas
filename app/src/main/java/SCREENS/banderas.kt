package SCREENS

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
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

    ConstraintLayout(
        modifier = Modifier
            .fillMaxWidth()
            .aspectRatio(1f)
            .padding(16.dp)
    ) {
        val b00 = createRef(); val b01 = createRef(); val b02 = createRef(); val b03 = createRef(); val b04 = createRef(); val b05 = createRef(); val b06 = createRef(); val b07 = createRef()
        val b10 = createRef(); val b11 = createRef(); val b12 = createRef(); val b13 = createRef(); val b14 = createRef(); val b15 = createRef(); val b16 = createRef(); val b17 = createRef()
        val b20 = createRef(); val b21 = createRef(); val b22 = createRef(); val b23 = createRef(); val b24 = createRef(); val b25 = createRef(); val b26 = createRef(); val b27 = createRef()
        val b30 = createRef(); val b31 = createRef(); val b32 = createRef(); val b33 = createRef(); val b34 = createRef(); val b35 = createRef(); val b36 = createRef(); val b37 = createRef()
        val b40 = createRef(); val b41 = createRef(); val b42 = createRef(); val b43 = createRef(); val b44 = createRef(); val b45 = createRef(); val b46 = createRef(); val b47 = createRef()
        val b50 = createRef(); val b51 = createRef(); val b52 = createRef(); val b53 = createRef(); val b54 = createRef(); val b55 = createRef(); val b56 = createRef(); val b57 = createRef()
        val b60 = createRef(); val b61 = createRef(); val b62 = createRef(); val b63 = createRef(); val b64 = createRef(); val b65 = createRef(); val b66 = createRef(); val b67 = createRef()
        val b70 = createRef(); val b71 = createRef(); val b72 = createRef(); val b73 = createRef(); val b74 = createRef(); val b75 = createRef(); val b76 = createRef(); val b77 = createRef()

        createHorizontalChain(b00, b01, b02, b03, b04, b05, b06, b07, chainStyle = ChainStyle.Spread)
        createHorizontalChain(b10, b11, b12, b13, b14, b15, b16, b17, chainStyle = ChainStyle.Spread)
        createHorizontalChain(b20, b21, b22, b23, b24, b25, b26, b27, chainStyle = ChainStyle.Spread)
        createHorizontalChain(b30, b31, b32, b33, b34, b35, b36, b37, chainStyle = ChainStyle.Spread)
        createHorizontalChain(b40, b41, b42, b43, b44, b45, b46, b47, chainStyle = ChainStyle.Spread)
        createHorizontalChain(b50, b51, b52, b53, b54, b55, b56, b57, chainStyle = ChainStyle.Spread)
        createHorizontalChain(b60, b61, b62, b63, b64, b65, b66, b67, chainStyle = ChainStyle.Spread)
        createHorizontalChain(b70, b71, b72, b73, b74, b75, b76, b77, chainStyle = ChainStyle.Spread)

        createVerticalChain(b00, b10, b20, b30, b40, b50, b60, b70, chainStyle = ChainStyle.Spread)
        createVerticalChain(b01, b11, b21, b31, b41, b51, b61, b71, chainStyle = ChainStyle.Spread)
        createVerticalChain(b02, b12, b22, b32, b42, b52, b62, b72, chainStyle = ChainStyle.Spread)
        createVerticalChain(b03, b13, b23, b33, b43, b53, b63, b73, chainStyle = ChainStyle.Spread)
        createVerticalChain(b04, b14, b24, b34, b44, b54, b64, b74, chainStyle = ChainStyle.Spread)
        createVerticalChain(b05, b15, b25, b35, b45, b55, b65, b75, chainStyle = ChainStyle.Spread)
        createVerticalChain(b06, b16, b26, b36, b46, b56, b66, b76, chainStyle = ChainStyle.Spread)
        createVerticalChain(b07, b17, b27, b37, b47, b57, b67, b77, chainStyle = ChainStyle.Spread)

        val applyFlex: (ConstrainedLayoutReference, Color) -> Modifier = { ref, color ->
            Modifier
                .constrainAs(ref) {
                    width = Dimension.fillToConstraints
                    height = Dimension.fillToConstraints
                }
                .background(color)
        }

        Box(applyFlex(b00, T)); Box(applyFlex(b01, O)); Box(applyFlex(b02, O)); Box(applyFlex(b03, T)); Box(applyFlex(b04, T)); Box(applyFlex(b05, O)); Box(applyFlex(b06, O)); Box(applyFlex(b07, T))
        Box(applyFlex(b10, T)); Box(applyFlex(b11, O)); Box(applyFlex(b12, O)); Box(applyFlex(b13, O)); Box(applyFlex(b14, O)); Box(applyFlex(b15, O)); Box(applyFlex(b16, O)); Box(applyFlex(b17, T))
        Box(applyFlex(b20, T)); Box(applyFlex(b21, O)); Box(applyFlex(b22, B)); Box(applyFlex(b23, O)); Box(applyFlex(b24, O)); Box(applyFlex(b25, B)); Box(applyFlex(b26, O)); Box(applyFlex(b27, T))
        Box(applyFlex(b30, T)); Box(applyFlex(b31, O)); Box(applyFlex(b32, C)); Box(applyFlex(b33, B)); Box(applyFlex(b34, B)); Box(applyFlex(b35, C)); Box(applyFlex(b36, O)); Box(applyFlex(b37, T))
        Box(applyFlex(b40, O)); Box(applyFlex(b41, O)); Box(applyFlex(b42, C)); Box(applyFlex(b43, C)); Box(applyFlex(b44, C)); Box(applyFlex(b45, C)); Box(applyFlex(b46, O)); Box(applyFlex(b47, T))
        Box(applyFlex(b50, O)); Box(applyFlex(b51, O)); Box(applyFlex(b52, C)); Box(applyFlex(b53, C)); Box(applyFlex(b54, C)); Box(applyFlex(b55, C)); Box(applyFlex(b56, O)); Box(applyFlex(b57, T))
        Box(applyFlex(b60, T)); Box(applyFlex(b61, O)); Box(applyFlex(b62, O)); Box(applyFlex(b63, O)); Box(applyFlex(b64, O)); Box(applyFlex(b65, O)); Box(applyFlex(b66, O)); Box(applyFlex(b67, T))
        Box(applyFlex(b70, T)); Box(applyFlex(b71, T)); Box(applyFlex(b72, B)); Box(applyFlex(b73, O)); Box(applyFlex(b74, O)); Box(applyFlex(b75, B)); Box(applyFlex(b76, T)); Box(applyFlex(b77, T))
    }
}

@Preview(showBackground = true)
@Composable
fun BandPrev(){
    GPA()
}
