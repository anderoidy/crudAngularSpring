package com.ander.ladoapi.controller;

import java.util.List;

import com.ander.ladoapi.model.Course;
import com.ander.ladoapi.repository.CourseRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/courses")
@AllArgsConstructor
public class CourseController {
    
    //@Autowired
    private final CourseRepository courseRepository;


    @GetMapping    
    public @ResponseBody List<Course> list() {
        return courseRepository.findAll();
    }

}
