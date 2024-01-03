package com.example.backend.MicroservicesBackend.microservices.tutorial.repository;


import com.example.backend.MicroservicesBackend.microservices.tutorial.entity.Tutorial;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TutorialDetailsRepository extends JpaRepository<Tutorial, Long> {
    List<Tutorial> findByPublished(boolean published);

    List<Tutorial> findByTitleContaining(String title);
}