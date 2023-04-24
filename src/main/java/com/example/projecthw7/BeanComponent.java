package com.example.projecthw7;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;


@Component (value = "component")
public class BeanComponent {
    String componentReturn(){

        return "ComponentBean -Don't know yet what for ";
    }
    // Логуєумо (System.out.println()) бін на етапі  @PostConstruct.
    @PostConstruct

    void setUp (){
        System.out.println("bean @Component is ready to serve");
    }

}
