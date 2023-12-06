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
        Person victor=new Author("Victor Hugo");
        Person ataturk=new Author("ATATÜRK");
        Author ahmet=new Author("Ahmet Kılıç");
        Author dogan=new Author("Doğan Kabak");
        Book sefiller=new Novel("1","Novel", victor,"Sefiller",10.5,false,"11.09.2012");
        Book notreDame=new Novel("2","Novel", victor,"Notre Dame'ın Kamburu",7.5,false,"13.09.2012");
        Book mahkum=new Novel("3","Novel", victor,"Bir İdam Mahkumunun Son Günü",7.5,false,"15.09.2012");
        Book nutuk=new StudyBook("5","Study",ataturk,"NUTUK",20,false,"10.11.2010","History");
        Book geometri=new StudyBook("6","Study",ataturk,"GEOMETRİ",20,false,"10.12.2010","Maths");
        Book anilar=new StudyBook("7","Study",ataturk,"ANILAR",20,false,"10.11.2010","History");
        Book nightLife=new Journal("8","Journal",ahmet,"NightLife Magazine",5.50,false,"10.02.2020","Magazine");
        Book carJournel=new Journal("9","Journal",dogan,"Car Journal",12.5,false,"20.08.2018","Cars");
        dokuzEylulLibrary.addBook(sefiller);
        dokuzEylulLibrary.addBook(notreDame);
        dokuzEylulLibrary.addBook(mahkum);
        dokuzEylulLibrary.addBook(nutuk);
        dokuzEylulLibrary.addBook(geometri);
        dokuzEylulLibrary.addBook(anilar);
        dokuzEylulLibrary.addBook(nightLife);
        dokuzEylulLibrary.addBook(carJournel);
        Reader mustafa_basar= new Student("Mustafa Başar");
        Reader ilber_ortayli=new Teacher("İlber Ortaylı");
        Reader mehmet_basar=new Student("Mehmet Başar");
       mehmet_basar.beLibraryMember(12,mehmet_basar.getName(),"02.02.2023","Izmir");
        ilber_ortayli.beLibraryMember(2322,ilber_ortayli.getName(), "10.09.2010",":Istanbul");
        mustafa_basar.beLibraryMember(1222,mustafa_basar.getName(),"11.09.2023","Izmir");
        dokuzEylulLibrary.addMember(mustafa_basar.getMemberCard());
        dokuzEylulLibrary.addMember(ilber_ortayli.getMemberCard());
        mustafa_basar.getMemberCard().RentBook(sefiller);
        mustafa_basar.getMemberCard().RentBook(nutuk);
        mustafa_basar.getMemberCard().RentBook(nightLife);
        mustafa_basar.getMemberCard().RentBook(carJournel);
        mustafa_basar.getMemberCard().RentBook(geometri);
        ilber_ortayli.getMemberCard().RentBook(sefiller);
        mustafa_basar.getMemberCard().writeRentedBooks();
        dokuzEylulLibrary.getInvoices();
        System.out.println("*************************************************************************");
        mustafa_basar.getMemberCard().giveTheBookBack(sefiller);
        mustafa_basar.getMemberCard().giveTheBookBack(nutuk);
        mustafa_basar.getMemberCard().writeRentedBooks();
        System.out.println("*************************************************************************");
        dokuzEylulLibrary.getInvoices();
        System.out.println("*************************************************************************");
        dokuzEylulLibrary.RentedInvoices();
        System.out.println("*************************************************************************");
        mustafa_basar.getMemberCard().giveTheBookBack(nightLife);
        mustafa_basar.getMemberCard().giveTheBookBack(carJournel);
        dokuzEylulLibrary.RentedInvoices();
        System.out.println("****************************");
        dokuzEylulLibrary.writeBooksMAp();
        dokuzEylulLibrary.searchBook(victor);
        dokuzEylulLibrary.searchBookByType("Study");

    }
}