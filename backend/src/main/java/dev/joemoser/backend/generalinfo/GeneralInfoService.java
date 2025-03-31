package dev.joemoser.backend.generalinfo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GeneralInfoService
{
    @Autowired
    GeneralInfoRepository repo;

    public GeneralInfo getGeneralInfoById(int id)
    {
        return repo.findById(id).get();
    }

    public List<GeneralInfo> getAllGeneralInfo()
    {
        return repo.findAll();
    }
}
