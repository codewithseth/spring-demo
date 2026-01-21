package com.codewithseth;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = "com.codewithseth")
public class Config {
    
    @Primary
    @Bean("p1")
    Person p1() {
        var p = new Person();
        p.setName("Sok");
        return p;
    }

    @Bean(value = "p2")
    Person p2() {
        var p = new Person();
        p.setName("Kha");
        return p;
    }

    @Bean(name = "p3")
    Person p3() {
        var p = new Person();
        p.setName("Keo");
        return p;
    }

    @Bean
    Cpu cpu1() {
        var cpu = new Cpu();
        cpu.setSpeed(100.30f);
        return cpu;
    }

    /**
     * Wiring beans using method call
     * @return
     */
    // @Bean
    // Computer c1() {
    //     var c = new Computer();
    //     c.setModel("MSI");
    //     c.setCpu(cpu1());
    //     return c;
    // }

    /**
     * Wiring beans using method parameters
     * @param cpu
     * @return
     */
    // @Primary
    @Bean
    Computer c1(Cpu cpu) {
        var c = new Computer();
        c.setModel("MSI");
        c.setCpu(cpu);
        return c;
    }

    @Bean
    Computer c2(Cpu cpu) {
        var c = new Computer();
        c.setModel("Asus");
        c.setCpu(cpu);
        return c;
    }

    @Bean
    @Scope(value = BeanDefinition.SCOPE_SINGLETON)
    Cat cat1() {
        var c = new Cat();
        c.setName("Meme");
        return c;
    }

    @Bean
    @Scope(value = BeanDefinition.SCOPE_SINGLETON)
    Cat cat2() {
        var c = new Cat();
        c.setName("Mooo");
        return c;
    }

    @Bean
    @Lazy
    Tiger tiger1() {
        var t = new Tiger();
        t.setName("Kal Kach");
        return t;
    }
}
