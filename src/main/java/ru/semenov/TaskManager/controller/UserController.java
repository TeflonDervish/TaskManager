package ru.semenov.TaskManager.controller;


import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.semenov.TaskManager.model.Users;
import ru.semenov.TaskManager.service.UsersService;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@RestController
@RequestMapping("/user")
public class UserController {

    private UsersService usersService;

    @GetMapping
    public List<Users> getAll() {
        return usersService.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Users> getById(
            @PathVariable Long id) {
        Optional<Users> users = usersService.getById(id);
        return users.map(value ->
                new ResponseEntity<>(value, HttpStatus.OK))
                    .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public Users createUser(@RequestBody Users users) {
        return usersService.saveUser(users);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        usersService.deleteById(id);
    }
}
