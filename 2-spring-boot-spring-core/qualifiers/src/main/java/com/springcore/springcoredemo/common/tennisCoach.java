package com.springcore.springcoredemo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class tennisCoach implements coach{
    @Override
    public String getWorkDaily() {
        return "this is tennis coach !!";
    }
}
