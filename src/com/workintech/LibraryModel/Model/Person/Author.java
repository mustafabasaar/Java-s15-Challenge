package com.workintech.LibraryModel.Model.Person;
;

public class Author extends Person{

    public Author(String name) {
        super(name);
    }


    @Override
    public String toString() {
        return super.getName();
    }
}
