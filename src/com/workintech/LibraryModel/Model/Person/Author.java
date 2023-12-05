package com.workintech.LibraryModel.Model.Person;

import com.workintech.LibraryModel.Model.Books.Books;

import java.util.Set;

public class Author extends Person{
    private Set<Books>  ownBooks;
    public Author(String name) {
        super(name);
    }

    public Set<Books> getOwnBooks() {
        return ownBooks;
    }

    public void setOwnBooks(Set<Books> ownBooks) {
        this.ownBooks = ownBooks;
    }

    @Override
    public String toString() {
        return "Author{" +
                "ownBooks=" + ownBooks +
                '}';
    }
}
