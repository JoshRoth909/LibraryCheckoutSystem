package com.labC.libraryCheckoutSystem;

import org.springframework.data.repository.CrudRepository;

import java.awt.print.Book;

public interface BookRepo extends CrudRepository<Book, Long> {



}
