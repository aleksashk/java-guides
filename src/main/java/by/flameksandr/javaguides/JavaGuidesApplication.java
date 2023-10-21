package by.flameksandr.javaguides;

import by.flameksandr.javaguides.controller.MyController;
import by.flameksandr.javaguides.lazy.LazyLoader;
import by.flameksandr.javaguides.repository.MyRepository;
import by.flameksandr.javaguides.service.MyService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaGuidesApplication {

    public static void main(String[] args) {
        var context = SpringApplication.run(JavaGuidesApplication.class, args);
        MyController myController = context.getBean(MyController.class);
        System.out.println(myController.hello());

        MyService myService = context.getBean(MyService.class);
        System.out.println(myService.hello());

        MyRepository myRepository = context.getBean(MyRepository.class);
        System.out.println(myRepository.hello());

        LazyLoader lazyLoader = context.getBean(LazyLoader.class);


    }

}
