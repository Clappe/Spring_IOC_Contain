package com.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Spring_Scope_Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Beans.xml");
        Spring_Scope_HelloWorld spring_scope_helloWorld1 = (Spring_Scope_HelloWorld) applicationContext.getBean("Spring_Scope_HelloWorld");
        spring_scope_helloWorld1.setMessage("I'm Object 1");
        spring_scope_helloWorld1.getMessage();
        Spring_Scope_HelloWorld spring_scope_helloWorld2 = (Spring_Scope_HelloWorld) applicationContext.getBean("Spring_Scope_HelloWorld");
        spring_scope_helloWorld2.getMessage();

    }
}
