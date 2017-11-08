package com.fsd.learning.libraryservice.bookstore;

import com.fsd.learning.libraryservice.bookstore.model.BookDocument;
import com.fsd.learning.libraryservice.bookstore.service.BookRepositoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

@RestController
public class BookStoreImplementation {

    @Autowired
    private BookRepositoryService bookRepositoryService;

    @RequestMapping("/getAllBooks")
    public List<BookDocument> getBooks(){

        List<BookDocument> bookDocList = new ArrayList<BookDocument>();
        for(BookDocument bookDoc : bookRepositoryService.findAll()){
            System.out.println("Book Document  " + bookDoc);
            bookDocList.add(bookDoc);
        }
        return bookDocList;
    }

    @RequestMapping("/addBook")
    public String addBooks(){
        BookDocument bookDoc1 = new BookDocument("1","ABC","ABC.............");
        BookDocument bookDoc2 = new BookDocument("2","DEF","DEF.............");

        bookRepositoryService.save(bookDoc1);
        bookRepositoryService.save(bookDoc2);

        return "Books added successfully";
    }


}
