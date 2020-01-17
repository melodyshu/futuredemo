package org.example;

import java.util.concurrent.TimeUnit;

public class FutureTask1 {


    public static void main(String[] args) throws InterruptedException {
        FutureService<Void,Void> service=FutureService.newService();
        Future future=service.submit(()->{
            try {
                System.out.println("hello...");
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        future.get();
    }
}
