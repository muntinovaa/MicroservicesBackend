package com.example.backend.MicroservicesBackend.microservices.tutorial.repository;


import com.example.backend.MicroservicesBackend.microservices.tutorial.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;
import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByTutorialId(Long postId);

    @Transactional
    void deleteByTutorialId(long tutorialId);


}
