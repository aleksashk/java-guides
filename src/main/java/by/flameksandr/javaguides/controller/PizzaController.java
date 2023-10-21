package by.flameksandr.javaguides.controller;

import by.flameksandr.javaguides.service.Pizza;

public class PizzaController {
    private Pizza pizza;

    public PizzaController(Pizza pizza) {
        this.pizza = pizza;
    }


//    @Autowired
//    public void setVegPizza(VegPizza vegPizza) {
//        this.vegPizza = vegPizza;
//    }

    public String getPizza() {
        return pizza.getPizza();
    }
}
