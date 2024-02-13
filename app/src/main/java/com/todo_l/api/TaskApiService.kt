package com.todo_l.api

import retrofit2.http.GET
import retrofit2.http.PUT
import retrofit2.http.DELETE
import retrofit2.http.POST
import retrofit2.http.Body
import retrofit2.http.Path
import com.todo_l.entities.TaskEntity

interface TaskService {
    @GET("tasks")
    suspend fun getAll(): List<TaskEntity>

    @GET("tasks/{id}")
    suspend fun getById(@Path("id") id: Long): TaskEntity

    @PUT("tasks/{id}")
    suspend fun update(@Path("id") id: Long, @Body item: TaskEntity): TaskEntity

    @DELETE("tasks/{id}")
    suspend fun delete(@Path("id") id: Long): TaskEntity

    @POST("tasks")
    suspend fun insert(@Body item: TaskEntity): TaskEntity
}
