package ua.goodvice.easylib.easylib.service;

import ua.goodvice.easylib.easylib.entity.Book;

import java.util.List;

public interface BookService {
    public List<Book> getAllBooks();

    public void saveBook();

    public Book getBook(int id);

    public Book deleteBook(int id);
}
