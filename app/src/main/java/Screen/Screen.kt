package Screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.ecoversity.banderas.R

@Composable
fun BanderaEsp(modifier: Modifier = Modifier) {
    Column(modifier = Modifier.fillMaxSize()) {
        Row (modifier = Modifier
            .weight(1f)
            .fillMaxWidth()
            .background(Color(0xFFAA151B)))
        {}
        Row (modifier = Modifier
            .weight(2f)
            .fillMaxWidth()
            .background(Color(0xFFF1BF00)),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start
        )
        {
            Image(
                painter = painterResource(id = R.drawable.eps1),
                contentDescription = "bandera espana",
                modifier = Modifier.size(250.dp)

            )
        }
        Row(modifier = Modifier
            .weight(1f)
            .fillMaxWidth()
            .background(Color(0xFFAA151B)))
        {}
    }

}