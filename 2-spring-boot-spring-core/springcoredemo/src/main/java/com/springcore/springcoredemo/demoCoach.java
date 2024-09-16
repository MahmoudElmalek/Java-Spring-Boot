package com.springcore.springcoredemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class demoCoach {
    private coach myCoach;

    @Autowired
    public demoCoach(coach theCoach){
        myCoach=theCoach;
    }
    @GetMapping("/dailyWorkout")
    public String dailyWorkout(){
        return myCoach.getWorkDaily();
    }
}
