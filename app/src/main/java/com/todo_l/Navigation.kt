package com.todo_l

import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.NavType
import androidx.navigation.navArgument
import com.todo_l.screens.*

@Composable
fun NavGraph(){
   val navController = rememberNavController()
   NavHost(navController = navController, startDestination = "List") {
      composable("List") {
         ListScreen(navController)
      }
      composable(
         "Edit/{taskId}",
         arguments = listOf(
            navArgument("taskId") { type = NavType.StringType }
         )
      ) { backStackEntry ->
         EditScreen(navController)
      }
   }
}
