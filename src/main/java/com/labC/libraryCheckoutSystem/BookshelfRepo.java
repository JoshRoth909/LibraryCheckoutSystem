package com.labC.libraryCheckoutSystem;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookshelfRepo extends CrudRepository<Bookshelf, Long> {
}
