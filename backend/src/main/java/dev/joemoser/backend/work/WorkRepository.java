package dev.joemoser.backend.work;

import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkRepository extends JpaRepository<Work, Integer>
{
    
}
