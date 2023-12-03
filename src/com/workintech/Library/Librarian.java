package com.workintech.Library;

interface Librarian  {
      void  addBook(Books book);
      void editBook(String bookId,String newBookName,String newAuthor,double newPrice,String dateOfPurchase);
      void deleteBook(Books book);
      void searchBook(String BookId);
      void searchBookByName(String BookName);
      void searchBookByAuthor(String Author);
       void findBooksByType(String bookType);
      void addMember(MemberRecord member);



}
