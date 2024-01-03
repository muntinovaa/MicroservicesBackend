package com.example.backend.school.repository;


import com.example.backend.school.entity.Tutorial;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TutorialDetailsRepository extends JpaRepository<Tutorial, Long> {
    List<Tutorial> findByPublished(boolean published);

    List<Tutorial> findByTitleContaining(String title);
}