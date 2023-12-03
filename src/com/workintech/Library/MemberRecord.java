package com.workintech.Library;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MemberRecord {
    private List<Invoice> invoices;
    private double memberMoney;
    private String member_id;
    private String memberName;
    private memberType type;
    private String date_of_membership;

    private String adress;
    private Set<Books> rentedBooks =new HashSet<>(5);

    public MemberRecord(String member_id, String memberName, memberType type, String date_of_membership, String adress,Double memberMoney) {
        this.member_id = member_id;
        this.memberName = memberName;
        this.type = type;
        this.date_of_membership = date_of_membership;
        this.adress = adress;
        this.memberMoney=memberMoney;

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

    public Set<Books> getRentedBooks() {
        return rentedBooks;
    }

    public void setRentedBooks(Set<Books>  rentedBooks) {
        this.rentedBooks = rentedBooks;
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
        if(book.isRented()){
            System.out.println("Kitap zaten kiralanmış başka bir kitap seçmek isteyebilirsiniz");
        }
        else{
            if(rentedBooks.size()==5){
                System.out.println("You have already 5 books first you should return the books :)");
            }
            else{
                if(getMemberMoney()> book.getPrice()){
                    this.memberMoney=memberMoney-book.getPrice();
                    book.setRented(true);
                    this.rentedBooks.add(book);
                    this.invoices=new ArrayList<>();
                    this.invoices.add(new Invoice(getMemberName(),getMember_id(),book.getPrice(),book.getBookName(),true));
                }
                else{
                    System.out.println("Kiralamak için yeterli paranız yok para yüklemelisiniz");
                }

            }
        }
    }

    @Override
    public String toString() {
        return "MemberRecord{" +
                "invoices=" + invoices +
                ", memberMoney=" + memberMoney +
                ", member_id='" + member_id + '\'' +
                ", memberName='" + memberName + '\'' +
                ", type=" + type +
                ", date_of_membership='" + date_of_membership + '\'' +
                ", adress='" + adress + '\'' +
                ", rentedBooks=" + rentedBooks +
                '}';
    }
}
