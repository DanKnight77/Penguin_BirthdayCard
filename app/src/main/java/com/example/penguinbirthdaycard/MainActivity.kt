package com.example.penguinbirthdaycard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.penguinbirthdaycard.ui.theme.PenguinBirthdayCardTheme
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Allow for use of full screen
        enableEdgeToEdge()
        setContent {
            PenguinBirthdayCardTheme {
                //Scaffold will help organize our text/pictures
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(modifier: Modifier = Modifier) {
    //Use column to create a stack of our text/pictures
    //Use horizontal alignment to center everything
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        //Create top of card message
        Text(
            text = "Happy Birthday!",
            fontSize = 45.sp,
            color = Color.Blue,
            modifier = Modifier.padding(bottom = 5.dp)
        )
        //Add our image to the card
        Image(
            painter = painterResource(id = R.drawable.penguin_birthday),
            contentDescription = "Penguin and cake"
        )
        //Display the bottom text for our card
        Text(
            text = "Have an Ice Day!",
            fontSize = 30.sp,
            color = Color.Red,
            modifier = Modifier.padding(top = 5.dp)
        )
    }
}
//Allows us to see preview
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PenguinBirthdayCardTheme {
        Greeting()
    }
}