package com.example.demoapi.book;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class BookService {

    private Map<Integer, Book> books = new HashMap<>() {{
        put(1, new Book("I Am Legend"));
    }};

    Book getBook(int id) {
        return books.get(id);
    }
}
