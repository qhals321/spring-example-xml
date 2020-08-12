package spring_example.service;

import org.springframework.stereotype.Component;
import spring_example.beans.HelloWorld;

@Component
public class SayService {
    HelloWorld helloWorld;

    public SayService(HelloWorld helloWorld) {
        this.helloWorld = helloWorld;
    }

    public void sayHello(){
        helloWorld.sayHello();
    }
}
