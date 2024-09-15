package com.mycoolapp.springboot.demo.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class funrestcontroller {

    @Value("${coach.name}")
    public String coachName;

    @Value("${team.name}")
    public String teamName;

    @GetMapping("/teamInfo")
    public String teamInfo(){
        return "coach name :" +coachName +" and team name : "+teamName;
    }

    @GetMapping("/")
    public String sayhello(){
        return "Hello World";
    }

    @GetMapping("/workout")
    public String workout(){
        return "run for 5k ! for mahmoud ";
    }
}
