package ru.semenov.TaskManager.service;

import jakarta.annotation.sql.DataSourceDefinitions;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;
import ru.semenov.TaskManager.model.Users;
import ru.semenov.TaskManager.repository.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
@Data
@AllArgsConstructor
public class UserService {

    private UserRepository userRepository;

    private List<Users> getAll() {
        return userRepository.findAll();
    }

    private Optional<Users> getById(Long id) {
        return userRepository.findById(id);
    }

    private Users saveUser(Users users){
        return userRepository.save(users);
    }

    private void deleteById(Long id){
        userRepository.deleteById(id);
    }
}
