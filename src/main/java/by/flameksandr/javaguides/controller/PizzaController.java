package by.flameksandr.javaguides.controller;

import by.flameksandr.javaguides.service.VegPizza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("pizzaDemo")
public class PizzaController {
    private VegPizza vegPizza;

    @Autowired
    public PizzaController(VegPizza vegPizza) {
        this.vegPizza = vegPizza;
    }

    public String getPizza() {
        return vegPizza.getPizza();
    }
}
