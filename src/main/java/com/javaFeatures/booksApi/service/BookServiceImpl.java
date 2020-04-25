package com.javaFeatures.booksApi.service;

import com.javaFeatures.booksApi.model.Book;
import com.javaFeatures.booksApi.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public List<Book> getAllBooks() {
        List<Book> books = new ArrayList<>();
        bookRepository.findAll().forEach(books::add);
        return books;
    }

    @Override
    public Book getBooksById(String id) {
        return bookRepository.getOne(id);
    }

    @Override
    public void addBook(Book book) {
        bookRepository.save(book);
    }

    @Override
    public void updateBook(String id, Book book) {
        bookRepository.save(book);
    }

    @Override
    public void deleteBook(String id) {
        bookRepository.deleteById(id);
    }
}
