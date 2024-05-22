package com.example.carcareapplication.ui.screen

import android.util.Patterns
import android.util.Patterns.EMAIL_ADDRESS
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
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
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
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
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.carcareapplication.R
//import com.example.carcareapplication.ui.theme.poppinsFontFamily

@Composable
fun RegisterScreen() {

    var firstName by remember {
        mutableStateOf("")
    }
    var lastName by remember {
        mutableStateOf("")
    }
    var email by remember {
        mutableStateOf("")
    }
    var checkEmail by remember {
        mutableStateOf(true)
    }
    var password by remember {
        mutableStateOf("")
    }
    var repeatPassword by remember {
        mutableStateOf("")
    }
    var showPassword by remember {
        mutableStateOf(false)
    }
    var checkPassword by remember {
        mutableStateOf(true)
    }
    var nameError by remember {
        mutableStateOf(false)
    }
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
                .padding(top = 120.dp)
                .padding(bottom = 20.dp),
            //.background(color = Color.Cyan), // Added padding to the top and bottom
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "Register", fontSize = 32.sp,
                fontFamily = FontFamily.Monospace,
                fontWeight = FontWeight.ExtraBold,
                textAlign = TextAlign.Left,
                modifier = Modifier.fillMaxWidth())

            Spacer(Modifier.height(30.dp))

            Row(
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                TextField(
                    value = firstName,
                    onValueChange = { firstName = it},
                    label = { Text(text = "First name")},
                    enabled = true,
                    placeholder = { Text(text = "John")},
                    isError = nameError && firstName.isEmpty(),
                    modifier = Modifier
                        .weight(1f)
                        .padding(end = 4.dp),
                    shape = RoundedCornerShape(8.dp),
                    keyboardOptions = KeyboardOptions.Default.copy(
                        imeAction = ImeAction.Next)
                )

                Spacer(modifier = Modifier.width(10.dp))

                TextField(
                    value = lastName,
                    onValueChange = { lastName = it},
                    enabled = true,
                    label = { Text(text = "Last name")},
                    placeholder = { Text(text = "Doe")},
                    isError = nameError && lastName.isEmpty(),
                    modifier = Modifier
                        .weight(1f),
                    shape = RoundedCornerShape(8.dp),
                    keyboardOptions = KeyboardOptions.Default.copy(
                        imeAction = ImeAction.Next)
                )
            }

            Spacer(modifier = Modifier.height(20.dp))

            TextField(
                value = email ,
                onValueChange = { email = it},
                enabled = true,
                label = { Text(text = "Email")},
                placeholder = { Text(text = "example@example.com")},
                isError = !checkEmail,
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(8.dp),
                keyboardOptions = KeyboardOptions.Default.copy(
                    imeAction = ImeAction.Next)
            )

            Spacer(Modifier.height(20.dp))

            TextField(
                value = password ,
                onValueChange = { password = it },
                enabled = true,
                label = { Text(text = "Password")},
                visualTransformation = if(showPassword) {
                    VisualTransformation.None
                }else{
                    PasswordVisualTransformation()
                },
                isError = !checkPassword,
                trailingIcon = {  Icon(
                    painter = if(showPassword){
                        painterResource(id = R.drawable.eye)
                    }
                    else{
                        painterResource(id = R.drawable.eye_crossed)
                    },
                    contentDescription = "",
                    tint = Color.Black,
                    modifier = Modifier
                        .size(24.dp)
                        .clickable(onClick = { showPassword = !showPassword }) )

                },
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(8.dp),
                keyboardOptions = KeyboardOptions.Default.copy(
                    imeAction = ImeAction.Next)
            )

            Spacer(Modifier.height(20.dp))

            TextField(
                value = repeatPassword,
                onValueChange = { repeatPassword = it },
                enabled = true,
                label = { Text(text = "Repeat password")},
                visualTransformation = PasswordVisualTransformation(),
                isError = !checkPassword,
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(8.dp),
                keyboardOptions = KeyboardOptions.Default.copy(
                    keyboardType = KeyboardType.Password,
                    imeAction = ImeAction.Done)
            )

            Spacer(Modifier.height(60.dp))

            Button(
                onClick = {
                    checkEmail = checkEmailForRegister(email);
                    checkPassword = password == repeatPassword;
                    nameError = firstName.isEmpty() || lastName.isEmpty()
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
                Text(text = "Create account", fontSize = 20.sp)
            }

            Spacer(Modifier.height(30.dp))

            Button(
                onClick = {},
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
fun checkEmailForRegister(email: String): Boolean{
    return EMAIL_ADDRESS.matcher(email).matches()
}

@Composable
@Preview(showBackground = true)
fun RegisterScreenPreview() {
    RegisterScreen()
}