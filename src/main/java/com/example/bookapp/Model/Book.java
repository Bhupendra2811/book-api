package com.example.bookapp.Model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Book {

    private long id;

    private String authorName;
    private int cost ;

    public Book(long id, String authorName, int cost) {
        this.id = id;
        this.authorName = authorName;
        this.cost = cost;
    }
}
