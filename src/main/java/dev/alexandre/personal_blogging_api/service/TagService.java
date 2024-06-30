package dev.alexandre.personal_blogging_api.service;

import dev.alexandre.personal_blogging_api.model.Tag;
import dev.alexandre.personal_blogging_api.repository.TagRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class TagService {
    @Autowired
    private TagRepository tagRepository;

    public Tag saveTag(Tag tag) {
        return tagRepository.save(tag);
    }

    public Optional<Tag> findTagById(UUID id) {
        return tagRepository.findById(id);
    }

    public List<Tag> findAllTags() {
        return tagRepository.findAll();
    }

    public void deleteTagById(UUID id) {
        tagRepository.deleteById(id);
    }
}

