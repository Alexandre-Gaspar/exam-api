package dev.alexandre.personal_blogging_api.service;

import dev.alexandre.personal_blogging_api.model.Post;
import dev.alexandre.personal_blogging_api.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class PostService {
    @Autowired
    private PostRepository postRepository;

    public Post savePost(Post post) {
        return postRepository.save(post);
    }

    public Optional<Post> findPostById(UUID id) {
        return postRepository.findById(id);
    }

    public List<Post> findAllPosts() {
        return postRepository.findAll();
    }

    public void deletePostById(UUID id) {
        postRepository.deleteById(id);
    }
}

