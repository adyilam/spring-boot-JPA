package com.javaFeatures.booksApi.service;

import com.javaFeatures.booksApi.model.Book;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BookService {
    List<Book> getAllBooks();

    Book getBooksById(String id);

    void addBook(Book book);

    void updateBook(String id, Book book);

    void deleteBook(String id);

}
