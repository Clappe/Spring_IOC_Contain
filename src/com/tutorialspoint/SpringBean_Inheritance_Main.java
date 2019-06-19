package com.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringBean_Inheritance_Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Beans.xml");

        SpringBean_Inheritance_HelloWorld springBean_inheritance_helloWorld =
                (SpringBean_Inheritance_HelloWorld) applicationContext.getBean("SpringBean_Inheritance_HelloWorld");
        springBean_inheritance_helloWorld.getMessage1();
        springBean_inheritance_helloWorld.getMessage2();

        SpringBean_Inheritance_HelloIndia springBean_inheritance_helloIndia =
                (SpringBean_Inheritance_HelloIndia) applicationContext.getBean("SpringBean_Inheritance_HelloIndia");
        springBean_inheritance_helloIndia.getMessagge1();
        springBean_inheritance_helloIndia.getMessage2();
        springBean_inheritance_helloIndia.getMessage3();
    }
}
