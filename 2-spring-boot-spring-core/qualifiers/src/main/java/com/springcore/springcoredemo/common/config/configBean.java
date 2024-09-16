package com.springcore.springcoredemo.common.config;

import com.springcore.springcoredemo.common.swimcoach;
import com.springcore.springcoredemo.common.coach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class configBean {

    @Bean
    public coach swimcoach(){
        return new swimcoach();
    }
}
