package com.example.carcareapplication.ui.screen

import androidx.compose.foundation.BorderStroke
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
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.carcareapplication.R
import com.example.carcareapplication.model.ForumPost
import com.example.carcareapplication.model.ForumPostList
import com.example.carcareapplication.model.MyCarList

@Composable
fun ForumScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = colorResource(id = R.color.blue_200))
            .verticalScroll(rememberScrollState())
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .wrapContentWidth()
                .padding(horizontal = 20.dp)
                .padding(top = 120.dp)
                .padding(bottom = 20.dp),
            //.background(color = Color.Cyan),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "Forum posts", textAlign = TextAlign.Left, fontSize = 32.sp)

            ForumCard(forumPost = ForumPostList.forumPosts[1])

            LazyColumn {
                items(ForumPostList.forumPosts) {
                        post -> ForumCard(forumPost = post)
                }
            }

        }
    }
}

@Composable
fun ForumCard(forumPost: ForumPost) {
    var expanded by remember { mutableStateOf(false) }

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { expanded = !expanded },
    ) {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.fillMaxWidth()
            ) {
                // Text("Make and Model")
                Text(forumPost.user, fontWeight = FontWeight.Bold, fontSize = 16.sp)
                Text(forumPost.createdAt)
            }

            Spacer(modifier = Modifier.height(8.dp))

            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(forumPost.title, fontSize = 18.sp)
            }

            Spacer(modifier = Modifier.height(8.dp))

            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(forumPost.description)
            }


            if (expanded) {
                Spacer(modifier = Modifier.height(8.dp))
                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text("Small Service")
                    Text("186000km")
                }
                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text("DPF Replacement")
                    Text("160000km")
                }
                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text("Oil Change")
                    Text("121345km")
                }
                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text("Brake Fluid Replacement")
                    Text("13000km")
                }
                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text("Timing Belt Replacement")
                    Text("97050km")
                }
                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text("Wheel Alignment")
                    Text("183000km")
                }
                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text("Baterry Replacement")
                    Text("72500km")
                }
                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text("Production year")
                    Text("2013")
                }

                Spacer(modifier = Modifier.height(16.dp))

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
                    border = BorderStroke(2.dp, colorResource(id = R.color.black)),
                    contentPadding = PaddingValues(vertical = 6.dp)
                ) {
                    Text(text = "Update", fontSize = 18.sp)
                }
            }
        }
    }
    Spacer(modifier = Modifier.height(16.dp))
}

@Composable
@Preview(showBackground = true)
fun ForumScreenPreview() {
    ForumScreen()
}