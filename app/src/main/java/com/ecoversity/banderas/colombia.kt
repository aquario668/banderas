package com.ecoversity.banderas

import android.R
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.constraintlayout.compose.ChainStyle
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import com.ecoversity.banderas.ui.theme.BanderasTheme


@Composable
fun BanderaColombiaCL(modifier: Modifier = Modifier) {
    ConstraintLayout(modifier.fillMaxSize()) {
        val (f1, f2, f3) = createRefs()
        createVerticalChain(f1, f2, f3, chainStyle = ChainStyle.Spread)
        Box(Modifier.constrainAs(f1) { width = Dimension.matchParent; height = Dimension.fillToConstraints; verticalWeight = 2f }.background(colorResource(id = R.color.colombia_amarillo)))
        Box(Modifier.constrainAs(f2) { width = Dimension.matchParent; height = Dimension.fillToConstraints; verticalWeight = 1f }.background(colorResource(id = R.color.colombia_azul)))
        Box(Modifier.constrainAs(f3) { width = Dimension.matchParent; height = Dimension.fillToConstraints; verticalWeight = 1f }.background(colorResource(id = R.color.colombia_rojo)))
    }
}
