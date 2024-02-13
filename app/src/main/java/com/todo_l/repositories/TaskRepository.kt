package com.todo_l.repositories

import com.todo_l.api.TaskService
import com.todo_l.entities.TaskEntity
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.withContext
import javax.inject.Inject


class TaskRepository @Inject constructor (
    private val apiService: TaskService,
) {

    suspend fun getById(id: Long):TaskEntity {
        return apiService.getById(id);
    }

    suspend fun getAll():List<TaskEntity> {
        return apiService.getAll();
    }

    suspend fun create(entity: TaskEntity) = withContext(Dispatchers.IO){
        apiService.insert(entity);
    }

    suspend fun update(entity: TaskEntity) = withContext(Dispatchers.IO){
        apiService.update(entity.id, entity);
    }

    suspend fun delete(entity: TaskEntity) = withContext(Dispatchers.IO){
        apiService.delete(entity.id);
    }
    
}
