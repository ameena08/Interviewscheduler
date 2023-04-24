package com.UST.Interviewscheduler.repository;

import com.UST.Interviewscheduler.entity.Scheduler;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface schedulerrepo extends JpaRepository<Scheduler,Integer> {
    Scheduler findByName(String name);
}
