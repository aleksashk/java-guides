package by.flameksandr.javaguides;

import by.flameksandr.javaguides.propertysource.PropertySourceDemo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaGuidesApplication {

    public static void main(String[] args) {
        var context = SpringApplication.run(JavaGuidesApplication.class, args);
        PropertySourceDemo propertySourceDemo = context.getBean(PropertySourceDemo.class);

        System.out.println(propertySourceDemo.getHost());
        System.out.println(propertySourceDemo.getEmail());
        System.out.println(propertySourceDemo.getPassword());
    }

}
