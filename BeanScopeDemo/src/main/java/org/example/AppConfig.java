package org.example;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan
public class AppConfig {

    @Bean
    @Scope("prototype")
    public User createUser(){
        return new User("Mayur", 21);
    }
}