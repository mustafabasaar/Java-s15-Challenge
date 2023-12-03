package com.workintech.Library;

public class Invoice {
    private String memberName;
    private String Member_id;
    private double bookPrice;
    private String bookName;
    private boolean isTaken;

    public Invoice(String membername, String member_id, double bookPrice, String bookName, boolean isTaken) {
        this.memberName = membername;
        this.Member_id = member_id;
        this.bookPrice = bookPrice;
        this.bookName = bookName;
        this.isTaken = isTaken;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "memberName='" + memberName + '\'' +
                ", Member_id='" + Member_id + '\'' +
                ", bookPrice=" + bookPrice +
                ", bookName='" + bookName + '\'' +
                ", isTaken=" + isTaken +
                '}';
    }
}
