package org.example;

import com.sun.org.apache.regexp.internal.REUtil;

import java.util.concurrent.TimeUnit;

public class FutureTask2 {


    public static void main(String[] args) throws InterruptedException {
        FutureService<String,Integer> service=FutureService.newService();
        Future<Integer> future=service.submit(input->{
            try {
                System.out.println("hello...");
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return input.length();
        },"Hello");

        int result=future.get();
        System.out.println(result);
    }
}
