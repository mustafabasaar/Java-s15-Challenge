package com.workintech.LibraryModel.Model.Books;

import com.workintech.LibraryModel.Model.Person.Author;

public class Novel extends Book {

    private String bookType;
    public Novel(String bookID, Author author, String bookName, double price, boolean isRented, String dateOfPurchase) {
        super(bookID, author, bookName, price, isRented, dateOfPurchase);
       super.setBookType("Novel");

    }

}
