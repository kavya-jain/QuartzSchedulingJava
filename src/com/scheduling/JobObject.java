package com.scheduling;

import java.time.LocalDateTime;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class JobObject implements Job {

    @Override
    public void execute(JobExecutionContext arg0) throws JobExecutionException {
        
        System.out.println("Time: " + LocalDateTime.now());
        
    }

}
