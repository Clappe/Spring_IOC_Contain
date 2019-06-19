package com.tutorialspoint;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Spring_BeanPostProcessor_Main {
    public static void main(String[] args) {
        AbstractApplicationContext abstractApplicationContext = new ClassPathXmlApplicationContext("Beans.xml");
        Spring_BeanPostProcessor_HelloWorld spring_beanPostProcessor_helloWorld =
                (Spring_BeanPostProcessor_HelloWorld) abstractApplicationContext.getBean("Spring_BeanPostProcessor_HelloWorld");
        spring_beanPostProcessor_helloWorld.getMessage();
        abstractApplicationContext.registerShutdownHook();
    }
}
