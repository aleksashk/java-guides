package by.flameksandr.javaguides.config;

import by.flameksandr.javaguides.service.Pizza;
import by.flameksandr.javaguides.service.VegPizza;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name = "vegPizzaBean")
    public Pizza vegPizza() {
        return new VegPizza();
    }

}
