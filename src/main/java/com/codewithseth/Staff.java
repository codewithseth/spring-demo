package com.codewithseth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Staff {
    private String name = "Cambodia";
    private final Computer computer;

    /**
     * Using @Autowired on fields
     */
    // @Autowired
    // private Computer computer;

    /**
     * Using @Autowired on setter
     * @param computer
     */
    // @Autowired
    // public void setComputer(Computer computer) {
    //     this.computer = computer;
    // }

    /**
     * Using @Autowired on constructor
     * @param computer
     */
    @Autowired
    public Staff(@Qualifier("c2") Computer computer) {
        this.computer = computer;
    }
    
    public String getName() {
        return name;
    }

    public Computer getComputer() {
        return computer;
    }
}
