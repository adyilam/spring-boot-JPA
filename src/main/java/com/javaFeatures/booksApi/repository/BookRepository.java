package com.javaFeatures.booksApi.repository;

import com.javaFeatures.booksApi.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends JpaRepository<Book, String> {
}
