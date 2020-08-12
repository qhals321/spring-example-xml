package spring_example.beans;

import org.springframework.stereotype.Component;

public class HelloWorldEn implements HelloWorld{
    @Override
    public void sayHello() {
        System.out.println("hello~~!!~!");
    }
}
