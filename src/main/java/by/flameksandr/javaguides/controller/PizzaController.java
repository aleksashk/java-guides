package by.flameksandr.javaguides.controller;

import org.springframework.stereotype.Component;

@Component("pizzaDemo")
public class PizzaController {
    public String getPizza() {
        return "Hot Pizza!";
    }
}
