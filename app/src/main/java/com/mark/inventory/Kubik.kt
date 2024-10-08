package com.mark.inventory


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.navigation.compose.NavHost
import kotlin.random.Random


@Composable
fun KubikScreen() {
    Column(Modifier.fillMaxSize()) {
        var number by rememberSaveable {
            mutableStateOf(1)
        }
        Button({number = Random.nextInt(1,7)
        }) { Text("Бросить кубик") }
        var kartinka by rememberSaveable { mutableStateOf(R.drawable.img_1) }
        kartinka = when(number){
            1 -> R.drawable.img_1
            2 -> R.drawable.img_2
            3 -> R.drawable.img_3
            4 -> R.drawable.img_4
            5 -> R.drawable.img_5
            else -> R.drawable.img_6

        }
        Image(painter = painterResource(kartinka), contentDescription = null)
        Text(text = "Выпало число $number")
    }

}

const val KUBIK_SCREEN = "Kubik_screen"


