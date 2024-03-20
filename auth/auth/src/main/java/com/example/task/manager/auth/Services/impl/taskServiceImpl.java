package com.example.task.manager.auth.Services.impl;

import com.example.task.manager.auth.DTOs.addTaskRequest;
import com.example.task.manager.auth.DTOs.changeTaskRequest;
import com.example.task.manager.auth.DTOs.pairTaskRequest;
import com.example.task.manager.auth.Entities.task;
import com.example.task.manager.auth.Services.taskService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class taskServiceImpl implements taskService {
    @Override
    public String addTask(addTaskRequest addTaskRequest) {
        return null;
    }

    @Override
    public String pairTask(pairTaskRequest pairTaskRequest) {
        return null;
    }

    @Override
    public String changeTask(changeTaskRequest changeTaskRequest) {
        return null;
    }

    @Override
    public List<task> getTask() {
        return null;
    }
}
