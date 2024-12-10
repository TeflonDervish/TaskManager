package ru.semenov.TaskManager.controller;


import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.semenov.TaskManager.model.Users;
import ru.semenov.TaskManager.service.UserService;

import java.util.List;
import java.util.Optional;

@Data
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<Users> getAll() {
        return userService.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Users> getById(
            @PathVariable Long id) {
        Optional<Users> users = userService.getById(id);
        return users.map(value ->
                new ResponseEntity<>(value, HttpStatus.OK))
                    .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public Users createUser(@RequestBody Users users) {
        return userService.saveUser(users);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        userService.deleteById(id);
    }
}
