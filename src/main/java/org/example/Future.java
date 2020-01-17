package org.example;

public interface Future<T> {
    T get() throws InterruptedException;

    boolean done();
}
