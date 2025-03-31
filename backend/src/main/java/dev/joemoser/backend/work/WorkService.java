package dev.joemoser.backend.work;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WorkService
{
    @Autowired
    public WorkRepository repo;

    public Work getWorkById(int id)
    {
        return repo.findById(id).get();
    }

    public List<Work> getAllWork()
    {
        return repo.findAll();
    }
}
