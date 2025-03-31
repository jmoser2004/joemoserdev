package dev.joemoser.backend.projects;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectsService
{
    @Autowired
    public ProjectsRepository repo;

    public Projects getProjectsById(int id)
    {
        return repo.findById(id).get();
    }

    public List<Projects> getAllProjects()
    {
        return repo.findAll();
    }
}
