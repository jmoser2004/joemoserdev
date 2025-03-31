package dev.joemoser.backend.education;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducationService
{
    @Autowired
    public EducationRepository repo;

    public Education getEducationById(int id)
    {
        return repo.findById(id).get();
    }

    public List<Education> getAllEducation()
    {
        return repo.findAll();
    }
}
