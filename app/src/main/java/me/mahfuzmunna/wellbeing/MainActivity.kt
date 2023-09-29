package me.mahfuzmunna.wellbeing

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import me.mahfuzmunna.wellbeing.navigation.AppNavGraph
import me.mahfuzmunna.wellbeing.ui.theme.WellbeingTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WellbeingTheme {
                AppNavGraph()
            }
        }
    }
}