package org.aks.springboot;

import org.aks.springboot.configuration.JpaConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
 
 
/*@EnableAutoConfiguration
@ComponentScan("com.aks.springboot")*/
@Import(JpaConfiguration.class)
@SpringBootApplication(scanBasePackages={"org.aks.springboot"})// same as @Configuration @EnableAutoConfiguration @ComponentScan combined
public class SpringBootStandAloneApp {
 
    public static void main(String[] args) {
        SpringApplication.run(SpringBootStandAloneApp.class, args);
    }
}
