package com.labC.libraryCheckoutSystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookshelfServiceImpl implements BookshelfService{

   @Autowired
   BookshelfRepo bookshelfRepo;

   public BookshelfServiceImpl(BookshelfRepo bookshelfRepo){
      this.bookshelfRepo = bookshelfRepo;
   }

   @Override
   public Optional<Bookshelf> getBookshelfById(Long id) {
      return bookshelfRepo.findById(id);
   }

   @Override
   public void saveBookshelf(Bookshelf bookshelf) {
      bookshelfRepo.save(bookshelf);
   }



}
