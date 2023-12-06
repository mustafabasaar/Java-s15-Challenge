import com.workintech.LibraryModel.Enums.memberType;
import com.workintech.LibraryModel.Model.Books.Book;
import com.workintech.LibraryModel.Model.Books.Journal;
import com.workintech.LibraryModel.Model.Books.Novel;
import com.workintech.LibraryModel.Model.Books.StudyBook;
import com.workintech.LibraryModel.Model.Library.Library;
import com.workintech.LibraryModel.Model.Person.*;

public class Main {
    public static void main(String[] args) {
        Library dokuzEylulLibrary = new Library("Bilmem123");
        Person author=new Author("Victor Hugo");
        Person authorOne=new Author("ATATÜRK");
        Author authorTwo=new Author("Ahmet Kılıç");
        Author authorTree=new Author("Doğan Kabak");
        Book novelOne=new Novel("1","Novel", author,"Sefiller",10.5,false,"11.09.2012");
        Book novelTwo=new Novel("2","Novel", author,"Notre Dame'ın Kamburu",7.5,false,"13.09.2012");
        Book novelTree=new Novel("3","Novel", author,"Bir İdam Mahkumunun Son Günü",7.5,false,"15.09.2012");
        Book novelFour=new Novel("4","Novel", author,"Bir İdam Mahkumunun Son Günü",7.5,false,"15.09.2012");
        Book studyBook=new StudyBook("5","Study",authorOne,"NUTUK",20,false,"10.11.2010","History");
        Book studyBookOne=new StudyBook("6","Study",authorOne,"GEOMETRİ",20,false,"10.12.2010","Maths");
        Book studyBookTwo=new StudyBook("7","Study",authorOne,"ANILAR",20,false,"10.11.2010","History");
        Book journal=new Journal("8","Journal",authorTwo,"NightLife Magazine",5.50,false,"10.02.2020","Magazine");
        Book journaltwo=new Journal("9","Journal",authorTree,"Car Journal",12.5,false,"20.08.2018","Cars");
        dokuzEylulLibrary.addBook(novelOne);
        dokuzEylulLibrary.addBook(novelTwo);
        dokuzEylulLibrary.addBook(novelTree);
        dokuzEylulLibrary.addBook(novelFour);
        dokuzEylulLibrary.addBook(studyBook);
        dokuzEylulLibrary.addBook(studyBookOne);
        dokuzEylulLibrary.addBook(studyBookTwo);
        dokuzEylulLibrary.addBook(journal);
        dokuzEylulLibrary.addBook(journaltwo);
        Reader student= new Student("Mustafa Başar");
        Reader teacher=new Teacher("İlber Ortaylı");
        Reader studenttwo=new Student("Mehmet Başar");
        studenttwo.beLibraryMember(12,studenttwo.getName(),"02.02.2023","Izmir");
        teacher.beLibraryMember(2322,teacher.getName(), "10.09.2010",":Istanbul");
        student.beLibraryMember(1222,student.getName(),"11.09.2023","Izmir");
        dokuzEylulLibrary.addMember(student.getMemberCard());
        dokuzEylulLibrary.addMember(teacher.getMemberCard());
        student.getMemberCard().RentBook(novelOne);
        student.getMemberCard().RentBook(studyBook);
        student.getMemberCard().RentBook(journal);
        student.getMemberCard().RentBook(journaltwo);
        student.getMemberCard().RentBook(studyBookOne);
        student.getMemberCard().RentBook(novelFour);
        teacher.getMemberCard().RentBook(novelFour);
        teacher.getMemberCard().RentBook(novelOne);
        System.out.println(student.getMemberCard().getRentedBooks());
        dokuzEylulLibrary.getInvoices();
        System.out.println("****************************");
        student.getMemberCard().giveTheBookBack(novelOne);
        student.getMemberCard().giveTheBookBack(studyBook);
        dokuzEylulLibrary.getInvoices();
        dokuzEylulLibrary.RentedInvoices();
        System.out.println("****************************");
        student.getMemberCard().giveTheBookBack(journal);
        student.getMemberCard().giveTheBookBack(journaltwo);
        dokuzEylulLibrary.RentedInvoices();
        System.out.println("****************************");
        System.out.println(dokuzEylulLibrary.getBooksMap());
        dokuzEylulLibrary.searchBook(author);
        dokuzEylulLibrary.searchBookByType("Study");

    }
}