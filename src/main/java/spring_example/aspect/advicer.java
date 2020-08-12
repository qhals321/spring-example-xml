package spring_example.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class advicer {

    @Before("execution(* spring_example.service.SayService.sayHello())")
    public void before(){
        System.out.println("악수 슥삭");
    }
}
