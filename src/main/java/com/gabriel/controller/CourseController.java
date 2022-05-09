package com.gabriel.controller;

import com.gabriel.model.Course;
import com.gabriel.repository.CourseRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/courses")
@AllArgsConstructor
public class CourseController {

    private final CourseRepository courseRepository;

    @GetMapping
    public List<Course> list() {
        return courseRepository.findAll();
    }


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Course create(@RequestBody Course course) {
        Course newCourse = Course.builder().name(course.getName())
                .category(course.getCategory()).build();
        return courseRepository.save(newCourse);
    }
}

