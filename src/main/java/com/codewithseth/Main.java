package com.codewithseth;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.codewithseth.ex1.UserController;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(Config.class);

        // Create beans using @Bean
        Person p1 = context.getBean("p1", Person.class);
        System.out.println(p1.getName());

        Person p2 = context.getBean("p2", Person.class);
        System.out.println(p2.getName());

        Person p3 = context.getBean("p3", Person.class);
        System.out.println(p3.getName());

        Person pDef = context.getBean(Person.class);
        System.out.println(pDef.getName());

        Cpu cpu1 = context.getBean("cpu1", Cpu.class);
        System.out.println(cpu1.getSpeed());

        Computer c1 = context.getBean("c1", Computer.class);
        System.out.println("Model computer is = " + c1.getModel());
        System.out.println("Speed cpu computer is = " + c1.getCpu().getSpeed());

        // Create beans using @Component
        Teacher t1 = context.getBean("teacher", Teacher.class);
        System.out.println(t1.getName());

        Staff st1 = context.getBean("staff", Staff.class);
        System.out.println("Staff name is = " + st1.getName());
        System.out.println("Staff computer model = " + st1.getComputer().getModel());
        System.out.println("Staff computer cpu speed = " + st1.getComputer().getCpu().getSpeed());

        // Create beans using XML
        var context2 = new ClassPathXmlApplicationContext("beans.xml");
        
        Student s1 = context2.getBean("s1", Student.class);
        System.out.println(s1.getName());

        Student s2 = context2.getBean("s2", Student.class);
        System.out.println(s2.getName());

        // Singleton bean scope
        Dog dog1 = context.getBean("dog", Dog.class);
        Dog dog2 = context.getBean("dog", Dog.class);
        System.out.println(dog1.hashCode());
        System.out.println(dog2.hashCode());

        Cat cat1 = context.getBean("cat1", Cat.class);
        Cat cat2 = context.getBean("cat2", Cat.class);
        System.out.println(cat1.hashCode() + " / " + cat1.getName());
        System.out.println(cat2.hashCode() + " / " + cat2.getName());

        Tiger tiger1 = context.getBean("tiger1", Tiger.class);
        System.out.println(tiger1.getName());

        // Prototype bean scope
        Ipad ip1 = context.getBean("ipad", Ipad.class);
        Ipad ip2 = context.getBean("ipad", Ipad.class);
        System.out.println("Is it singleton bean scope " + (ip1.hashCode() == ip2.hashCode()));

        // Others
        var res = context.getBean(UserController.class);
        res.createUser();
        res.deleteUser();
        
        System.out.println(context.getBeanDefinitionCount());
        context.close();
        context2.close();
    }
}
