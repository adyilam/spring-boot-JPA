package com.javaFeatures.booksApi.model;

public class Book {
    private String id;
    private String Authors;
    private String publisher;
    private String publishedDate;
    private String description;

    public Book(Book book) {
    }

    public Book( String id, String authors, String publisher, String publishedDate, String description) {
        this.id = id;
        Authors = authors;
        this.publisher = publisher;
        this.publishedDate = publishedDate;
        this.description = description;
    }


    public String getTitle() {
        return id;
    }

    public void setTitle(String title) {
        this.id = title;
    }

    public String getAuthors() {
        return Authors;
    }

    public void setAuthors(String authors) {
        Authors = authors;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(String publishedDate) {
        this.publishedDate = publishedDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Book{" +
                ", title='" + id + '\'' +
                ", Authors='" + Authors + '\'' +
                ", publisher='" + publisher + '\'' +
                ", publishedDate='" + publishedDate + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
