package com.example.task.manager.auth.Services;

import com.example.task.manager.auth.DTOs.addTaskRequest;
import com.example.task.manager.auth.DTOs.changeTaskRequest;
import com.example.task.manager.auth.DTOs.pairTaskRequest;
import com.example.task.manager.auth.Entities.task;

import java.util.List;

public interface taskService {
    String addTask(addTaskRequest addTaskRequest);

    String pairTask(pairTaskRequest pairTaskRequest);

    String changeTask(changeTaskRequest changeTaskRequest) throws Exception;

    List<task> getTask();
}
