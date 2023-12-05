package com.workintech.LibraryModel.Model.Books;

import com.workintech.LibraryModel.Model.Person.Author;

public class Journal extends Book {

     private String journalType;

    public Journal(String bookID, Author author, String bookName, double price, boolean isRented, String dateOfPurchase, String journalType) {
        super(bookID, author, bookName, price, isRented, dateOfPurchase);
        super.setBookType("Journal");
        this.journalType = journalType;
    }


    public String getJournalType() {
        return journalType;
    }

    public void setJournalType(String journalType) {
        this.journalType = journalType;
    }


}
