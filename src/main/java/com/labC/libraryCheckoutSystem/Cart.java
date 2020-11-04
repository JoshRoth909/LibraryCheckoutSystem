package com.labC.libraryCheckoutSystem;


import javax.persistence.*;

@Entity
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private boolean bookStatus;

    @OneToOne(mappedBy = "users")
    private Users user;

    @OneToMany(mappedBy = "cart")
    private List<Books> books;

    public Cart() { }

    public Long getId(){
        return id;
    }

    public List<Books> getBooks(){
        return books;
    }

    public boolean isBookStatus() { return bookStatus; }

}
