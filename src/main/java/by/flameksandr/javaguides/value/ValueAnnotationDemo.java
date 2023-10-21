package by.flameksandr.javaguides.value;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ValueAnnotationDemo {

    @Value("Default name")
    private String defaultName;

    public String getDefaultName() {
        return defaultName;
    }
}
