package com.tutorialspoint;

public class Spring_BeanPostProcessor_HelloWorld {
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public void getMessage(){
        System.out.println("Your Message: " + message);
    }

    public void init(){
        System.out.println("Bean is going through init.");
    }

    public void destroy(){
        System.out.println("Bean will be destroied now");
    }
}
