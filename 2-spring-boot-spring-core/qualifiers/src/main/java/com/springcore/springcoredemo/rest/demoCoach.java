package com.springcore.springcoredemo.rest;

import com.springcore.springcoredemo.common.coach;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class demoCoach {
    private coach myCoach;

    // we use constructor injection
    @Autowired
    public demoCoach(@Qualifier("swimcoach")coach theCoach){
        System.out.println("the costructor is :"+getClass().getSimpleName());
        myCoach=theCoach;
    }
    @GetMapping("/dailyWorkout")
    public String dailyWorkout(){
        return myCoach.getWorkDaily();
    }
//    //we use init method at anotation postConstructor
//    @PostConstruct
//    public void myStartMethod(){
//        System.out.println("my startup method is :"+getClass().getSimpleName());
//    }
//
//    //we use end method this will play if project is end
//    @PreDestroy
//    public void myEndMethod(){
//        System.out.println("my end method is :"+getClass().getSimpleName());
//    }

}
