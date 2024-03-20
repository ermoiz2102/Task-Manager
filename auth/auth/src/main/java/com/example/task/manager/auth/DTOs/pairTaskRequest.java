package com.example.task.manager.auth.DTOs;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class pairTaskRequest {
    private Integer taskId;
//    private Integer adminId;
    private Integer userId;

}
