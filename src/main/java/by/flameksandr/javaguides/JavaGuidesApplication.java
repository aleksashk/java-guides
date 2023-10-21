package by.flameksandr.javaguides;

import by.flameksandr.javaguides.value.ValueAnnotationDemo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaGuidesApplication {

    public static void main(String[] args) {
        var context = SpringApplication.run(JavaGuidesApplication.class, args);
        ValueAnnotationDemo valueAnnotationDemo = context.getBean(ValueAnnotationDemo.class);
        System.out.println(valueAnnotationDemo.getDefaultName());

    }

}
