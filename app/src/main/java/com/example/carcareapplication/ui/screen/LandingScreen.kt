package com.example.carcareapplication.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.carcareapplication.R
import com.example.carcareapplication.ui.theme.poppinsFontFamily


@Composable
fun LandingScreen() {
    //al mainFontFamily = FontFamily(mainFont)
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = colorResource(id = R.color.blue_100))
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .wrapContentWidth()
                .padding(vertical = 80.dp, horizontal = 20.dp),
            //.background(color = Color.Cyan), // Added padding to the top and bottom
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.logo),
                contentDescription = "Temp logo",
                modifier = Modifier.size(128.dp)
            )

            Text(text = "CarCare",
                fontSize = 72.sp,
                fontFamily = poppinsFontFamily, fontWeight = FontWeight.ExtraBold)
                //fontWeight = FontWeight.Bold)

            Spacer(Modifier.height(30.dp))

            Text(
                text = "Your all-in-one platform for effortless car maintenance",
                fontSize = 24.sp,

               // fontFamily = mainFontFamily,
                fontFamily = poppinsFontFamily, fontWeight = FontWeight.Black,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(horizontal = 16.dp)
            )

            Spacer(Modifier.height(30.dp))

            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 32.dp, vertical = 16.dp),
                shape = RoundedCornerShape(8.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = colorResource(id = R.color.blue_600)
                )
            ) {
                Text(text = "Login",
                    fontSize = 20.sp,
                    fontFamily = poppinsFontFamily, fontWeight =FontWeight.W500
                )
            }

            Spacer(Modifier.height(30.dp))

            Text(text = "Dont have an account?",
                    fontFamily = poppinsFontFamily, fontWeight =FontWeight.W600 )

            Spacer(Modifier.height(5.dp))

            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 32.dp, vertical = 16.dp),
                shape = RoundedCornerShape(8.dp)
            ) {
                Text(text = "Register",
                    fontSize = 20.sp,
                    fontFamily = poppinsFontFamily, fontWeight =FontWeight.W500 )
            }
        }
    }
}


@Composable
@Preview(showBackground = true)
fun LandingScreenPreview() {
    LandingScreen()
}