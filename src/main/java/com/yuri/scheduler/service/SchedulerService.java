package com.yuri.scheduler.service;

import com.yuri.scheduler.model.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service    // is a component (bean)
public class SchedulerService {


    public Person getPerson(String fName, String lName, String birthday) {
        return new Person(fName, lName, birthday);
    }

}
