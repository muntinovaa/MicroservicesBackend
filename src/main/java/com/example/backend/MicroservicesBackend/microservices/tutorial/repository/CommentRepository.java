package com.example.backend.MicroservicesBackend.microservices.tutorial.repository;


import com.example.backend.MicroservicesBackend.microservices.tutorial.entity.Comment;
import javax.persistence.*;
import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByTutorialId(Long postId);

    @Transactional
    void deleteByTutorialId(long tutorialId);


}
