package com.workintech.LibraryModel.Model.Library;
import com.workintech.LibraryModel.Interfaces.Librarian;
import com.workintech.LibraryModel.Model.Books.Book;
import com.workintech.LibraryModel.Model.Person.Author;
import com.workintech.LibraryModel.Model.Person.MemberCard;
import com.workintech.LibraryModel.Model.Person.Person;

import java.util.*;

public class Library implements Librarian {

    private Map<String, Book> booksMap;
    private Map<String, MemberCard> membersMap;
    private Map<String, List<Invoice>> invoiceMap;


    public Library(String LibrarianPassword) {
        if (this.LibrarianPassword.equals(LibrarianPassword)) {
            this.invoiceMap=new HashMap<>();
            this.booksMap = new HashMap<>();
            this.membersMap = new HashMap<>();
        } else {
            System.out.println("Password Incorrect. You don't have permission access to Library ");
        }
    }

    public Map<String, Book> getBooksMap() {
        return booksMap;
    }

    public Map<String, MemberCard> getMembersMap() {
        return membersMap;
    }


    public void addBook(Book book) {
        booksMap.put(book.getBookID(), book);
    }

    public void deleteBook(Book book) {
        booksMap.remove(book.getBookID(), book);
    }
    public void deleteBook(String bookType){
        List<String> booksToRemove = new ArrayList<>();


        for (Map.Entry<String, Book> entry : booksMap.entrySet()) {
            if (entry.getValue().getBookType().equalsIgnoreCase(bookType)) {
                booksToRemove.add(entry.getKey());
            }
        }

        for (String bookId : booksToRemove) {
            booksMap.remove(bookId);
        }
    }



    @Override
    public void addMember(MemberCard member) {
        membersMap.put(member.getMember_id(), member);
    }
    public void editBook(String bookId, String newBookName, Author newAuthor, double newPrice, String dateOfPurchase) {
        Book foundBook = booksMap.get(bookId);

        if (foundBook != null) {
            foundBook.setBookName(newBookName);
            foundBook.setAuthor(newAuthor);
            foundBook.setPrice(newPrice);
            foundBook.setDateOfPurchase(dateOfPurchase);
        } else {
            System.out.println("Kitap bulunamadı.");
        }
    }

    @Override
    public void searchBook(String bookId) {
        Book foundBook = booksMap.get(bookId);

        if (foundBook != null) {
            System.out.println("Kitap ID: " + foundBook.getBookID());
            System.out.println("Kitap Adı: " + foundBook.getBookName());
            System.out.println("Yazar: " + foundBook.getAuthor());
        } else {
            System.out.println("Kitap bulunamadı.");
        }
    }



    public void searchBook(Person author) {
        System.out.println("Books by Author: " + author.getName());

        for (Book book : booksMap.values()) {
            if (book.getAuthor().equals(author)) {
                System.out.println("Book ID: " + book.getBookID());
                System.out.println("Book Name: " + book.getBookName());
                System.out.println("Author: " + book.getAuthor().getName());
                System.out.println("-------------------------");
            }
        }
    }

    @Override
    public void searchBookByName(String BookName) {
        boolean found = false;

        for (Book book : booksMap.values()) {
            if (book.getBookName().equalsIgnoreCase(BookName)) {
                System.out.println("Kitap ID: " + book.getBookID());
                System.out.println("Kitap Adı: " + book.getBookName());
                System.out.println("Yazar: " + book.getAuthor());
                found = true;
            }
        }

        if (!found) {
            System.out.println("Kitap bulunamadı.");
        }
    }

    public void searchBookByType(String bookType) {
        List<Book> bookByType = new ArrayList<>();

        for (Book book : booksMap.values()) {
            if (book.getBookType().equalsIgnoreCase(bookType)) {
                bookByType.add(book);
            }
        }

        if (!bookByType.isEmpty()) {
            System.out.println(bookType + " adlı kategorinin kitapları:");
            for (Book book : bookByType) {
                System.out.println("Kitap ID: " + book.getBookID());
                System.out.println("Kitap Adı: " + book.getBookName());
                System.out.println("Yazar: " + book.getAuthor());
                System.out.println("-------------------------");
            }
        } else {
            System.out.println(bookType + " adlı kategoriden kitabı bulunamadı.");
        }

    }




    public void getInvoices() {

        for (MemberCard member : membersMap.values()) {
            List<Invoice> memberInvoices = member.getInvoiceList();
            if (memberInvoices != null && !memberInvoices.isEmpty()) {
                invoiceMap.put(member.getMember_id(), new ArrayList<>(memberInvoices));
            }
        }

        for (Map.Entry<String, List<Invoice>> entry : invoiceMap.entrySet()) {
            String memberId = entry.getKey();
            List<Invoice> memberInvoices = entry.getValue();
            System.out.println(memberId+" Üye Kimliğine ait faturalar: " );
            for (Invoice invoice : memberInvoices) {
                System.out.println("Fatura: " + invoice.toString());
            }
            System.out.println("-------------------------");
        }
    }

   public void RentedInvoices(){
        if(invoiceMap.isEmpty()){
            System.out.println("InvoiceMap is Empty");
        }
       boolean foundRentedInvoice = false;
       System.out.println("Kiralanan Kitap Faturaları:");
       for (List<Invoice> invoices : invoiceMap.values()) {
           for (Invoice invoice : invoices) {
               if (invoice.isBookRented()) {
                   System.out.println("Üye Kimliği: " + invoice.getMember_id());
                   System.out.println("Fatura: " + invoice);
                   System.out.println("-------------------------");
                   foundRentedInvoice = true;
               }
           }
       }
       if (!foundRentedInvoice) {
           System.out.println("Şu anda kiralanmış bir kitap faturası bulunamadı.");
       }
   }




}





