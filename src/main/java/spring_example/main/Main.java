package spring_example.main;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring_example.config.BeanConfiguration;
import spring_example.database.DAO;
import spring_example.service.SayService;

public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config/beans.xml");

        AnnotationConfigApplicationContext anx = new AnnotationConfigApplicationContext(BeanConfiguration.class);
        DAO dAO = anx.getBean("DAO", DAO.class);
        dAO.selectMember().stream().forEach(x-> System.out.println(x));

    }

}
