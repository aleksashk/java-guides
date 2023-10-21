package by.flameksandr.javaguides.controller;

import by.flameksandr.javaguides.service.Pizza;

public class PizzaController {
    private final Pizza pizza;

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

    private void init() {
        System.out.println("Initialization Logic");
    }

    private void destroy() {
        System.out.println("Destroy Logic");
    }
}
