package com.justvibhor.springboot.learnSpringBoot.Course;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
public class CourseController {

    @GetMapping("/ManyCourses")
    public List<Course> courseList() {
        List<Course> courses = new ArrayList<>();
        courses.add(new Course(1, "Learn AWS", "SelfLearn"));
        courses.add(new Course(2, "Learn DevOps", "SelfLearn"));
        courses.add(new Course(3, "Learn Machine Learning", "SelfLearn"));

        return courses;
    }


    @GetMapping("/greeting")
    public Course course() {
        return new Course(1, "Learn AWS", "SelfLearn");
    }
}
