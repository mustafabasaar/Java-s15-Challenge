package com.workintech.LibraryModel.Model.Books;

public class Novels extends Books {

    private String bookType;
    public Novels(String bookID, String author, String bookName, double price, boolean isRented, String dateOfPurchase) {
        super(bookID, author, bookName, price, isRented, dateOfPurchase);
       super.setBookType("Novel");

    }

}
