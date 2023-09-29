package me.mahfuzmunna.wellbeing.screens

import android.os.Handler
import android.os.Looper
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import me.mahfuzmunna.wellbeing.R
import me.mahfuzmunna.wellbeing.navigation.Routes

@Composable
fun AppSplashScreen(navHostController: NavHostController) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.logo_by_freudui),
            contentDescription = "test_logo_fredui",
            modifier = Modifier.size(64.dp)
        )
        Handler(Looper.getMainLooper()).postDelayed({
            navHostController.navigate(Routes.AppHome.routeName)
        }, 3000)
    }
}