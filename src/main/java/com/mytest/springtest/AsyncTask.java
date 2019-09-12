package com.mytest.springtest;


import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import java.util.Stack;

@Async
@Component
public class AsyncTask {

    public void testTask() throws Exception{
        Thread.sleep(3000L);
        System.out.println(Thread.activeCount());
        System.out.println(Thread.currentThread().getName()+"模拟任务。。。");

    }

    public static void main(String[] args) {
        System.out.println(65536*2 >>>16);
        System.out.println(Math.pow(2,2));

    }
}
