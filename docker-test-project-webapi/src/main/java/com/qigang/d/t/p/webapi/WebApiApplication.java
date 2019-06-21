package com.qigang.d.t.p.webapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.qigang.d.t.p"})
public class WebApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(WebApiApplication.class,args);
    }
}
