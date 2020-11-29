package com.eureka;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class,HibernateJpaAutoConfiguration.class})
@EnableEurekaServer
public class EurekaApplication {
	public static void main(String[] args) {
        SpringApplication.run(EurekaApplication.class, args);
    }
	
    @Value("${server.port}")
    String port;//1112

    @RequestMapping("/hello")
    public String home() {
        return "hello world from port " + port;
    

}
}
