package com.workintech.Library;

import java.util.Objects;
import java.util.UUID;

public class Invoice {
    private String invoiceNumber;
    private String memberName;
    private String Member_id;
    private double bookPrice;
    private String bookName;
    private boolean isBookRented;

    public Invoice(String membername, String member_id, double bookPrice, String bookName, boolean isBookRented) {
        this.invoiceNumber= UUID.randomUUID().toString();
        this.memberName = membername;
        this.Member_id = member_id;
        this.bookPrice = bookPrice;
        this.bookName = bookName;
        this.isBookRented = isBookRented;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public void setMember_id(String member_id) {
        Member_id = member_id;
    }

    public void setBookPrice(double bookPrice) {
        this.bookPrice = bookPrice;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setBookRented(boolean bookRented) {
        isBookRented = bookRented;
    }

    public String getMember_id() {
        return Member_id;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public double getBookPrice() {
        return bookPrice;
    }

    public boolean isBookRented() {
        return isBookRented;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Invoice invoice)) return false;
        return Objects.equals(invoiceNumber, invoice.invoiceNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(invoiceNumber);
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "invoiceNumber='" + invoiceNumber + '\'' +
                ", memberName='" + memberName + '\'' +
                ", Member_id='" + Member_id + '\'' +
                ", bookPrice=" + bookPrice +
                ", bookName='" + bookName + '\'' +
                ", isBookRented=" + isBookRented +
                '}';
    }

    public String getBookName() {
        return bookName;
    }
}
