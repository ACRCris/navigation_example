package com.example.navigation_example

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.navigation_example.ui.theme.Navigation_exampleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HelloComponse()
        }
    }
}
@Composable
fun HelloComponse(){
    Navigation_exampleTheme {
        Card(
            elevation = 4.dp,
            shape = MaterialTheme.shapes.large
        ) {
            Column(
                modifier = Modifier.padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.platzi),
                    contentDescription = "Android Logo",
                    modifier = Modifier.size(40.dp, 40.dp)
                )
                Text(text = "Este curso es lo mejor!!", style = MaterialTheme.typography.h4)
                Text(text = "Curso de Jetpack Compose", style = MaterialTheme.typography.body1)
                Button(onClick = {

                }, modifier = Modifier.padding(top = 16.dp),
                shape = MaterialTheme.shapes.medium) {
                    Text(text = "Click Me")
                }
            }
        }
    }



}

@Preview(showBackground = true)
@Composable
fun HelloComponsePreview(){
    HelloComponse()
}



