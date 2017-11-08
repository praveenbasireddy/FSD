package com.fsd.learning.libraryservice.bookstore.service;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.fsd.learning.libraryservice.bookstore.model.BookDocument;

public interface BookRepositoryService extends MongoRepository<BookDocument, String> {
    public BookDocument findByBookName(String bookName);
}
