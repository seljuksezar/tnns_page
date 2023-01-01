package com.selcuksezer.tennis_page

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.selcuksezer.tennis_page.ui.theme.Tennis_PageTheme
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import android.content.res.Configuration
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Tennis_PageTheme{
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
        Row {
            Spacer(modifier = Modifier.width(10.dp))
            Qualifaying()
        }
        Bar("WHO'LL WIN?","Tap to Vote")
        WhollWin()
        Bar("HEAD TO HEAD",null)
        HeadToHead()
        Bar("FORM","Most to Least Recent")
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
        Image(
            painter = painterResource(R.drawable.star),
            contentDescription = null,
            modifier = Modifier
                .size(30.dp, 30.dp)
        )
    }
}

@Composable
fun Bar(firstSentence:String, secondSentence: String?){
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(45, 40, 215))
            .height(30.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Spacer(modifier = Modifier.width(15.dp))
        Text(
            text = firstSentence,
            fontWeight = FontWeight.ExtraBold,
            )
        if (secondSentence != null) { //Check for is there text
            Row(horizontalArrangement = Arrangement.End) {
                Text(
                    text = secondSentence,
                    color = Color.Gray
                )
            }
        }
    }
}

@Composable
fun Qualifaying(){
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
        Spacer(modifier = Modifier.height(3.dp))
        Text(text = "12:20 ÖS")
        Spacer(modifier = Modifier.height(5.dp))
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
        Column() {
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
            Column() {
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
            Column() {
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
        Column() {
            Spacer(modifier = Modifier.height(5.dp))
            Row() {
                Text(
                    text = "Star Time (Local Time)",
                    color = Color.Gray
                )
                Text(text = "Sal, 3 Oca, 12:20 ÖS")
            }
            Row() {
                Text(
                    text = "Start Time (Your Time)",
                    color = Color.Gray
                )
                Text(text = "Sal, 3 Oca, 4:20 ÖÖ")
            }
            Row() {
                Text(
                    text = "Court",
                    color = Color.Gray
                )
                Text(text = "PAT RAFTER ARENA")
            }

            Spacer(modifier = Modifier.height(5.dp))
        }
    }
}

@Composable
fun TournamentInfo() {
    Row {
        Spacer(modifier = Modifier.width(15.dp))
        Column() {
            Spacer(modifier = Modifier.height(5.dp))
            Row() {
                Text(
                    text = "Name",
                    color = Color.Gray
                )
                Text(text = "United Cup")
            }
            Row() {
                Text(
                    text = "Tour",
                    color = Color.Gray
                )
                Text(text = "United Cup")
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
    Tennis_PageTheme{
        Surface(modifier = Modifier.fillMaxSize()){
            TnnsPage()
        }
    }
}