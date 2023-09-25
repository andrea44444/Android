package com.example.tarjetapresentacion

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tarjetapresentacion.ui.theme.TarjetaPresentacionTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TarjetaPresentacionTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Elementos(nombre="César Alejando", titulo="Programador Junior", telefono= "+(34) 976 567 789", usuario= "Cesar_007", email= "Cesar072003@gmail.com")
                }
            }
        }
    }
}

@Composable
fun Elementos(nombre: String, titulo: String, telefono: String, usuario: String, email: String, modifier: Modifier = Modifier) {

    val img= painterResource(R.drawable.corazon)

    Column(
        modifier.fillMaxSize()
                .background(Color(241,237,235)),
        ){

        Spacer(modifier = Modifier.height(180.dp))

        Column(
            modifier.fillMaxWidth(),
            horizontalAlignment= Alignment.CenterHorizontally,
            ){
            Image(
                painter = img,
                contentDescription = null,
            )
            Text(
                text = nombre,
                fontSize = 40.sp,
                fontWeight = FontWeight.Light,
            )
            Text(
                text = titulo,
                fontSize = 15.sp,
                fontWeight = FontWeight.Bold,
                color=Color(242, 153, 202),
            )
        }

        Spacer(modifier = Modifier.height(210.dp))

        Column (
            modifier.fillMaxWidth()
                .height(150.dp), //Si no ponemos una height especifica no hay espacio para que el verticalArrangement funcione
            horizontalAlignment= Alignment.CenterHorizontally,
            verticalArrangement= Arrangement.SpaceEvenly
            ){
            Row (
                //modifier.width(300.dp),
                verticalAlignment= Alignment.CenterVertically, //la altura del icon y del texto son lo suficientemente parecidas para que no haga falta
                ){
                Icon(
                    imageVector= Icons.Default.Call,
                    contentDescription = "icono telefono",
                    tint=Color(242, 153, 202),
                )

                Spacer(modifier = Modifier.width(10.dp))
                
                Text(
                    text = telefono,
                    modifier.width(200.dp),
                )
            }

            Row (
                //modifier.width(300.dp),
                verticalAlignment= Alignment.CenterVertically,
                ){
                Icon(
                    imageVector= Icons.Default.AccountCircle,
                    contentDescription = "icono usuario",
                    tint=Color(242, 153, 202),
                )

                Spacer(modifier = Modifier.width(10.dp))

                Text(
                    text = usuario,
                    modifier.width(200.dp),
                )
            }

            Row(
                //modifier.width(300.dp),
                verticalAlignment= Alignment.CenterVertically,
                ){
                Icon(
                    imageVector= Icons.Default.Email,
                    contentDescription = "icono email",
                    tint=Color(242, 153, 202),
                )

                Spacer(modifier = Modifier.width(10.dp))

                Text(
                    text = email,
                    modifier.width(200.dp),
                )
            }

        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TarjetaPresentacionTheme {
        Elementos(nombre="Juan Pablo", titulo="Chef", telefono= "+(34) 976 567 789", usuario= "JuanPablo007", email= "JuanPablo07@gmail.com")
    }
}