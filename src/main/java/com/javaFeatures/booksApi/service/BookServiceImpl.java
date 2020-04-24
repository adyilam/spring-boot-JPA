package com.javaFeatures.booksApi.service;

import com.javaFeatures.booksApi.model.Book;
import com.javaFeatures.booksApi.repository.IMDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BookServiceImpl implements BookService {
    @Autowired
    public IMDB imdb;

    @Override
    public List<Book> getAllBooks() {
        return imdb.getBooks();
    }

    @Override
    public Book getBooksById(String id) {
        return imdb.getBook(id);
    }

    @Override
    public void addBook(Book book) {
        imdb.addBook(book);
    }

    @Override
    public void updateBook(String id, Book book) {
        imdb.updateBook(id, book);
    }

    @Override
    public void deleteBook(String id) {
        imdb.deleteBook(id);
    }
}
