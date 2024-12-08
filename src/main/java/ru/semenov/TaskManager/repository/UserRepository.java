package ru.semenov.TaskManager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.semenov.TaskManager.model.Users;

public interface UserRepository extends JpaRepository<Users, Long> {
}
