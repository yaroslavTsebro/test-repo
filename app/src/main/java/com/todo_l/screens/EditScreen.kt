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
import androidx.compose.runtime.mutableStateOf
import androidx.compose.material3.TextField
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Checkbox
import androidx.compose.foundation.layout.width
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.navigation.NavHostController
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import com.todo_l.viewmodels.EditViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun EditScreen(
    navController: NavHostController,
    viewModel: EditViewModel = hiltViewModel(),
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
    
    
    
    
    
    TextField(
        value = state.task.title,
        onValueChange = { viewModel.setTaskTitle(it) },
        modifier = 
    Modifier
            
            .padding(
                start = 0.dp,
                top = 0.dp,
                end = 0.dp,
                bottom = 0.dp,
                )
            
            .fillMaxWidth(1f)
            
            .height(50.dp)
            
            .background(Color(android.graphics.Color.parseColor("#00000000")))
            
            .border(
                width = 0.dp,
                color = Color(android.graphics.Color.parseColor("#00000000")),
            )
    ,
        placeholder = { 
    Text(
        text = "Text"
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
        label = { 
    Text(
        text = "Text"
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
        
        colors = TextFieldDefaults.textFieldColors(
            containerColor = Color(android.graphics.Color.parseColor("#f9f9fb")),
            
            focusedIndicatorColor = Color(android.graphics.Color.parseColor("#7B67F2")),
            unfocusedIndicatorColor = Color(android.graphics.Color.parseColor("#000000")),
        ),
        shape = 
    RoundedCornerShape(
      topStart = 0.dp,
      topEnd = 0.dp,
      bottomStart = 0.dp,
      bottomEnd = 0.dp,
    )
    ,
    )
    
    
    
    
    
    TextField(
        value = state.task.description,
        onValueChange = { viewModel.setTaskDescription(it) },
        modifier = 
    Modifier
            
            .padding(
                start = 0.dp,
                top = 0.dp,
                end = 0.dp,
                bottom = 0.dp,
                )
            
            .fillMaxWidth(1f)
            
            .height(50.dp)
            
            .background(Color(android.graphics.Color.parseColor("#00000000")))
            
            .border(
                width = 0.dp,
                color = Color(android.graphics.Color.parseColor("#00000000")),
            )
    ,
        placeholder = { 
    Text(
        text = "Text"
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
        label = { 
    Text(
        text = "Text"
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
        
        colors = TextFieldDefaults.textFieldColors(
            containerColor = Color(android.graphics.Color.parseColor("#f9f9fb")),
            
            focusedIndicatorColor = Color(android.graphics.Color.parseColor("#7B67F2")),
            unfocusedIndicatorColor = Color(android.graphics.Color.parseColor("#000000")),
        ),
        shape = 
    RoundedCornerShape(
      topStart = 0.dp,
      topEnd = 0.dp,
      bottomStart = 0.dp,
      bottomEnd = 0.dp,
    )
    ,
    )
    
    Checkbox(
      checked = state.task.isDone,
      onCheckedChange = { viewModel.setTaskIsDone(it) },
      modifier = 
    Modifier
            
            .padding(
                start = 0.dp,
                top = 0.dp,
                end = 0.dp,
                bottom = 0.dp,
                )
            
            .width(22.dp)
            
            .height(22.dp)
            
            .background(Color(android.graphics.Color.parseColor("#00000000")))
            
            .border(
                width = 0.dp,
                color = Color(android.graphics.Color.parseColor("#00000000")),
            )
    ,
      
      colors = CheckboxDefaults.colors(
          checkedColor = Color(android.graphics.Color.parseColor("#50000000")),
          uncheckedColor = Color(android.graphics.Color.parseColor("#50000000")),
      ),
      )    
    Button(
        onClick = { viewModel.updateTask(state.task)
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
        
        colors = ButtonDefaults.buttonColors(
            containerColor = Color(android.graphics.Color.parseColor("#50000000")),
            
            
            
        ),
    ) {
        
        Text(
            text = "Save"
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
    }
}

}
