package com.mytest.springtest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


@Component
public class AsyncJob {

    @Autowired
    AsyncTask asyncTask;

    @Scheduled(cron = "0/1 * * * * ?" )
    public void execute() throws Exception{
        for (int i = 0; i < 10; i++) {

            asyncTask.testTask();
        }
    }
}
