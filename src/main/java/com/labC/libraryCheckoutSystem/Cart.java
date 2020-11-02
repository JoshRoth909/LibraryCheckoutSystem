package com.labC.libraryCheckoutSystem;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int id;
    private String book;
    private boolean checkStatus;
    public Cart(int id, String book, boolean checkStatus) {
        this.id = id;
        this.book = book;
        this.checkStatus = checkStatus;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){ this.id = id; }

    public String getBook(){
        return book;
    }

    public void setBook(String book){
        this.book = book;
    }

    public boolean getCheckStatus(){
        return checkStatus;
    }

    public void setCheckStatus(boolean checkStatus){
        this.checkStatus = checkStatus;
    }

}
