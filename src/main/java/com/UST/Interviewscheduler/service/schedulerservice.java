package com.UST.Interviewscheduler.service;

import com.UST.Interviewscheduler.entity.Scheduler;
import com.UST.Interviewscheduler.repository.schedulerrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class schedulerservice {
    @Autowired
    private schedulerrepo repo;
    public Scheduler create(Scheduler scheduler) {
        return  repo.save(scheduler);
    }

    public List<Scheduler> get() {
        return repo.findAll();
    }




    public Scheduler findByName(String name) {
        return  repo.findByName(name);
    }
}
