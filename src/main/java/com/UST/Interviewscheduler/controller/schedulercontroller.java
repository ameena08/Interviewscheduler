package com.UST.Interviewscheduler.controller;


import com.UST.Interviewscheduler.entity.Scheduler;
import com.UST.Interviewscheduler.service.schedulerservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
//import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hello")
public class schedulercontroller {
    @Autowired
    private schedulerservice schedulerservice;

    @PostMapping("/")
    public Scheduler add(@RequestBody Scheduler scheduler) {

        return schedulerservice.create(scheduler);
    }
    @GetMapping("/get")
    public List<Scheduler> getAll() {

        return schedulerservice.get();
    }
    @GetMapping("/get/{name}")
    public Scheduler getEmployeeByName(@PathVariable String name) {
        return schedulerservice.findByName(name);
    }


}
