package com.springcore.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class cricketCoach implements coach{

    @Override
    public String getWorkDaily() {
        return "practice bowling daily for 5 hours !";
    }
}
