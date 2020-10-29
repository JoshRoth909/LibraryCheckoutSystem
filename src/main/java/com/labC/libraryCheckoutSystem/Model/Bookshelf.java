package com.labC.libraryCheckoutSystem.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Bookshelf {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public Bookshelf() {}

    public Long getId() {
        return id;
    }
}
