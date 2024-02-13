package com.todo_l.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.ui.Modifier
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.background
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.border
import androidx.compose.material3.OutlinedTextField
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.Button
import androidx.compose.ui.Alignment
import androidx.compose.material3.ButtonDefaults
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Checkbox
import androidx.navigation.NavHostController
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import com.todo_l.viewmodels.ListViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ListScreen(
    navController: NavHostController,
    viewModel: ListViewModel = hiltViewModel(),
    ){

    val state by viewModel.state.collectAsState();
    
Column(
    modifier = 
Modifier
        
        .padding(
            start = 0.dp,
            top = 0.dp,
            end = 0.dp,
            bottom = 0.dp,
            )
        
        .fillMaxWidth(1f)
        
        .fillMaxHeight(1f)
        
        .background(Color(android.graphics.Color.parseColor("#ffffff")))
        
        .border(
            width = 0.dp,
            color = Color(android.graphics.Color.parseColor("#00000000")),
        )
,
){
    
    OutlinedTextField(
        value = state.task.title,
        onValueChange = { viewModel.setTaskTitle(it) },
    
        modifier = 
    Modifier
            
            .padding(
                start = 20.dp,
                top = 50.dp,
                end = 0.dp,
                bottom = 0.dp,
                )
            
            .fillMaxWidth(0.8f)
            
            .height(50.dp)
            
            .background(Color(android.graphics.Color.parseColor("#00000000")))
            
            .border(
                width = 0.dp,
                color = Color(android.graphics.Color.parseColor("#00000000")),
            )
    ,
        shape = 
    RoundedCornerShape(
      topStart = 0.dp,
      topEnd = 0.dp,
      bottomStart = 0.dp,
      bottomEnd = 0.dp,
    )
    ,
        
        colors = TextFieldDefaults.outlinedTextFieldColors(
            containerColor = Color(android.graphics.Color.parseColor("#ffffff")),
        ),
        placeholder = { 
    Text(
        text = "title"
        ,
        modifier = 
    Modifier
            
            .padding(
                start = 0.dp,
                top = 0.dp,
                end = 0.dp,
                bottom = 0.dp,
                )
            
            .fillMaxWidth(1f)
            
            .background(Color(android.graphics.Color.parseColor("#00000000")))
            
            .border(
                width = 0.dp,
                color = Color(android.graphics.Color.parseColor("#00000000")),
            )
    ,
        color = Color(android.graphics.Color.parseColor("#000000")),
    )
     },
    )    
    OutlinedTextField(
        value = state.task.description,
        onValueChange = { viewModel.setTaskDescription(it) },
    
        modifier = 
    Modifier
            
            .padding(
                start = 20.dp,
                top = 5.dp,
                end = 0.dp,
                bottom = 0.dp,
                )
            
            .fillMaxWidth(0.8f)
            
            .height(50.dp)
            
            .background(Color(android.graphics.Color.parseColor("#00000000")))
            
            .border(
                width = 0.dp,
                color = Color(android.graphics.Color.parseColor("#00000000")),
            )
    ,
        shape = 
    RoundedCornerShape(
      topStart = 0.dp,
      topEnd = 0.dp,
      bottomStart = 0.dp,
      bottomEnd = 0.dp,
    )
    ,
        
        colors = TextFieldDefaults.outlinedTextFieldColors(
        ),
        placeholder = { 
    Text(
        text = "description"
        ,
        modifier = 
    Modifier
            
            .padding(
                start = 0.dp,
                top = 0.dp,
                end = 0.dp,
                bottom = 0.dp,
                )
            
            .fillMaxWidth(1f)
            
            .background(Color(android.graphics.Color.parseColor("#00000000")))
            
            .border(
                width = 0.dp,
                color = Color(android.graphics.Color.parseColor("#00000000")),
            )
    ,
        color = Color(android.graphics.Color.parseColor("#000000")),
    )
     },
    )    
    Button(
        onClick = { viewModel.createTask(state.task)
     },
        modifier = 
    Modifier
            
            .padding(
                start = 0.dp,
                top = 10.dp,
                end = 0.dp,
                bottom = 0.dp,
                )
            
            .fillMaxWidth(1f)
            
            .height(50.dp)
            .align(Alignment.Start)
            
            .background(Color(android.graphics.Color.parseColor("#00000000")))
            
            .border(
                width = 2.dp,
                color = Color(android.graphics.Color.parseColor("#000000")),
            )
    ,
        shape = 
    RoundedCornerShape(
      topStart = 20.dp,
      topEnd = 20.dp,
      bottomStart = 0.dp,
      bottomEnd = 20.dp,
    )
    ,
        
        colors = ButtonDefaults.buttonColors(
            containerColor = Color(android.graphics.Color.parseColor("#7892ce")),
            
            
            
        ),
    ) {
        
        Text(
            text = "Create"
            ,
            modifier = 
        Modifier
                
                .padding(
                    start = 130.dp,
                    top = 0.dp,
                    end = 0.dp,
                    bottom = 0.dp,
                    )
                
                .fillMaxWidth(0.2f)
                
                .background(Color(android.graphics.Color.parseColor("#00000000")))
                
                .border(
                    width = 0.dp,
                    color = Color(android.graphics.Color.parseColor("#00000000")),
                )
        ,
            color = Color(android.graphics.Color.parseColor("#ffffff")),
        )
    }
    
    LazyColumn() {
        
        items(state.tasks) { model ->
            
            Row(
            ) {
                
                Checkbox(
                  checked = model.isDone,
                  onCheckedChange = {}
                  )    
                Column(
                ){
                    
                    Text(
                        text = model.title
                    ,
                        modifier = 
                    Modifier
                    ,
                    )
                    
                    Text(
                        text = model.description
                    ,
                    )
                }
                
                Button(
                    onClick = { viewModel.deleteTask(model)
                 },
                ) {
                    
                    Text(
                        text = "D"
                        ,
                    )
                }
                
                Button(
                    onClick = { navController.navigate(
                   "Edit/${model.id}"
                )
                 },
                ) {
                    
                    Text(
                        text = "E"
                        ,
                    )
                }
            }
        }
    }
}

}
