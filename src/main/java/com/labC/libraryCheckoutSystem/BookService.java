package com.labC.libraryCheckoutSystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.influx.InfluxDbOkHttpClientBuilderProvider;
import org.springframework.stereotype.Service;

import javax.persistence.Id;
import javax.swing.text.html.Option;
import java.awt.print.Book;
import java.util.Optional;

@Service
public class BookService {
    @Autowired
    BookRepo bookRepo;
    //CREATE method
    public void addBook(Book book) {
        bookRepo.save(book);
    }
    //READ method
    public Optional<Book> readBook(Long id) {
       return bookRepo.findById(id);
    }
    //UPDATE method
    public void updateBook(Long id, Book newBook) {
        //Book newBook = new Book();
        bookRepo.findById(id);
        //implement later
    }
    //DELETE method

    public void deleteBook(Long id, Book newBook) {
        bookRepo.deleteById(id);
    }





}
