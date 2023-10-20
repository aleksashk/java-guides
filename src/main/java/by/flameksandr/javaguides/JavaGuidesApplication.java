package by.flameksandr.javaguides;

import by.flameksandr.javaguides.controller.PizzaController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaGuidesApplication {

    public static void main(String[] args) {
        var context = SpringApplication.run(JavaGuidesApplication.class, args);
        PizzaController pizzaController = (PizzaController) context.getBean("pizzaDemo");
        System.out.println(pizzaController.getPizza());
    }

}