package com.junsheng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SecurityDemoRunner {
    public static void main(String[] args) {
        System.out.println("spring-security-demo run....");
        SpringApplication.run(SecurityDemoRunner.class,args);
    }
}
