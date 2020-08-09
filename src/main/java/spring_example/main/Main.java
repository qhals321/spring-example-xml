package spring_example.main;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import spring_example.beans.HelloWorld;

public class Main {
    public static void main(String[] args) {
        //beanFactory();
        applicationContext();

    }

    public static void callMethod(HelloWorld helloWorld){
        helloWorld.sayhello();
    }

    public static void applicationContext(){
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config/beans.xml");
        HelloWorld helloWorld = (HelloWorld) ctx.getBean("hello");
        callMethod(helloWorld);
        ctx.close();
    }

    public static void beanFactory(){
        ClassPathResource res = new ClassPathResource("config/beans.xml");
        XmlBeanFactory factory = new XmlBeanFactory(res);

        HelloWorld helloWorld = (HelloWorld) factory.getBean("hello");
        callMethod(helloWorld);
    }
}
