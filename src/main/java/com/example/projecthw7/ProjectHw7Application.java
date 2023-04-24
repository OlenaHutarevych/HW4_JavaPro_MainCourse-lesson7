package com.example.projecthw7;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjectHw7Application {

    public static void main(String[] args) {

        // отримання контексту

        var context = SpringApplication.run(ProjectHw7Application.class, args);

        // дістаємо бін @Bean за допомогою класу біна

        var beanBeanString = context.getBean(String.class);
        System.out.println(beanBeanString);

        // дістаємо бін @Component за допомогою імені біна

        var beanComponentString = context.getBean("component");
        System.out.println(beanComponentString);

        // дістаємо бін @Repository за допомогою класу

        var beanRepository= context.getBean(BeanRepositiory.class);

        //перевірка - дістали метод з біна BeanRepositiory
        var beanRepositoryString= context.getBean(BeanRepositiory.class).repositoryBean();
        System.out.println(beanRepositoryString);

    }
}
