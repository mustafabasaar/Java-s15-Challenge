package com.workintech.Library;
import java.util.ArrayList;
import java.util.List;


public class MemberRecord {
    private List<Invoice> invoices=new ArrayList<>();
    private double memberMoney;
    private String member_id;
    private String memberName;
    private memberType type;
    private String date_of_membership;
    private String adress;
    private List<Books> rentedBooks =new ArrayList<>(5);

    public MemberRecord(String member_id, String memberName, memberType type, String date_of_membership, String adress,Double memberMoney) {
        this.member_id = member_id;
        this.memberName = memberName;
        this.type = type;
        this.date_of_membership = date_of_membership;
        this.adress = adress;
        this.memberMoney=memberMoney;

    }

    public void setRentedBooks(List<Books> rentedBooks) {
        this.rentedBooks = rentedBooks;
    }

    public List<Invoice> getInvoices() {
        return invoices;
    }
    public double getMemberMoney() {
        return memberMoney;
    }

    public void setMemberMoney(double memberMoney) {
        this.memberMoney = memberMoney;
    }

    public List<Books> getRentedBooks() {
        return rentedBooks;
    }



    public String getMember_id() {
        return member_id;
    }

    public String getMemberName() {
        return memberName;
    }

    public memberType getType() {
        return type;
    }

    public String getDate_of_membership() {
        return date_of_membership;
    }

    public String getAdress() {
        return adress;
    }

    public void setInvoices(List<Invoice> invoices) {
        this.invoices = invoices;
    }

    public void setMember_id(String member_id) {
        this.member_id = member_id;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public void setType(memberType type) {
        this.type = type;
    }

    public void setDate_of_membership(String date_of_membership) {
        this.date_of_membership = date_of_membership;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void RentBook(Books book) {
        if (book.isRented()) {
            System.out.println("Kitap zaten kiralanmış başka bir kitap seçmek isteyebilirsiniz");
        } else {
            if (rentedBooks.size() == 5) {
                System.out.println("You have already 5 books first you should return the books :)");
            } else {
                if (getMemberMoney() > book.getPrice()) {
                    this.memberMoney = memberMoney - book.getPrice();
                    book.setRented(true);
                    Invoice newInvoice = new Invoice(getMemberName(), getMember_id(), book.getPrice(), book.getBookName(), true);
                    book.setBookInvoice(newInvoice);
                    this.rentedBooks.add(book);
                    this.invoices.add(newInvoice);
                } else {
                    System.out.println("Kiralamak için yeterli paranız yok para yüklemelisiniz");
                }
            }
        }
    }
    private void removeInvoice(String bookName) {
        invoices.removeIf(invoice -> {
            if (invoice.getBookName().equals(bookName)) {
                invoice.setTaken(false);
                return true;
            }
            return false;
        });
    }

    public void giveTheBookBack(Books book) {
        if (rentedBooks.isEmpty()) {
            System.out.println("Henüz kitap kiralamamışsınız, geri verebilmek için önce kiralama yapmalısınız");
        } else {
            this.memberMoney = memberMoney + book.getPrice();
            Invoice bookInvoice = book.getBookInvoice();
            if (bookInvoice != null && invoices.contains(bookInvoice)) {
                invoices.remove(bookInvoice);
            }
            book.setRented(false);
            removeInvoice(book.getBookName());
            this.rentedBooks.remove(book);
        }
    }
}


