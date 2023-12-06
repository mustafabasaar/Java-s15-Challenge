package com.workintech.LibraryModel.Model.Person;
import com.workintech.LibraryModel.Enums.memberType;
import com.workintech.LibraryModel.Model.Library.Invoice;
import com.workintech.LibraryModel.Model.Books.Book;

import java.util.*;

public class MemberCard {
    private double memberMoney;
    private final String member_id;
    private String memberName;
    private memberType type;
    private String date_of_membership;
    private String adress;
    private List<Book> rentedBooks;
    private List<Invoice> invoiceList;


    public MemberCard(double memberMoney, String memberName, memberType type, String date_of_membership, String adress) {
        this.invoiceList = new ArrayList<>();
        this.rentedBooks = new ArrayList<>(5);
        this.memberMoney = memberMoney;
        this.member_id = UUID.randomUUID().toString();
        this.memberName = memberName;
        this.type = type;
        this.date_of_membership = date_of_membership;
        this.adress = adress;

    }


    public double getMemberMoney() {
        return memberMoney;
    }

    public List<Book> getRentedBooks() {
        return rentedBooks;
    }

    public void writeRentedBooks() {
        System.out.println(this.memberName+" tarafından kiralanmış kitaplar:");
        for (Book book : rentedBooks) {
            System.out.println("Book ID: " + book.getBookID());
            System.out.println("Book Name: " + book.getBookName());
            System.out.println("Book Type: " + book.getBookType());
            System.out.println("Author: " + book.getAuthor());
            System.out.println("Price: " + book.getPrice());
            System.out.println("****************************");

        }
    }


    public void setMemberMoney(double memberMoney) {
        this.memberMoney = memberMoney;
    }

    public String getMember_id() {
        return member_id;
    }


    public String getMemberName() {
        return memberName;
    }

    public List<Invoice> getInvoiceList() {
        return invoiceList;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public memberType getType() {
        return type;
    }

    public void setType(memberType type) {
        this.type = type;
    }

    public String getDate_of_membership() {
        return date_of_membership;
    }

    public void setDate_of_membership(String date_of_membership) {
        this.date_of_membership = date_of_membership;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }


    public void setRentedBooks(List<Book> rentedBooks) {
        this.rentedBooks = rentedBooks;
    }

    public void RentBook(Book book) {
        if (book.isRented()) {
            System.out.println(book.getBookName() + " Adlı kitap zaten kiralanmış başka bir kitap seçmek isteyebilirsiniz");
        } else {
            if (this.rentedBooks.size() == 5) {
                System.out.println("You have already 5 books first you should return the books :)");
            } else {
                if (getMemberMoney() > book.getPrice()) {
                    Invoice invoice = new Invoice(getMemberName(), getMember_id(), book.getPrice(), book.getBookName(), true);
                    invoiceList.add(invoice);
                    this.memberMoney = memberMoney - book.getPrice();
                    book.setRented(true);
                    this.rentedBooks.add(book);
                } else {
                    System.out.println(book.getBookName() + " İsimli kitabı Kiralamak için yeterli paranız yok para yüklemelisiniz");
                }
            }
        }
    }


    public void giveTheBookBack(Book book) {
        if (rentedBooks.isEmpty()) {
            System.out.println("Henüz kitap kiralamamışsınız, geri verebilmek için önce kiralama yapmalısınız");
        } else {

            if (rentedBooks.contains(book)) {

                for (Invoice invoice : invoiceList) {
                    if (invoice.getBookName().equalsIgnoreCase(book.getBookName())) {
                        invoice.setBookRented(false);
                        break; // Stop searching once found
                    }
                }
                this.memberMoney = memberMoney + book.getPrice();
                this.rentedBooks.remove(book);
                book.setRented(false);
            } else {
                System.out.println("Bu kitabı kiralamadınız, geri veremezsiniz.");
            }
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MemberCard that)) return false;
        return Objects.equals(getMember_id(), that.getMember_id());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMember_id());
    }

}
