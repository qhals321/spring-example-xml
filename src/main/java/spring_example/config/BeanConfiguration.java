package spring_example.config;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.jdbc.core.JdbcTemplate;
import spring_example.beans.HelloWorld;
import spring_example.beans.HelloWorldEn;
import spring_example.beans.HelloWorldKr;
import spring_example.service.SayService;

@Configuration
@ComponentScan(basePackages = {"spring_example"})
@EnableAspectJAutoProxy
public class BeanConfiguration {

    @Bean
    HelloWorld helloWorld(){
//        return new HelloWorldEn();
        return new HelloWorldKr();
    }

    @Bean
    public BasicDataSource source(){
        BasicDataSource basicDataSource = new BasicDataSource();
        basicDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        basicDataSource.setUrl("jdbc:mysql://localhost:3306/parkingcar?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC");
        basicDataSource.setUsername("root");
        basicDataSource.setPassword("dbsqhals123!@#");
        return basicDataSource;
    }

    @Bean
    public JdbcTemplate db(BasicDataSource basicDataSource){
        JdbcTemplate db = new JdbcTemplate(basicDataSource);
        return db;
    }





}
