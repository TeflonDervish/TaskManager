package ru.semenov.TaskManager.service;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.semenov.TaskManager.model.Comment;
import ru.semenov.TaskManager.repository.CommentRepository;

import java.util.List;
import java.util.Optional;

@Service
@Data
public class CommentService {

    @Autowired
    private CommentRepository commentRepository;

    public List<Comment> getAll() {
        return commentRepository.findAll();
    }

    public Optional<Comment> getById(Long id) {
        return commentRepository.findById(id);
    }

    public Comment saveComment(Comment comment) {
        return commentRepository.save(comment);
    }

    public void deleteById(Long id) {
        commentRepository.deleteById(id);
    }
}
