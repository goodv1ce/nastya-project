package ua.goodvice.easylib.easylib.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ua.goodvice.easylib.easylib.entity.Book;
import ua.goodvice.easylib.easylib.service.BookService;

import java.util.List;

/**
 * REST Controller
 * Contains methods that interact with database via entity classes
 * Mostly of the functionality is in the service classes
 *
 * @author goodvice
 * @version 1.0
 */
@RestController
@RequestMapping("/api")
public class RESTController {
    /**
     * Autowired book service class.
     * Contains main functionality of interacting with database
     */
    @Autowired
    private BookService bookService;

    /**
     * Returns all books that are in the database
     *
     * @return List of Book objects in JSON format
     */
    @GetMapping("/books")
    public List<Book> showAllBooks() {
        return bookService.getAllBooks();
    }

    /**
     * Returns book by id from database
     *
     * @param id book id
     * @return Information about the book in JSON format
     */
    @GetMapping("/books/{id}")
    public Book getBook(@PathVariable int id) {
        return bookService.getBook(id);
    }

    /**
     * Adds new book in the database
     * Book object is generated from the JSON from HTTP request body
     * 'id' and 'date-added' properties are ignored if present
     *
     * @param book Book object
     * @return Book object in the JSON format after adding
     */
    @PostMapping("/books")
    public Book addNewBook(@RequestBody Book book) {
        bookService.saveBook(book);
        return book;
    }

    /**
     * Updating information about the book in the database
     * New information takes from JSON in HTTP request body
     * Which book needs to be updated becomes known by the 'id' property
     *
     * @param book Book object
     * @return Book object in the JSON format after updating
     */
    @PutMapping("/books")
    public Book updateBook(@RequestBody Book book) {
        bookService.saveBook(book);
        return book;
    }

    /**
     * Deleting book from database by id
     *
     * @param id book id that is needed to be deleted
     * @return String object with information about successful deleting book with some id
     */
    @DeleteMapping("/books/{id}")
    public String deleteBook(@PathVariable int id) {
        bookService.deleteBook(id);
        return "Book with ID = " + id + " was delated!";
    }
}
