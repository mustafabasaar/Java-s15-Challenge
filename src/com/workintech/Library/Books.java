package com.workintech.Library;

public class Books {
    private String bookType;
private String bookID;
private String author;
private String bookName;
private double price;
private boolean isRented;
private String dateOfPurchase;
private Invoice bookInvoice;


    public Books(String bookID, String author, String bookName, double price, boolean isRented, String dateOfPurchase) {
        this.bookType="";
        this.bookID = bookID;
        this.author = author;
        this.bookName = bookName;
        this.price = price;
        this.isRented = isRented;
        this.dateOfPurchase = dateOfPurchase;
    }

    public String  getBookID() {
        return bookID;
    }

    public String getAuthor() {
        return author;
    }

    public String getBookName() {
        return bookName;
    }

    public double getPrice() {
        return price;
    }

    public boolean isRented() {
        return isRented;
    }

    public String getDateOfPurchase() {
        return dateOfPurchase;
    }

    public void setBookID(String bookID) {
        this.bookID = bookID;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setRented(boolean rented) {
        isRented = rented;
    }

    public void setDateOfPurchase(String dateOfPurchase) {
        this.dateOfPurchase = dateOfPurchase;
    }

    public String getBookType() {
        return bookType;
    }

    public void setBookType(String bookType) {
        this.bookType = bookType;
    }

    public Invoice getBookInvoice() {
        return bookInvoice;
    }

    public void setBookInvoice(Invoice bookInvoice) {
        this.bookInvoice = bookInvoice;
    }



    @Override
    public String toString() {
        return "Books{" +
                "bookType='" + bookType + '\'' +
                ", bookID='" + bookID + '\'' +
                ", author='" + author + '\'' +
                ", bookName='" + bookName + '\'' +
                ", price=" + price +
                ", isRented=" + isRented +
                ", dateOfPurchase='" + dateOfPurchase + '\'' +
                '}';
    }


}
