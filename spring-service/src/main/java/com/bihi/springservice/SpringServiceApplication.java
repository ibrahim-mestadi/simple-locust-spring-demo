package com.bihi.springservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpringServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringServiceApplication.class, args);
    }

    @RestController
    class Resource {
        @GetMapping(value = "/greet")
        public String greet() {
            System.out.println("hello");
            return "Load test" ;
        }
    }

}
