package com.example.composetutorial

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import android.content.res.Configuration
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.composetutorial.ui.theme.ComposeTutorialTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeTutorialTheme{
                Surface(modifier = Modifier.fillMaxSize()){
                    TnnsPage()
                }
            }
        }
    }
}

@Composable
fun TnnsPage() {
    val scrollState = rememberScrollState()
    Column(modifier = Modifier.verticalScroll(scrollState)){
        TopBar()
        Qualifaying()
        Bar("WHO'LL WIN?","Tap to vote")
        WhollWin()
        Bar("HEAD TO HEAD",null)
        HeadToHead()
        Bar("FORM","Most to least recent")
        MyForm()
        Bar("GAME INFO",null)
        GameInfo()
        Bar("TOURNAMENT INFO",null)
        TournamentInfo()
    }
}

@Composable
fun TopBar(){
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(45, 40, 215))
            .height(50.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(R.drawable.left_circle),
            contentDescription = null,
            modifier = Modifier
                .size(30.dp, 30.dp)
        )
        Image(
            painter = painterResource(R.drawable.notification_bell),
            contentDescription = null,
            modifier = Modifier
                .size(30.dp, 30.dp)
            )
         Column(modifier = Modifier.fillMaxWidth(),
             horizontalAlignment = Alignment.End) {
             Image(
                 painter = painterResource(R.drawable.star),
                 contentDescription = null,
                 modifier = Modifier
                     .size(30.dp, 30.dp)
             )
         }

    }
}

@Composable
fun Bar(firstText:String, secondText: String?){
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(45, 40, 215))
            .height(30.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Spacer(modifier = Modifier.width(15.dp))
        Text(
            text = firstText,
            fontWeight = FontWeight.ExtraBold,
        )
        if (secondText != null) { //Check for is there a text
            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.End
            ) {
                Row {
                    Text(
                        text = secondText,
                        color = Color.Gray
                    )
                    Spacer(modifier = Modifier.width(15.dp))
                }
            }
        }
    }
}

@Composable
fun Qualifaying(){
    Row {
        Spacer(modifier = Modifier.width(15.dp))
        Column{
            Spacer(modifier = Modifier.height(5.dp))
            Text(
                text = "Qualifying - Mixed Singles",
                color = Color.Gray
            )
            Spacer(modifier = Modifier.height(10.dp))
            Text(
                text = "Lucia Bronzetti",
                fontWeight = FontWeight.Bold
            )
            Spacer(modifier = Modifier.height(3.dp))
            Text(
                text = "Ulrikke Eikeri",
                fontWeight = FontWeight.Bold
            )
            Spacer(modifier = Modifier.height(5.dp))
            Text(
                text = "12:20 ÖS",
                color = Color.Gray
            )
            Spacer(modifier = Modifier.height(5.dp))
        }
    }

}

@Composable
fun WhollWin(){
    Row(
        horizontalArrangement = Arrangement.SpaceAround,
        modifier = Modifier
            .fillMaxWidth()
            .height(55.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = "Bronzetti",
            fontWeight = FontWeight.Bold,
            fontSize = 18.sp
        )
        Text(
            text = "Eikeri",
            fontWeight = FontWeight.Bold,
            fontSize = 18.sp
        )
    }
}

@Composable
fun HeadToHead(){
    Row {
        Spacer(modifier = Modifier.width(15.dp))
        Column {
            Spacer(modifier = Modifier.height(5.dp))
            Text(
                text = "H2H Record",
                color = Color.Gray
            )
            Text(
                text = "0-0",
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = "Tied",
                color = Color.Gray
            )
            Spacer(modifier = Modifier.height(5.dp))
        }
    }
}

@Composable
fun MyForm(){
    Row {
        Spacer(modifier = Modifier.width(15.dp))
        Column {
            Column {
                Spacer(modifier = Modifier.height(5.dp))
                Text(
                    text = "Lucia",
                    color = Color.Gray,
                    fontSize = 14.sp
                )
                Text(
                    text = "BRONZETTI",
                    fontWeight = FontWeight.Bold
                )
                Spacer(modifier = Modifier.height(5.dp))
            }
            Column {
                Spacer(modifier = Modifier.height(5.dp))
                Text(
                    text = "Ulrikke",
                    color = Color.Gray,
                    fontSize = 14.sp
                )
                Text(
                    text = "EIKERI",
                    fontWeight = FontWeight.Bold
                )
                Spacer(modifier = Modifier.height(5.dp))
            }
        }

    }
}

@Composable
fun GameInfo(){
    Row {
        Spacer(modifier = Modifier.width(15.dp))
        Column {
            Spacer(modifier = Modifier.height(5.dp))
            Row {
                Text(
                    text = "Star Time (Local Time)",
                    color = Color.Gray
                )
                Column(modifier = Modifier.fillMaxWidth(),
                    horizontalAlignment = Alignment.End
                ) {
                    Row() {
                        Text(text = "Sal, 3 Oca, 12:20 ÖS")
                        Spacer(modifier = Modifier.width(15.dp))
                    }
                }
            }
            Row {
                Text(
                    text = "Start Time (Your Time)",
                    color = Color.Gray
                )
                Column(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalAlignment = Alignment.End
                ) {
                    Row() {
                        Text(text = "Sal, 3 Oca, 4:20 ÖÖ")
                        Spacer(modifier = Modifier.width(15.dp))
                    }
                }
            }
            Row {
                Text(
                    text = "Court",
                    color = Color.Gray
                )
                Column(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalAlignment = Alignment.End
                ) {
                    Row() {
                        Text(text = "PAT RAFTER ARENA")
                        Spacer(modifier = Modifier.width(15.dp))
                    }
                }
            }
            Spacer(modifier = Modifier.height(5.dp))
        }
    }
}

@Composable
fun TournamentInfo() {
    Row {
        Spacer(modifier = Modifier.width(15.dp))
        Column {
            Spacer(modifier = Modifier.height(5.dp))
            Row {
                Text(
                    text = "Name",
                    color = Color.Gray
                )
                Column(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalAlignment = Alignment.End
                ) {
                    Row() {
                        Text(text = "United Cup")
                        Spacer(modifier = Modifier.width(15.dp))
                    }

                }

            }
            Row {
                Text(
                    text = "Tour",
                    color = Color.Gray
                )
                Column(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalAlignment = Alignment.End
                ) {
                    Row() {
                        Text(text = "United Cup")
                        Spacer(modifier = Modifier.width(15.dp))
                    }
                }
            }
            Spacer(modifier = Modifier.height(5.dp))
        }
    }
}

@Preview(
    uiMode = Configuration.UI_MODE_NIGHT_YES,
    showBackground = true,
    name = "Dark Mode"
)
@Composable
fun DefaultPreview() {
    ComposeTutorialTheme{
        Surface(modifier = Modifier.fillMaxSize()){
            TnnsPage()
        }
    }
}
