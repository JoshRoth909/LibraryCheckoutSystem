package com.labC.libraryCheckoutSystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CartService implements CommandLineRunner {

    @Autowired
    CartRepo cartRepo;

    @Autowired
    CartService cartService;


    @Override
    public void run(String... args) throws Exception {
        cartRepo.save(new Cart());
        System.out.println("Book added to cart");
    }
}
