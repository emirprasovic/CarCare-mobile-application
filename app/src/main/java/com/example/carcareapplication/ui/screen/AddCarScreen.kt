package com.example.carcareapplication.ui.screen

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
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
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
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
fun AddCarScreen() {
    // -> treba novi icon umjesto ovog koji stoji na prazno polje <- //

    // stavit cemo da su sva polja obavezna
    var model by remember { mutableStateOf("") }
    var year by remember { mutableStateOf("") }
    var engine by remember { mutableStateOf("") }
    var fuel by remember { mutableStateOf("") }

    var showError by remember { mutableStateOf(false) } // po defaultu nijedno polje ne prikazuje error

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = colorResource(id = R.color.blue_100))
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .wrapContentWidth()
                .padding(vertical = 120.dp, horizontal = 20.dp),
            //.background(color = Color.Cyan), // Added padding to the top and bottom
            horizontalAlignment = Alignment.CenterHorizontally
        ) {


            Text(text = "Add new car", fontSize = 32.sp, fontWeight = FontWeight.Bold, textAlign = TextAlign.Left, modifier = Modifier.fillMaxWidth())

            Spacer(Modifier.height(30.dp))

            TextField(
                value = model ,
                onValueChange = { model = it},
                enabled = true,
                label = { Text(text = "Make and Model")},
                placeholder = { Text(text = "Audi S7")},
                isError = showError && model.isEmpty(), // ako je error true i ako je polje prazno, eror je true ako je nakon unosa polje ostalo prazno, namjerno sam ostavio i uslov ovdje da je model.isEmpty(), moze i bez toga ovdje
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(8.dp)
            )

            Spacer(Modifier.height(30.dp))

            TextField(
                value = year ,
                onValueChange = { year = it },
                enabled = true,
                label = { Text(text = "Production year")},
                placeholder = { Text(text = "2013")},
                isError = showError && year.isEmpty(),
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(8.dp)
            )

            Spacer(Modifier.height(30.dp))

            TextField(
                value = engine ,
                onValueChange = { engine = it },
                label = { Text(text = "Engine")},
                placeholder = { Text(text = "4.2 TFSI")},
                isError = showError && engine.isEmpty(),
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(8.dp)
            )

            Spacer(Modifier.height(30.dp))

            TextField(
                value = fuel ,
                onValueChange = { fuel = it },
                label = { Text(text = "Fuel type")},
                placeholder = { Text(text = "Petrol")},
                isError = showError && fuel.isEmpty(),
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(8.dp)
            )

            Spacer(Modifier.height(60.dp))

            Button(
                onClick = {
                    showError = model.isEmpty() || year.isEmpty() || engine.isEmpty() || fuel.isEmpty();
                },
                modifier = Modifier
                    .fillMaxWidth(),
                //.padding(horizontal = 32.dp, vertical = 16.dp),
                shape = RoundedCornerShape(8.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = colorResource(id = R.color.blue_600),
                    contentColor = colorResource(id = R.color.blue_800)
                ),
                contentPadding = PaddingValues(vertical = 12.dp)
            ) {
                Text(text = "Confirm", fontSize = 20.sp)
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
                Text(text = "Back", fontSize = 20.sp)
            }
        }
    }
}


@Composable
@Preview(showBackground = true)
fun AddCarScreenPreview() {
    AddCarScreen()
}