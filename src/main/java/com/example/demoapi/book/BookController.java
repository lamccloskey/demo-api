package com.example.demoapi.book;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
@RequiredArgsConstructor
public class BookController {

    private final BookService bookService;

    @RequestMapping(value = "/{id}", produces = "application/json")
    public Book getBook(@PathVariable int id) {
        return bookService.getBook(id);
    }
}
