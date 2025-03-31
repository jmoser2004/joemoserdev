package dev.joemoser.backend.interests;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InterestsService
{
    @Autowired
    public InterestsRepository repo;

    public Interests getInterestsById(int id) 
    {
        return repo.findById(id).get();
    }

    public List<Interests> getAllInterests()
    {
        return repo.findAll();
    }
}
