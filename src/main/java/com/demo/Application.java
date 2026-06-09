package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @GetMapping("/")
    public String home() {
        return "<div style='text-align:center; margin-top:50px; font-family:sans-serif;'>" +
               "<h1 style='color:green;'>✅ Mission DevSecOps accomplie !</h1>" +
               "<p>La vraie application Java tourne parfaitement sur le port 8081.</p>" +
               "</div>";
    }
}
