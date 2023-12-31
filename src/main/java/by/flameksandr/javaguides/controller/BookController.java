package by.flameksandr.javaguides.controller;

import by.flameksandr.javaguides.beans.Book;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
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

    @PostMapping(value = "/books/create",
            consumes = MediaType.APPLICATION_JSON_VALUE)
//    @ResponseStatus(value = HttpStatus.CREATED)
    public ResponseEntity<Book> createBook(@RequestBody Book book) {
        System.out.println(book.getId());
        System.out.println(book.getTitle());
        System.out.println(book.getDescription());

        return new ResponseEntity<>(book, HttpStatus.CREATED);
    }

    @PutMapping(value = "/books/update/{id}")
    public ResponseEntity<Book> updateBook(@PathVariable int id,
                                           @RequestBody Book updateBook) {
        System.out.println(id);
        System.out.println(updateBook.getTitle());
        System.out.println(updateBook.getDescription());
        updateBook.setId(id);
        return ResponseEntity.ok(updateBook);
    }

    @DeleteMapping(value = "/books/delete/{id}")
    public ResponseEntity<String> deleteBook(@PathVariable int id) {
        System.out.println(id);
        return ResponseEntity.ok("Book deleted successfully!");
    }

    @GetMapping("/books/{id}/{title}/{description}")
    public ResponseEntity<Book> pathVariableDemo(@PathVariable int id,
                                                 @PathVariable(name = "title") String bookTitle,
                                                 @PathVariable(name = "description") String bookDescription) {
        System.out.println(id);
        Book book = new Book();
        book.setId(id);
        book.setTitle(bookTitle);
        book.setDescription(bookDescription);

        return ResponseEntity.ok(book);
    }

    //http:localhost:8080/api/books/query?id=1&title=Core Java&description=Core Java Description
    @GetMapping("/books/query")
    public ResponseEntity<Book> requestParamDemo(
            @RequestParam(name = "id") int id,
            @RequestParam(name = "title") String title,
            @RequestParam(name = "description") String description
    ) {
        System.out.println(id);
        System.out.println(title);

        Book book = new Book();
        book.setId(id);
        book.setTitle(title);
        book.setDescription(description);

        return ResponseEntity.ok(book);
    }
}