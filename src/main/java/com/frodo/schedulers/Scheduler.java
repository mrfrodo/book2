package com.frodo.schedulers;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class Scheduler {

    @Scheduled(fixedDelay = 5000)
        public void scheduleFixedDelayTask() {
            System.out.println(
            "Fixed delay task - " + System.currentTimeMillis() / 1000);
        }
    
}
