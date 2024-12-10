package ru.semenov.TaskManager.service;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.semenov.TaskManager.model.Task;
import ru.semenov.TaskManager.repository.TaskRepository;

import java.util.List;
import java.util.Optional;

@Service
@Data
@AllArgsConstructor
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    private List<Task> getAll() {
        return taskRepository.findAll();
    }

    private Optional<Task> getById(Long id) {
        return taskRepository.findById(id);
    }

    private Task saveTask(Task task) {
        return taskRepository.save(task);
    }

    private void deleteById(Long id) {
        taskRepository.deleteById(id);
    }
}

