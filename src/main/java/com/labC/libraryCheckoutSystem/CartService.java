package com.labC.libraryCheckoutSystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartService {

    @Autowired
    CartRepo cartRepo;

    public void saveCart(String book,boolean checkStatus){
        cartRepo.save(new Cart(book, checkStatus));
        System.out.println("Book added to cart");
    }
}
