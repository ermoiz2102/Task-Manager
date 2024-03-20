package com.example.task.manager.auth.Entities;

import com.example.task.manager.auth.Enums.role;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="user")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer emp_id;

    private  String userName;

    private String mobNo;

    private String emailId;

    private String password;

    @Enumerated(EnumType.STRING)
    private role roleStatus;

    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
    private List<task>taskList=new ArrayList<>();

    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
    private List<Role>roleList=new ArrayList<>();

}
