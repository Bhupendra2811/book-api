package com.example.bookapp.Repository;


import com.example.bookapp.Model.Book;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class BookDB {



    static ArrayList<Book> booksList = new ArrayList<>();

    public static String saveBook(Book book) {
        for (Book books : booksList) {
            if (books.getId() == book.getId()) {
                return "not able to store book";
            }

        }
        booksList.add(book);
        return "book stored succesfully";
    }
    public List<Book> getBooks(){
        return booksList;
    }
    public Book getBookById(long id){
        for (Book books : booksList) {
            if (books.getId() == id) {
                return books;
            }
        }
        return null;
    }

    public Book updateBook(long id, Book book) {
        for (Book books : booksList) {
            if (books.getId() == id) {
                books.setId(id);
                books.setAuthorName(book.getAuthorName());
                books.setCost(book.getCost());
                BookDB.saveBook(books);
                return books;
            }
        }
        return null;
    }

    public Book deleteBooks(long id) {
        for (Book books : booksList) {
            if (books.getId() == id) {
               booksList.remove(books);
               break;
            }
        }
        return null;
    }
}
