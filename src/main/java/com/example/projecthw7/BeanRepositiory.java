package com.example.projecthw7;

import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;
@Configuration
@Repository

public class BeanRepositiory {
    @Bean
    Boolean repositoryBean (){
        return (true);
    }
    // Логуєумо (System.out.println()) бін на етапі  @PostConstruct.
    @PostConstruct

    void setUp (){
        System.out.println("bean @Repositiory is ready to serve");
    }
}
