package com.workintech.LibraryModel.Interfaces;

import com.workintech.LibraryModel.Model.Books.Books;
import com.workintech.LibraryModel.Model.Person.MemberCard;

public interface Librarian  {
      String LibrarinName = "Ahmet Kutucu";
      String LibrarianPassword = "Bilmem123";

      void  addBook(Books book);
      void editBook(String bookId,String newBookName,String newAuthor,double newPrice,String dateOfPurchase);
      void deleteBook(Books book);
      void searchBook(String BookId);
      void searchBookByName(String BookName);
      void searchBookByAuthor(String Author);
       void findBooksByType(String bookType);
      void addMember(MemberCard member);
      void getInvoices();
      void RentedInvoices();


}
