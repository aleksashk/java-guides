package by.flameksandr.javaguides;

import by.flameksandr.javaguides.scope.PrototypeBean;
import by.flameksandr.javaguides.scope.SingletonBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaGuidesApplication {

    public static void main(String[] args) {
        var context = SpringApplication.run(JavaGuidesApplication.class, args);
        SingletonBean singletonBean1 = context.getBean(SingletonBean.class);
        SingletonBean singletonBean2 = context.getBean(SingletonBean.class);
        SingletonBean singletonBean3 = context.getBean(SingletonBean.class);

        PrototypeBean prototypeBean1 = context.getBean(PrototypeBean.class);
        PrototypeBean prototypeBean2 = context.getBean(PrototypeBean.class);
        PrototypeBean prototypeBean3 = context.getBean(PrototypeBean.class);


    }

}
