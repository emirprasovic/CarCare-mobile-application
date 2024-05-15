package com.example.carcareapplication.ui.screen

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.carcareapplication.R

@Composable
fun UpdateCarScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = colorResource(id = R.color.blue_200))
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .wrapContentWidth()
                .padding(horizontal = 20.dp)
                .padding(top = 120.dp),
            //.background(color = Color.Cyan), // Added padding to the top and bottom
            horizontalAlignment = Alignment.CenterHorizontally
        ) {


            Text(text = "Update car information", fontSize = 32.sp, fontWeight = FontWeight.Bold, textAlign = TextAlign.Left, modifier = Modifier.fillMaxWidth())

            Spacer(Modifier.height(30.dp))

            TextField(
                value = "" ,
                onValueChange = {},
                label = { Text(text = "Make and Model")},
                placeholder = { Text(text = "Audi S7")},
                isError = false,
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(8.dp)
            )

            Spacer(Modifier.height(30.dp))

            TextField(
                value = "" ,
                onValueChange = {},
                label = { Text(text = "Production year")},
                placeholder = { Text(text = "2013")},
                isError = false,
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(8.dp)
            )

            Spacer(Modifier.height(30.dp))

            TextField(
                value = "" ,
                onValueChange = {},
                label = { Text(text = "Engine")},
                placeholder = { Text(text = "4.2 TFSI")},
                isError = false,
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(8.dp)
            )

            Spacer(Modifier.height(30.dp))

            TextField(
                value = "" ,
                onValueChange = {},
                label = { Text(text = "Fuel type")},
                placeholder = { Text(text = "Petrol")},
                isError = false,
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(8.dp)
            )

            Spacer(Modifier.height(30.dp))

            Row(
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                TextField(
                    value = "",
                    onValueChange = {},
                    label = { Text(text = "Baterry Replacement", fontSize = 12.sp)},
                    placeholder = { Text(text = "John")},
                    isError = false,
                    modifier = Modifier
                        .weight(1f)
                        .padding(end = 4.dp),
                    shape = RoundedCornerShape(8.dp)
                )

                Spacer(modifier = Modifier.width(10.dp))

                TextField(
                    value = "",
                    onValueChange = {},
                    label = { Text(text = "Small Service")},
                    placeholder = { Text(text = "Doe")},
                    isError = false,
                    modifier = Modifier
                        .weight(1f),
                    shape = RoundedCornerShape(8.dp)
                )
            }

            Spacer(modifier = Modifier.height(10.dp))

            Row(
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                TextField(
                    value = "",
                    onValueChange = {},
                    label = { Text(text = "Oil Change", fontSize = 12.sp)},
                    placeholder = { Text(text = "John")},
                    isError = false,
                    modifier = Modifier
                        .weight(1f)
                        .padding(end = 4.dp),
                    shape = RoundedCornerShape(8.dp)
                )

                Spacer(modifier = Modifier.width(10.dp))

                TextField(
                    value = "",
                    onValueChange = {},
                    label = { Text(text = "Tire Rotation")},
                    placeholder = { Text(text = "Doe")},
                    isError = false,
                    modifier = Modifier
                        .weight(1f),
                    shape = RoundedCornerShape(8.dp)
                )
            }

            Spacer(Modifier.height(30.dp))

            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .fillMaxWidth(),
                //.padding(horizontal = 32.dp, vertical = 16.dp),
                shape = RoundedCornerShape(8.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Transparent,
                    contentColor = colorResource(R.color.black)
                ),
                // border = BorderStroke(3.dp, MaterialTheme.colorScheme.primary),
                border = BorderStroke(3.dp, colorResource(id = R.color.black)),
                contentPadding = PaddingValues(vertical = 12.dp)
            ) {
                Text(text = "Update", fontSize = 20.sp)
            }
        }
    }
}


@Composable
@Preview(showBackground = true)
fun UpdateCarScreenPreview() {
    UpdateCarScreen()
}