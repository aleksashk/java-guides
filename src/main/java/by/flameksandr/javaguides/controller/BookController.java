package by.flameksandr.javaguides.controller;

import by.flameksandr.javaguides.beans.Book;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    @RequestMapping("/hello-world")
    public String helloWorld() {
        return "Hello World!";
    }

    @RequestMapping("/book")
    public Book getBook() {
        Book book = new Book(1, "Core Java", "Learn Core Java and Latest features");
        return book;
    }
}
