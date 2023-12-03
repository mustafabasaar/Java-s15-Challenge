package com.workintech.Library;

import java.util.Objects;
import java.util.UUID;

public class Invoice {
    private String invoiceNumber;
    private String memberName;
    private String Member_id;
    private double bookPrice;
    private String bookName;
    private boolean isRented;

    public Invoice(String membername, String member_id, double bookPrice, String bookName, boolean isTaken) {
        this.invoiceNumber= UUID.randomUUID().toString();
        this.memberName = membername;
        this.Member_id = member_id;
        this.bookPrice = bookPrice;
        this.bookName = bookName;
        this.isRented = isTaken;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setTaken(boolean taken) {
        isRented = taken;
    }

    public String getMember_id() {
        return Member_id;
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
                "memberName='" + memberName + '\'' +
                ", Member_id='" + Member_id + '\'' +
                ", bookPrice=" + bookPrice +
                ", bookName='" + bookName + '\'' +
                ", isTaken=" + isRented +
                '}';
    }

    public String getBookName() {
        return bookName;
    }
}
