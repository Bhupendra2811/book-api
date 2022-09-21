package com.example.bookapp.Service;

import com.example.bookapp.Model.Book;
import com.example.bookapp.Repository.BookDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class BookService {

    @Autowired
    BookDB bookDB;
    public String insertBook(@RequestBody Book book){

        return  bookDB.saveBook(book);
    }

    public List<Book> getAllBooks() {
        return bookDB.getBooks();
    }

    public Book getBookById(long id) {
        return bookDB.getBookById(id);
    }

    public Book updateBooks(long id, Book book) {
        return bookDB.updateBook(id,book);
    }

    public Book deleteBooks(long id) {
        return bookDB.deleteBooks(id);
    }
}
