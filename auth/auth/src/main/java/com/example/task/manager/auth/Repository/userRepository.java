package com.example.task.manager.auth.Repository;

import com.example.task.manager.auth.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface userRepository extends JpaRepository<User,Integer> {
}
