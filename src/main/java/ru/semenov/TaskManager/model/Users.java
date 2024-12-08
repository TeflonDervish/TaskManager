package ru.semenov.TaskManager.model;


import jakarta.persistence.*;
import lombok.Data;
import ru.semenov.TaskManager.enums.Role;

@Entity
@Data
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String surname;
    private String name;

    private String email;

    private String password;

    @Enumerated(EnumType.STRING)
    private Role role;
}
