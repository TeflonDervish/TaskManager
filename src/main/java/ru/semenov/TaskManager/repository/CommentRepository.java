package ru.semenov.TaskManager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.semenov.TaskManager.model.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
