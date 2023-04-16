package com.example.college.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name="Course_Fee")
public class CourseFee
{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int course_fee_id;

    @Column(name = "course_fee")
    private float courseFee;


    //@JsonManagedReference
    @OneToOne(mappedBy = "courseFee", cascade = CascadeType.ALL)
    private College college;

}
