package com.springcore.springcoredemo.common;

import org.springframework.stereotype.Component;

//@Component
// we can delete @Component annotation as instead of
// we use @Configuration annotation and @Bean annotation
public class swimcoach implements coach{

    public swimcoach(){
        System.out.println("this constructor is :"+getClass().getSimpleName());
    }

    @Override
    public String getWorkDaily() {
        return "this is swim coach !!";
    }
}
