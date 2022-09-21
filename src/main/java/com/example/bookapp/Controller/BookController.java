package com.example.bookapp.Controller;

import com.example.bookapp.Model.Book;
import com.example.bookapp.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    BookService bookService;

    @PostMapping("/insertBook")
    public String insertBook(@RequestBody Book book){

        return bookService.insertBook(book);
    }

    @GetMapping("/getAllBooks")
    public List<Book> getAllBooks(){
        return bookService.getAllBooks();
    }
    @GetMapping("/getBookById/{id}")
    public Book getBookById(@PathVariable long id){
       return bookService.getBookById(id);
    }

    @RequestMapping("/updateBooks/{id}")
    public Book updateBooks(@PathVariable long id,@RequestBody Book book){
        return bookService.updateBooks(id,book);
    }
    @DeleteMapping("/deleteBooks/{id}")
    public Book deleteBooks(@PathVariable long id){
        return bookService.deleteBooks(id);
    }

}
