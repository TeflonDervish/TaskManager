package ru.semenov.TaskManager.repository;

import lombok.extern.java.Log;
import org.springframework.data.jpa.repository.JpaRepository;
import ru.semenov.TaskManager.model.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
