package com.example.pc10

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
//import androidx.compose.ui.tooling.data.EmptyGroup.name
import androidx.compose.ui.tooling.data.UiToolingDataApi
import androidx.navigation.NavController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.pc10.ui.theme.Navhomework001Theme

public val NavType.Companion.Stringtype: Any
    get() = Unit

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Navhomework001Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    MyNavigation()
                }
            }
        }
    }
}

fun lisof(navArgument: Any, S: String, function: () -> Unit) {


}

fun NavArgument(name: String?) {


}

@OptIn(UiToolingDataApi::class)
//@Composable
//fun MyNavigation() {
//    val navController = rememberNavController()
//    NavHost(navController = navController, startDestination = Home.Route) {
//        composable(Home.Route) {
//            HomeScreen(navController)
//        }



//        composable(route = "Second /{username}",arguments = listOf(navArgument("username"){type=NavType.StringType },))
//        {
//            val username = it.arguments?.getString("username")
//
//            SecondScreen(username)

//        SecondScreen(it.arguments?.getString("username"))}

//        }

//    }
//}
@Composable
fun MyNavigation(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Home.Route){
        composable(Home.Route){
            HomeScreen(navController)
        }
        composable(route = "Second/{username}/{age}",
            arguments = listOf(navArgument("username") {
                type = NavType.StringType
        },
            navArgument("age"){
                type = NavType.IntType
            }
            )){

            val username = it.arguments?.getString("username")
            val age = it.arguments?.getInt("age")

            SecondScreen(username, age)

        }
    }}






