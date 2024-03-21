package com.example.task.manager.auth.Repository;

import com.example.task.manager.auth.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface userRepository extends JpaRepository<User,Integer> {
    @Query(value = "select * from User where username=?1",nativeQuery = true)
    User findByUsername(String username);

}
