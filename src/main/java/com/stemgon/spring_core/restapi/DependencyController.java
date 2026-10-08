package com.stemgon.spring_core.restapi;

import com.stemgon.spring_core.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DependencyController {
    private Coach myCoach;

//    @Autowired
//    public DependencyController(Coach theCoach){
//        myCoach = theCoach;
//    }

    @Autowired
    public void setMyCoach(Coach theCoach){
        myCoach = theCoach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return  this.myCoach.getDailyWorkout();
    }
}
