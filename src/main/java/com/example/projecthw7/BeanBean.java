package com.example.projecthw7;

import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class BeanBean {
    @Bean
    String str (){
        return ("boo! I am Handmade bean by @Bean and @Configuration");
    }

    // Логуєумо (System.out.println()) бін на етапі  @PostConstruct.
    @PostConstruct
    void setUp (){
        System.out.println("bean @Bean is ready to serve");
    }

}
