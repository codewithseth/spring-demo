package com.codewithseth;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * No lazy or eager inside this scope
 */
@Component
@Scope(value = BeanDefinition.SCOPE_PROTOTYPE)
public class Ipad {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
