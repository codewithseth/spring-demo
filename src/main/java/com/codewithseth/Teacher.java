package com.codewithseth;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class Teacher {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Run after it finishes creating the bean
    @PostConstruct
    public void initialize() {
        this.name = "Dara";
    }

    // Run before clearing and destroy the context
    @PreDestroy
    public void destroy() {
        System.out.println("Destroying teacher bean...");
    }
}
