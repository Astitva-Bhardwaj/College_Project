package com.example.college.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="college")
public class College {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String courseName;
    private int duration;
    private String accommodation;
    private float accommodationFee;


    //@JsonBackReference
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="course_fee_id" , referencedColumnName = "course_fee_id")
    private CourseFee courseFee;


}
