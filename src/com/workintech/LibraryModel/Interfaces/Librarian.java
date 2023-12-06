package com.workintech.LibraryModel.Interfaces;

import com.workintech.LibraryModel.Model.Books.Book;
import com.workintech.LibraryModel.Model.Person.Author;
import com.workintech.LibraryModel.Model.Person.MemberCard;
import com.workintech.LibraryModel.Model.Person.Person;

public interface Librarian  {
      String LibrarianName = "Edin Dzeko";
      String LibrarianPassword = "Bilmem123";

      void  addBook(Book book);
      void editBook(String bookId, String newBookName, Author newAuthor, double newPrice, String dateOfPurchase);
      void deleteBook(Book book);
      void searchBook(String bookId);
      void searchBook(Person author);
       void searchBookByType(String bookType);
      void addMember(MemberCard member);
      void searchBookByName(String BookName);
      void getInvoices();
      void RentedInvoices();

}
