package dev.joemoser.backend.projects;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectsRepository extends JpaRepository<Projects, Integer>
{
    
}
