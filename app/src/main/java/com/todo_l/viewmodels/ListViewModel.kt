package com.todo_l.viewmodels

import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import com.todo_l.repositories.TaskRepository
import com.todo_l.entities.TaskEntity

data class ListViewModelState (
    val task: TaskEntity = TaskEntity(
      title = "",
      description = "",
      isDone = false,
              ),
    val tasks: List<TaskEntity> = listOf(),
)

@HiltViewModel
class ListViewModel @Inject constructor (
  private val taskRepository : TaskRepository,
  private val savedStateHandle: SavedStateHandle,
) : ViewModel() {
  private val _state = MutableStateFlow<ListViewModelState>(ListViewModelState());
  val state = _state.asStateFlow()

  init {
    viewModelScope.launch {
      val data = getAllTask();
      _state.update {
        ListViewModelState(tasks = data)
      }
    }
      }

  fun setTaskTitle(title: String) {
    _state.update {
      ListViewModelState(task = it.task.copy(title = title))
    }
  }
  fun setTaskDescription(description: String) {
    _state.update {
      ListViewModelState(task = it.task.copy(description = description))
    }
  }
  fun setTaskIsDone(isDone: Boolean) {
    _state.update {
      ListViewModelState(task = it.task.copy(isDone = isDone))
    }
  }
  suspend fun getTaskById(id: Long): TaskEntity {
    return taskRepository.getById(id);
  }

  suspend fun getAllTask(): List<TaskEntity> {
    return taskRepository.getAll();
  }

  fun createTask(entity: TaskEntity) {
    viewModelScope.launch { taskRepository.create(entity); }
  }

  fun updateTask(entity: TaskEntity) {
    viewModelScope.launch { taskRepository.update(entity); }
  }

  fun deleteTask(entity: TaskEntity) {
    viewModelScope.launch { taskRepository.delete(entity); }
  }
}
