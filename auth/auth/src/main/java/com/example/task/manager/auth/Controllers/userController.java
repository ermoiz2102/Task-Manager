package com.example.task.manager.auth.Controllers;

import com.example.task.manager.auth.DTOs.addTaskRequest;
import com.example.task.manager.auth.DTOs.changeTaskRequest;
import com.example.task.manager.auth.Services.impl.taskServiceImpl;
import com.example.task.manager.auth.Services.impl.userServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")

public class userController {
    @Autowired
    private taskServiceImpl taskService;

    @Autowired
    private userServiceImpl userService;

    @PostMapping("/change-task")
    private ResponseEntity changeask(changeTaskRequest changeTaskRequest){
        try{

            String result=taskService.changeTask(changeTaskRequest);
            return new ResponseEntity<>(result, HttpStatus.CREATED);
        }
        catch (Exception e){
            return new ResponseEntity<>(e.toString(),HttpStatus.BAD_REQUEST);
        }

    }
 }
