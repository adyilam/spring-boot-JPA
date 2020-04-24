package com.javaFeatures.booksApi.repository;

import com.javaFeatures.booksApi.model.Book;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class IMDB {

    private List<Book> books = new ArrayList<>(Arrays.asList(
            new Book("Coding Languages for Absolute Beginners", "Zach Webber", "", "2018", " Science & Technology, Technology"),
            new Book("Head First Java", "Kathy Sierra, Bert Bates", "", "April 22.2020", "Head First Java compresses the time it takes to learn and retain--complex information. Its unique approach not only shows you what you need to know about Java syntax, it teaches you to think like a Java programmer. If you want to be bored, buy some other book. But if you want to understand Java, this book's for you"),
            new Book("Agile Project Management", "Jeremy Savell", "Independently published", "22 November 2019", "A Beginner's Guide to Agile Implementation and Leadership")
    ));

    public List<Book> getBooks() {
        return books;
    }

    public Book getBook(String id) {
        return books.stream()
                .filter(b -> b.getTitle().equalsIgnoreCase(id)).findFirst().get();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void updateBook(String id, Book book) {
        for (int i = 0; i < books.size(); i++) {
            Book b = books.get(i);
            if (b.getTitle().equals(id)) {
                books.set(i, book);
                return;
            }
        }
    }

    public void deleteBook(String id) {
        books.removeIf(b -> b.getTitle().equals(id));
    }

}

