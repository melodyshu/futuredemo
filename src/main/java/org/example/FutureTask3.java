package org.example;

import java.util.concurrent.TimeUnit;

public class FutureTask3 {


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
        },"Hello",System.out::println);//回调

    }
}
