package dev.alexandre.personal_blogging_api.service;

import dev.alexandre.personal_blogging_api.model.Comment;
import dev.alexandre.personal_blogging_api.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class CommentService {
    @Autowired
    private CommentRepository commentRepository;

    public Comment saveComment(Comment comment) {
        return commentRepository.save(comment);
    }

    public Optional<Comment> findCommentById(UUID id) {
        return commentRepository.findById(id);
    }

    public List<Comment> findAllComments() {
        return commentRepository.findAll();
    }

    public void deleteCommentById(UUID id) {
        commentRepository.deleteById(id);
    }
}
