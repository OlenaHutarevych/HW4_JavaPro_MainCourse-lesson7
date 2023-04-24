package com.example.projecthw7;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class BeanController {
    @GetMapping("/hello")
    public String hello(){
        return "index.html";
    }

    // Логуєумо (System.out.println()) бін на етапі  @PostConstruct.
    @PostConstruct
    void setUp (){
        System.out.println("bean @Controller is ready to serve");
    }

}
