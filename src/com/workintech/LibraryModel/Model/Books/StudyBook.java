package com.workintech.LibraryModel.Model.Books;

import com.workintech.LibraryModel.Model.Person.Author;
import com.workintech.LibraryModel.Model.Person.Person;

public class StudyBook extends Book {
    private String educationType;

    public StudyBook(String bookID, String booktype, Person author, String bookName, double price, boolean isRented, String dateOfPurchase, String educationType) {
        super(bookID,booktype, author, bookName, price, isRented, dateOfPurchase);
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




