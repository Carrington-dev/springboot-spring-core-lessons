package com.stemgon.spring_core.common;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Practice baseball every 30 minutes";
    }
}
