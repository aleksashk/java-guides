package by.flameksandr.javaguides.config;

import by.flameksandr.javaguides.controller.PizzaController;
import by.flameksandr.javaguides.service.NonVegPizza;
import by.flameksandr.javaguides.service.Pizza;
import by.flameksandr.javaguides.service.VegPizza;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
public class AppConfig {

    @Lazy
    @Bean
    public Pizza vegPizza() {
        return new VegPizza();
    }

    @Bean
    public Pizza nonVegPizza() {
        return new NonVegPizza();
    }

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public PizzaController pizzaController() {
        return new PizzaController(nonVegPizza());
    }

}
