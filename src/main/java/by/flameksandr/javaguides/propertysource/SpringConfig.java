package by.flameksandr.javaguides.propertysource;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:mail.properties")
@PropertySource("classpath:messages.properties")
public class SpringConfig {

}
