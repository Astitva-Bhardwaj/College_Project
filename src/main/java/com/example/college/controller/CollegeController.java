package com.example.college.controller;

import com.example.college.model.College;
import com.example.college.model.CollegeDTO;
import com.example.college.model.CourseFee;
import com.example.college.service.CollegeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/college")
@RestController
@Slf4j
public class CollegeController {


    @Autowired
    CollegeService collegeService;


    @GetMapping("/details")
    public List<CourseFee> getAllDetailsOfCollege()
    {
        return collegeService.getDetails();
    }


    @PostMapping("/save")
    public CourseFee createCollegeDetails(@RequestBody CourseFee courseFee)
    {
        log.info("CollegeController  --  createCollegeDetails");
        return collegeService.create(courseFee);
    }

}
