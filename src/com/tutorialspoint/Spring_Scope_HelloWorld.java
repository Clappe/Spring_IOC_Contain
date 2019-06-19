package com.tutorialspoint;

public class Spring_Scope_HelloWorld {
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public void getMessage(){
        System.out.println("Your Message: " + message);
    }
}
