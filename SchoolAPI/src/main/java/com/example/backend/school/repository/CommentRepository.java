package com.example.backend.school.repository;


import com.example.backend.school.entity.Comment;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByTutorialId(Long postId);

    @Transactional
    void deleteByTutorialId(long tutorialId);


}
