package com.fsd.learning.libraryservice.bookstore.model;

import org.springframework.data.annotation.Id;

public class BookDocument {

    @Id
    public String id;
    public String bookName;
    public String bookData;

    public BookDocument(){ };

    public BookDocument(String id, String bookName, String bookData){
        this.setId(id);
        this.setBookData(bookData);
        this.setBookName(bookName);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setBookData(String bookData) {
        this.bookData = bookData;
    }
      public String getBookData() {
        return bookData;
    }
}
