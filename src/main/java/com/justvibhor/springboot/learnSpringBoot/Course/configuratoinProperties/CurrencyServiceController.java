package com.justvibhor.springboot.learnSpringBoot.Course.configuratoinProperties;


import com.justvibhor.springboot.learnSpringBoot.Course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CurrencyServiceController {

    @Autowired
    private CurrencyServiceConfiguration configuration;

    @GetMapping("/currency")
    public CurrencyServiceConfiguration courseList() {
        return configuration;
    }


//    @GetMapping("/greeting")
//    public Course course() {
//        return new Course(1, "Learn AWS", "SelfLearn");
//    }
}
