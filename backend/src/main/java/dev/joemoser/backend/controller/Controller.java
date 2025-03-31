package dev.joemoser.backend.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import dev.joemoser.backend.chatgpt.ChatGPTService;
import dev.joemoser.backend.education.Education;
import dev.joemoser.backend.education.EducationService;
import dev.joemoser.backend.generalinfo.GeneralInfo;
import dev.joemoser.backend.generalinfo.GeneralInfoService;
import dev.joemoser.backend.interests.Interests;
import dev.joemoser.backend.interests.InterestsService;
import dev.joemoser.backend.projects.Projects;
import dev.joemoser.backend.projects.ProjectsService;
import dev.joemoser.backend.work.Work;
import dev.joemoser.backend.work.WorkService;

@RestController
public class Controller
{
    @Autowired
    ChatGPTService chatGPTService;
    @Autowired
    EducationService educationService;
    @Autowired
    GeneralInfoService generalInfoService;
    @Autowired
    InterestsService interestsService;
    @Autowired
    ProjectsService projectsService;
    @Autowired
    WorkService workService;

    @PostMapping("/api/post")
    public String postMessage(@RequestBody UserInput input)
    {
        String type = chatGPTService.getType(input.getInput());
        switch(type.toUpperCase())
        {
            case "EDUCATION" -> {
                List<Education> educationList = educationService.getAllEducation();
                List<String> contexts = new ArrayList<>();
                for(Education e:educationList) contexts.add(e.toString());
                return chatGPTService.getResult(input.getInput(), contexts);
            }
            case "GENERAL_INFO" -> {
                List<GeneralInfo> generalInfoList = generalInfoService.getAllGeneralInfo();
                List<String> contexts = new ArrayList<>();
                for(GeneralInfo g:generalInfoList) contexts.add(g.toString());
                return chatGPTService.getResult(input.getInput(), contexts);
            }
            case "INTERESTS" -> {
                List<Interests> interestsList = interestsService.getAllInterests();
                List<String> contexts = new ArrayList<>();
                for(Interests i:interestsList) contexts.add(i.toString());
                return chatGPTService.getResult(input.getInput(), contexts);
            }
            case "PROJECTS" -> {
                List<Projects> projectsList = projectsService.getAllProjects();
                List<String> contexts = new ArrayList<>();
                for(Projects p:projectsList) contexts.add(p.toString());
                return chatGPTService.getResult(input.getInput(), contexts);
            }
            case "WORK" -> {
                List<Work> workList = workService.getAllWork();
                List<String> contexts = new ArrayList<>();
                for(Work w:workList) contexts.add(w.toString());
                return chatGPTService.getResult(input.getInput(), contexts);
            }
            case "NOT_RELATED" -> {
                List<String> contexts = new ArrayList<>();
                return chatGPTService.getResult(input.getInput(), contexts);
            }
            default -> {
                System.out.println("Error in the controller.");
                System.out.println(type);
                return "Server Error";
            }
        }
    }
}
