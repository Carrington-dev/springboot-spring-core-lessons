package com.stemgon.spring_core.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Lazy
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BaseballCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Practice baseball every 30 minutes";
    }

    @PostConstruct
    public void doMyCreationWork(){
        System.out.println("do my creation work " + getClass().getName());
    }

    @PreDestroy
    public void myDeletionWork(){
        System.out.println("do my deletion work " + getClass().getName());
    }

}
