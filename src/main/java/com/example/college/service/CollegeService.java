package com.example.college.service;

import com.example.college.model.College;
import com.example.college.model.CollegeDTO;
import com.example.college.model.CourseFee;
import org.springframework.stereotype.Service;

import java.util.List;

public interface CollegeService {

//    public List<CollegeDTO> getCollegeDetails();
//
//    CollegeDTO addCollege(CollegeDTO collegeDTO);

    public List<CourseFee> getDetails();

    public CourseFee create(CourseFee courseFee);


}
