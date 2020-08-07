package spring_example.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring_example.beans.HelloWorld;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config/beans.xml");

        HelloWorld helloWorld = (HelloWorld) ctx.getBean("hello");
        callMethod(helloWorld);
        ctx.close();
    }

    public static void callMethod(HelloWorld helloWorld){
        helloWorld.sayhello();
    }
}
