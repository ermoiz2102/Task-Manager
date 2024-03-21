package com.example.task.manager.auth.Controllers;

import com.example.task.manager.auth.DTOs.addTaskRequest;
import com.example.task.manager.auth.DTOs.changeTaskRequest;
import com.example.task.manager.auth.DTOs.pairTaskRequest;
import com.example.task.manager.auth.Entities.task;
import com.example.task.manager.auth.Services.impl.taskServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class taskController {
    @Autowired
    private taskServiceImpl taskService;

    @PostMapping("/admin/add-task")
    private ResponseEntity addTask(addTaskRequest addTaskRequest){
        try{

            String result=taskService.addTask(addTaskRequest);
            return new ResponseEntity<>(result, HttpStatus.CREATED);
        }
        catch (Exception e){
            return new ResponseEntity<>(e.toString(),HttpStatus.BAD_REQUEST);
        }

    }
    @PostMapping("/admin/change-task")
    private ResponseEntity changeTask(changeTaskRequest changeTaskRequest){
        try{

            String result=taskService.changeTask(changeTaskRequest);
            return new ResponseEntity<>(result, HttpStatus.CREATED);
        }
        catch (Exception e){
            return new ResponseEntity<>(e.toString(),HttpStatus.BAD_REQUEST);
        }

    }
    @PostMapping("/admin/pair-task")
    private ResponseEntity pairTask(pairTaskRequest pairTaskRequest){
        try{

            String result=taskService.pairTask(pairTaskRequest);
            return new ResponseEntity<>(result, HttpStatus.CREATED);
        }
        catch (Exception e){
            return new ResponseEntity<>(e.toString(),HttpStatus.BAD_REQUEST);
        }

    }
    @GetMapping("/admin/get-task")
    private ResponseEntity getTask(){
        try{
            List<task> taskList=taskService.getTask();
            return new ResponseEntity<>(taskList,HttpStatus.ACCEPTED);
        }
        catch(Exception e){
            return  new ResponseEntity<>(e.toString(),HttpStatus.BAD_REQUEST);
        }
    }
    @GetMapping("/user/change-task")
    private ResponseEntity changeask(changeTaskRequest changeTaskRequest){
        try{

            String result=taskService.changeTask(changeTaskRequest);
            return new ResponseEntity<>("dfsfadaf", HttpStatus.CREATED);
        }
        catch (Exception e){
            return new ResponseEntity<>(e.toString(),HttpStatus.BAD_REQUEST);
        }


    }
    @GetMapping("/public")
    private ResponseEntity<String> forall(){
        return new ResponseEntity<>("welcome to task page",HttpStatus.CREATED);
    }
}
