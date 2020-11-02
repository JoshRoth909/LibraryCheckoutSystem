package com.labC.libraryCheckoutSystem;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long bookId;
    private Long userId;
    private String book;
    private boolean checkStatus;
    public Cart(Long id, Long bookId, Long userId, String book, boolean checkStatus) {
        this.id = id;
        this.bookId = bookId;
        this.userId = userId;
        this.book = book;
        this.checkStatus = checkStatus;
    }

    public Long getId(){
        return id;
    }

    public void setId(Long id){ this.id = id; }

    public Long getBookId() { return bookId; }

    public void setBookId(Long bookId) { this.bookId = bookId; }

    public Long getUserId() { return userId; }

    public void setUserId(Long userId) { this.userId = userId; }

    public String getBook(){
        return book;
    }

    public void setBook(String book){
        this.book = book;
    }

    public boolean isCheckStatus() { return checkStatus; }

    public void setCheckStatus(boolean checkStatus) { this.checkStatus = checkStatus; }

}
