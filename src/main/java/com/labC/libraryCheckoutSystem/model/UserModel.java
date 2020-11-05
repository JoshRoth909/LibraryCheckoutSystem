package com.labC.libraryCheckoutSystem.model;

import javax.persistence.*;

@Entity
public class UserModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String email;

    //Relationship with bookshelf
    @OneToOne
    @JoinColumn(name="bookshelf_id")
    private Bookshelf bookshelf;

    //Relationship with cart
    @OneToOne
    @JoinColumn(name="cart_id")
    private Cart cart;


    //Constructors
    public UserModel(long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public UserModel(){}

    //Getters and Setters
    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
