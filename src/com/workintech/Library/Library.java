package com.workintech.Library;
import java.util.*;

public class Library implements Librarian {
    private String LibrarianName;
    protected String LibrarianPassword = "Bilmem123";
    private Map<String, Books> booksMap;
    private Map<String, MemberRecord> membersMap;
    private Map<String, List<Invoice>> invoiceMap;


    public Library(String librarianName, String LibrarianPassword) {
        if (this.LibrarianPassword.equals(LibrarianPassword)) {
            this.LibrarianName = librarianName;
            this.invoiceMap=new HashMap<>();
            this.booksMap = new HashMap<>();
            this.membersMap = new HashMap<>();
        } else {
            System.out.println("Password Incorrect. You don't have permission access to Library ");
        }
    }

    public Map<String, List<Invoice>> getInvoiceMap() {
        return invoiceMap;
    }

    public void addBook(Books book) {
        booksMap.put(book.getBookID(), book);
    }


    public void deleteBook(Books book) {
        booksMap.remove(book.getBookID(), book);
    }

    public void editBook(String bookId, String newBookName, String newAuthor, double newPrice, String dateOfPurchase) {
        Books foundBook = booksMap.get(bookId);

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
        Books foundBook = booksMap.get(bookId);

        if (foundBook != null) {
            System.out.println("Kitap ID: " + foundBook.getBookID());
            System.out.println("Kitap Adı: " + foundBook.getBookName());
            System.out.println("Yazar: " + foundBook.getAuthor());
        } else {
            System.out.println("Kitap bulunamadı.");
        }
    }

    @Override
    public void searchBookByName(String BookName) {
        boolean found = false;

        for (Books book : booksMap.values()) {
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

    public void findBooksByType(String bookType) {
        List<Books> booksByType = new ArrayList<>();

        for (Books book : booksMap.values()) {
            if (book.getBookType().equalsIgnoreCase(bookType)) {
                booksByType.add(book);
            }
        }

        if (!booksByType.isEmpty()) {
            System.out.println(bookType + " adlı kategorinin kitapları:");
            for (Books book : booksByType) {
                System.out.println("Kitap ID: " + book.getBookID());
                System.out.println("Kitap Adı: " + book.getBookName());
                System.out.println("Yazar: " + book.getAuthor());
                System.out.println("-------------------------");
            }
        } else {
            System.out.println(bookType + " adlı kategoriden kitabı bulunamadı.");
        }

    }

    public void searchBookByAuthor(String Author) {
        List<Books> booksByAuthor = new ArrayList<>();

        for (Books book : booksMap.values()) {
            if (book.getAuthor().equalsIgnoreCase(Author)) {
                booksByAuthor.add(book);
            }
        }

        if (!booksByAuthor.isEmpty()) {
            System.out.println(Author + " adlı yazarın kitapları:");
            for (Books book : booksByAuthor) {
                System.out.println("Kitap ID: " + book.getBookID());
                System.out.println("Kitap Adı: " + book.getBookName());
                System.out.println("Yazar: " + book.getAuthor());
                System.out.println("-------------------------");
            }
        } else {
            System.out.println(Author + " adlı yazarın kitabı bulunamadı.");
        }
    }


    @Override
    public void addMember(MemberRecord member) {
        membersMap.put(member.getMember_id(), member);
    }



    }


