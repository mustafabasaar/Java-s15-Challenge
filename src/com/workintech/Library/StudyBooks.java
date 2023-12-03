package com.workintech.Library;

public class StudyBooks extends Books {
    private String educationType;

    public StudyBooks(String bookID, String author, String bookName, double price, boolean isRented, String dateOfPurchase, String educationType) {
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




