package org.example;

@FunctionalInterface
public interface Task<IN, OUT> {
    OUT get(IN input);
}
