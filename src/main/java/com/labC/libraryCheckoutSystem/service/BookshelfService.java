package com.labC.libraryCheckoutSystem.service;

public interface BookshelfService {

    Optional<Bookshelf> getBookshelfById(Long id);
    void saveBookshelf(Bookshelf bookshelf);

}
