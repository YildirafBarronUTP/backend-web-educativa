package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebEducativaApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebEducativaApplication.class, args);
        System.out.println("¡Backend de Web Educativa iniciado correctamente!");
    }
}