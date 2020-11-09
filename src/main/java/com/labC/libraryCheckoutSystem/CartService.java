package com.labC.libraryCheckoutSystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public interface CartService {

    public String saveCart(cart Id, String book);
}
