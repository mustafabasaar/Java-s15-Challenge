package com.workintech.Library;
import java.util.*;

public class Library implements Librarian {
    private String LibrarianName;
    protected String LibrarianPassword = "Bilmem123";
    private Map<String, Books> booksMap;
    private Map<String, MemberCard> membersMap;
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
    @Override
    public void addMember(MemberCard member) {
        membersMap.put(member.getMember_id(), member);
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


    public void getInvoices() {

        for (MemberCard member : membersMap.values()) {
            List<Invoice> memberInvoices = member.getInvoiceList();
            System.out.println("memberInvoices"+memberInvoices);

            if (memberInvoices != null && !memberInvoices.isEmpty()) {

                invoiceMap.put(member.getMember_id(), new ArrayList<>(memberInvoices));
            }
        }

        for (Map.Entry<String, List<Invoice>> entry : invoiceMap.entrySet()) {
            String memberId = entry.getKey();
            List<Invoice> memberInvoices = entry.getValue();
            System.out.println("Üye Kimliği İçin Faturalar: " + memberId);
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





