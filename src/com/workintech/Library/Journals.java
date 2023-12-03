package com.workintech.Library;

public class Journals extends Books {
     private String bookType;
     private String journalType;

    public Journals(String bookID, String author, String bookName, double price, boolean isRented, String dateOfPurchase, String journalType) {
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

    @Override
    public String toString() {
        return "StudyBooks{" +
                "bookID=" + getBookID() +
                ", author='" + getAuthor()  + '\'' +
                ", bookName='" + getBookName() + '\'' +
                ", price=" + getPrice() +
                ", isRented=" + isRented() +
                ", dateOfPurchase='" + getDateOfPurchase() + '\'' +
                "bookType='" + getBookType() + '\'' +
                ", educationType='" + getJournalType() + '\'' +
                '}';
    }
}
