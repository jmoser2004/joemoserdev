package dev.joemoser.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.joemoser.backend.education.Education;
import dev.joemoser.backend.education.EducationService;

@RestController
public class TestController
{
    @Autowired
    private EducationService educationService;

    @GetMapping("/")
    public List<Education> home()
    {
        return educationService.getAllEducation();
    }
}
