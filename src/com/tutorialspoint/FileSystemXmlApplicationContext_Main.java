package com.tutorialspoint;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class FileSystemXmlApplicationContext_Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext(
                "D:\\Spring_courses\\Spring_IOC_Contain\\src\\Beans.xml"
        );

        FileSystemXmlApplicationContext_HelloWorld fileSystemXmlApplicationContext_helloWorld =
                (FileSystemXmlApplicationContext_HelloWorld) applicationContext.getBean("fileSystemXmlApplicationContext_HelloWorld");
        fileSystemXmlApplicationContext_helloWorld.getMessage();
    }
}
