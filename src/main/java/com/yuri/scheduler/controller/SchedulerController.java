package com.yuri.scheduler.controller;

import com.yuri.scheduler.model.Person;
import com.yuri.scheduler.service.SchedulerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/scheduler/v1")
public class SchedulerController {

    SchedulerService schedulerService;    // injection

    public SchedulerController(SchedulerService schedulerService) {
        this.schedulerService = schedulerService;
    }

    // localhost:8080/scheduler/v1/getPerson
    @GetMapping("/getPerson/{firstName}/{lastName}/{birthday}")
    public Person getPerson(
            @RequestBody String firstName,
            @RequestBody String lastName,
            @RequestBody String birthday) {
        return schedulerService.getPerson(firstName, lastName, birthday);
    }

//    @PutMapping("/getPerson/{firstName}/{lastName}/{birthday}")
//    public String putPerson(
//            @RequestBody String firstName,
//            @RequestBody String lastName,
//            @RequestBody String birthday) {
//        return schedulerService.getPerson(firstName, lastName, birthday);
//    }

//    @PutMapping("")
}
