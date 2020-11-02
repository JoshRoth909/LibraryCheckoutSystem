package com.labC.libraryCheckoutSystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookshelfService{

   @Autowired
   BookshelfRepo bookshelfRepo;

   public void saveBookshelf(){
      bookshelfRepo.save(new Bookshelf());
   }

}
