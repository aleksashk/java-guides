package by.flameksandr.javaguides.repository;

import org.springframework.stereotype.Repository;

@Repository
public class MyRepository {

    public String hello() {
        return "Hello repository";
    }
}
