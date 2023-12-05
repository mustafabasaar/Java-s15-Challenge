package com.workintech.LibraryModel.Model.Books;

import com.workintech.LibraryModel.Model.Person.Author;

public class StudyBook extends Book {
    private String educationType;

    public StudyBook(String bookID, Author author, String bookName, double price, boolean isRented, String dateOfPurchase, String educationType) {
        super(bookID, author, bookName, price, isRented, dateOfPurchase);
        super.setBookType("StudyBooks");
        this.educationType = educationType;
    }



    public String getEducationType() {
        return educationType;
    }

    public void setEducationType(String educationType) {
        this.educationType = educationType;
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
                ", educationType='" + getEducationType() + '\'' +
                '}';
    }
}




