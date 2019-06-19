package com.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpingBean_LifeCycle_Main {
    public static void main(String[] args) {
        AbstractApplicationContext abstractApplicationContext = new ClassPathXmlApplicationContext("Beans.xml");
        SpringBean_LifeCycle_HelloWorld springBean_lifeCycle_helloWorld = (SpringBean_LifeCycle_HelloWorld)
                abstractApplicationContext.getBean("SpringBean_LifeCycle_HelloWorld");
        springBean_lifeCycle_helloWorld.getMessage();
        abstractApplicationContext.registerShutdownHook();
    }
}
