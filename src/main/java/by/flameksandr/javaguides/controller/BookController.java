package by.flameksandr.javaguides.controller;

import by.flameksandr.javaguides.beans.Book;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class BookController {

    @RequestMapping("/hello-world")
    public String helloWorld() {
        return "Hello World!";
    }

    @GetMapping(value = {"/book", "/java-core", "/java"})
    public Book getBook() {
        return new Book(1, "Core Java", "Learn Core Java and Latest features");
    }

    @PostMapping(value = "/books/create")
    public Book createBook(Book book){
        System.out.println(book.getId());
        System.out.println(book.getTitle());
        System.out.println(book.getDescription());

        return book;
    }
}