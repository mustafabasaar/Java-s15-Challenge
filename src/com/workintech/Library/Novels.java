package com.workintech.Library;

public class Novels extends Books{


    public Novels(String bookID, String author, String bookName, double price, boolean isRented, String dateOfPurchase) {
        super(bookID, author, bookName, price, isRented, dateOfPurchase);
       super.setBookType("Novel");
    }
}
