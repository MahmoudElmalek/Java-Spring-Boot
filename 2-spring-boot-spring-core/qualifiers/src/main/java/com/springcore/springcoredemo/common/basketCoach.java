package com.springcore.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class basketCoach implements coach{
    @Override
    public String getWorkDaily() {
        return "this is basket coach !!";
    }
}
