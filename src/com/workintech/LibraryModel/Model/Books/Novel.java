package com.workintech.LibraryModel.Model.Books;


import com.workintech.LibraryModel.Model.Person.Person;

public class Novel extends Book {

    public Novel(String bookID, String bookType, Person author, String bookName, double price, boolean isRented, String dateOfPurchase) {
        super(bookID, bookType,author, bookName, price, isRented, dateOfPurchase);
    }

}
