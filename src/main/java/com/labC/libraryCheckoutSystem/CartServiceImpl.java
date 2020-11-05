package com.labC.libraryCheckoutSystem;

public class CartServiceImpl implements CartService{

    @Override
    public String saveCart(String book, boolean bookStatus) {
        return "Book added to cart";
    }
}
