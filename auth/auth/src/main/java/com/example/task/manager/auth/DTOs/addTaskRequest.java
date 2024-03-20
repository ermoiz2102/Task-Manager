package com.example.task.manager.auth.DTOs;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class addTaskRequest {
    private String title;
    private String description;
//    private Integer empid;
    private Date dueDate;

}
