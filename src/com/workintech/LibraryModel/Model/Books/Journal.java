package com.workintech.LibraryModel.Model.Books;

import com.workintech.LibraryModel.Model.Person.Author;

public class Journal extends Book {

     private String journalType;

    public Journal(String bookID,String bookType, Author author, String bookName, double price, boolean isRented, String dateOfPurchase, String journalType) {
        super(bookID,bookType, author, bookName, price, isRented, dateOfPurchase);
        this.journalType = journalType;
    }


    public String getJournalType() {
        return journalType;
    }

    public void setJournalType(String journalType) {
        this.journalType = journalType;
    }


}
