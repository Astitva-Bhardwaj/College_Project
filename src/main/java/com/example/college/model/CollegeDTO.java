package com.example.college.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CollegeDTO {

    private int id;

    private String name;
    private String courseName;
    private int duration;
    private String accommodation;
    private float accommodationFee;
    private double courseFee;
}
