package by.flameksandr.javaguides.config;

import by.flameksandr.javaguides.controller.PizzaController;
import by.flameksandr.javaguides.service.NonVegPizza;
import by.flameksandr.javaguides.service.Pizza;
import by.flameksandr.javaguides.service.VegPizza;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Pizza vegPizza() {
        return new VegPizza();
    }

    @Bean
    public Pizza nonVegPizza() {
        return new NonVegPizza();
    }

    @Bean
    public PizzaController pizzaController() {
        return new PizzaController(vegPizza());
    }

}
