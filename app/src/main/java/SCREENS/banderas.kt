package SCREENS

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
import com.ecoversity.banderas.R


@Composable
fun BanderaBrasil(modifier: Modifier = Modifier) {
    val rombosShape = GenericShape { size, _ ->
        moveTo(size.width / 2f, 0f)
        lineTo(size.width, size.height / 2f)
        lineTo(size.width / 2f, size.height)
        lineTo(0f, size.height / 2f)
        close()
    }
    Box(
        modifier = modifier.fillMaxSize().background(colorResource(id = R.color.brasil_verde)),
        contentAlignment = Alignment.Center
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize(0.75f)
                .clip(rombosShape)
                .background(colorResource(id = R.color.brasil_amarillo))
        )
        Image(
            painter = painterResource(id = R.drawable.brsil),
            contentDescription = "Brasil",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(90.dp)
                .clip(CircleShape)
        )
    }
}


@Preview(showBackground = true)
@Composable
fun BandPrev(){
    BanderaBrasil(Modifier.fillMaxSize())
}




