package ua.goodvice.easylib.easylib.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.goodvice.easylib.easylib.dao.BookRepository;
import ua.goodvice.easylib.easylib.entity.Book;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookRepository bookRepository;

    @Override
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @Override
    public void saveBook(Book book) {
        SimpleDateFormat dateFormatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        book.setDate_added(dateFormatter.format(new Date()));
        bookRepository.save(book);
    }

    @Override
    public Book getBook(int id) {
        Book book = null;
        Optional<Book> optional = bookRepository.findById(id);
        if (optional.isPresent()) {
            book = optional.get();
        }
        return book;
    }

    @Override
    public void deleteBook(int id) {
        bookRepository.deleteById(id);
    }
}
