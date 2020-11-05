package com.labC.libraryCheckoutSystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public interface CartService {

    @Autowired
    CartRepo cartRepo;

    public String saveCart(String book,boolean bookStatus);
}
