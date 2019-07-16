package com.scheduling;

import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SimpleScheduleBuilder;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;

public class JobTriggerBuilder {

    public static void main(String[] args) throws SchedulerException {
        
        JobDetail jobDetail = JobBuilder.newJob(JobObject.class).build();
        Trigger trigger = TriggerBuilder.newTrigger().forJob(jobDetail).withIdentity("First scheduler")
                .withSchedule(SimpleScheduleBuilder.repeatSecondlyForever()).build();
        
        Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();
        scheduler.start();
        scheduler.scheduleJob(jobDetail, trigger);

    }

}
