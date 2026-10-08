package com.stemgon.spring_core.common;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Hey Practice fast bowling every 15 mins";
    }
}
