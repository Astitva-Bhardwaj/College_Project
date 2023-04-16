package com.example.college.service.impl;

import com.example.college.model.College;
import com.example.college.model.CollegeDTO;
import com.example.college.model.CourseFee;
import com.example.college.repository.CollegeRepository;
import com.example.college.repository.CourseFeeRepository;
import com.example.college.service.CollegeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class CollegeServiceImpl implements CollegeService {

    //@Autowired
   // CollegeRepository collegeRepository;

    @Autowired
    CourseFeeRepository courseFeeRepository;

    @Override
    public List<CourseFee> getDetails() {
        return courseFeeRepository.findAll();
    }

    @Override
    public CourseFee create(CourseFee courseFee) {
        return courseFeeRepository.save(courseFee);
    }

//    @Override
//    public List<CollegeDTO> getCollegeDetails() {
//        //return collegeRepository.findAll();
//        List<College> colleges = collegeRepository.findAll();
//        List<CollegeDTO> collegeDTOS = new ArrayList<>();
//        for(College college: colleges)
//        {
//            CollegeDTO collegeDTO = new CollegeDTO();
//            collegeDTO.setId(college.getId());
//            collegeDTO.setCourseName(college.getCourseName());
//            collegeDTO.setDuration(college.getDuration());
//            collegeDTO.setAccommodation(college.getAccommodation());
//            collegeDTO.setAccommodationFee(college.getAccommodationFee());
//            collegeDTO.setCourseFee(college.getCourseFee().getCourseFee());
//            collegeDTOS.add(collegeDTO);
//        }
//        return collegeDTOS;
//    }
//
//
//    @Override
//    public CollegeDTO addCollege(CollegeDTO collegeDTO)
//    {
//        College college = new College();
//        college.setCourseName(collegeDTO.getCourseName());
//        college.setName(collegeDTO.getName());
//        college.setDuration(collegeDTO.getDuration());
//        college.setAccommodation(collegeDTO.getAccommodation());
//        college.setAccommodationFee(collegeDTO.getAccommodationFee());
//
//        CourseFee courseFee = new CourseFee();
//        courseFee.setCourseFee(college.getCourseFee().getCourseFee());
//        college.setCourseFee(courseFee);
//
//        College savedCollege = collegeRepository.save(college);
//        collegeDTO.setCourseName(savedCollege.getCourseName());
//        collegeDTO.setName(savedCollege.getName());
//        collegeDTO.setDuration(savedCollege.getDuration());
//        collegeDTO.setAccommodation(savedCollege.getAccommodation());
//        collegeDTO.setAccommodationFee(savedCollege.getAccommodationFee());
//        collegeDTO.setCourseFee(savedCollege.getCourseFee().getCourseFee());
//        return collegeDTO;
//    }

}
