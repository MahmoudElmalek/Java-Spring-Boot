package com.springcore.springcoredemo.rest;

import util.coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class demoCoach {
    private coach myCoach;
    //we use constructor injection
//    @Autowired
//    public demoCoach(coach theCoach){
//        myCoach=theCoach;
//    }

    //we use setter injection
    @Autowired
    public void setCoach(coach theCoach){
        myCoach=theCoach;
    }
    @GetMapping("/dailyWorkout")
    public String dailyWorkout(){
        return myCoach.getWorkDaily();
    }
}
