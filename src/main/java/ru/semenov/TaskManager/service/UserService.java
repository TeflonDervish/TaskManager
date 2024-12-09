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

    public List<Users> getAll() {
        return userRepository.findAll();
    }

    public Optional<Users> getById(Long id) {
        return userRepository.findById(id);
    }

    public Users saveUser(Users users){
        return userRepository.save(users);
    }

    public void deleteById(Long id){
        userRepository.deleteById(id);
    }
}
