package com.workintech.LibraryModel.Model.Books;

import com.workintech.LibraryModel.Model.Person.Author;

public class Book {
    private String bookType;
private String bookID;
private Author author;
private String bookName;
private double price;
private boolean isRented;
private String dateOfPurchase;



    public Book(String bookID, Author author, String bookName, double price, boolean isRented, String dateOfPurchase) {
        this.bookType="";
        this.bookID = bookID;
        this.author=author;
        this.bookName = bookName;
        this.price = price;
        this.isRented = isRented;
        this.dateOfPurchase = dateOfPurchase;
        author.addBook(this.getBookName());
    }

    public String  getBookID() {
        return bookID;
    }

    public Author getAuthor() {
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

    public void setAuthor(Author author) {
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




    @Override
    public String toString() {
        return "Books{" +
                "bookType='" + bookType + '\'' +
                ", bookID='" + bookID + '\'' +
                ", Author=" + author +
                ", bookName='" + bookName + '\'' +
                ", price=" + price +
                ", isRented=" + isRented +
                ", dateOfPurchase='" + dateOfPurchase + '\'' +
                '}';
    }
}
