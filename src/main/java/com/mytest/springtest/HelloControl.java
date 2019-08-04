package com.mytest.springtest;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class HelloControl {

    @RequestMapping("/hello")
    private String  hello(String[] ar) {
        return "hello";
    }

    private String a (){
        return "";
    }

    // 2 4 6 8 .和5 组合
    //10！=10 9 8 7 6 5 4 3 2 1= 3628800
    // 30! =30 25 20 15 10 5
    public static int trailingZeroes(int n) {
        int count =0;
        while (n >=5){
            count += n/5;
            n/=5;
        }
        return count;
    }

    public static void main(String[] args) {

        System.out.println(trailingZeroes(30));
    }
}
