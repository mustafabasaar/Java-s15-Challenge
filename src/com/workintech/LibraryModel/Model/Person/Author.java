package com.workintech.LibraryModel.Model.Person;

import java.util.HashSet;
import java.util.Set;

public class Author extends Person{
    private Set<String>  ownBooks;
    public Author(String name) {
        super(name);
        this.ownBooks=new HashSet<>();
    }

    public Set<String> getOwnBooks() {
        return ownBooks;
    }

    public void setOwnBooks(Set<String> ownBooks) {
        this.ownBooks = ownBooks;
    }
public void addBook(String name){
        ownBooks.add(name);
}

    @Override
    public String toString() {
        return super.getName();
    }
}
