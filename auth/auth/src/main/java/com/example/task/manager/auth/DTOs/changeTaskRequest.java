package com.example.task.manager.auth.DTOs;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class changeTaskRequest {
    private Integer taskId;

    private Integer userId;

}
