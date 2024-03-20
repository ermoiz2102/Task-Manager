package com.example.task.manager.auth.Repository;

import com.example.task.manager.auth.Entities.task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface taskRepository extends JpaRepository<task,Integer> {
}
