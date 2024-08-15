package com.mark.inventory

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Button
import androidx.compose.material3.Text


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column {
                Row {
                    Text("1")
                    Text("1")
                    Text("1")
                    Text("1")
                }
                Text("привет")
                Text("привет")
                Text("привет")
                Text("привет")
                Button(onClick = { }) {
                    Text("текст кнопки")
                }
            }
        }
    }
}


