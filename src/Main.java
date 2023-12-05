import com.workintech.LibraryModel.Model.Books.Books;
import com.workintech.LibraryModel.Model.Books.Journals;
import com.workintech.LibraryModel.Model.Books.Novels;
import com.workintech.LibraryModel.Model.Books.StudyBooks;
import com.workintech.LibraryModel.Model.Library.Library;
import com.workintech.LibraryModel.Model.Person.Student;

public class Main {
    public static void main(String[] args) {
        Library dokuzEylulLibrary = new Library("Bilmem123");
        Books novelOne=new Novels("1","Victor Hugo","Sefiller",10.5,false,"11.09.2012");
        Books novelTwo=new Novels("2","Victor Hugo","Notre Dame'ın Kamburu",7.5,false,"13.09.2012");
        Books novelTree=new Novels("3","Victor Hugo","Bir İdam Mahkumunun Son Günü",7.5,false,"15.09.2012");
        Books novelFour=new Novels("4","Victor Hugo","Bir İdam Mahkumunun Son Günü",7.5,false,"15.09.2012");
        Books studyBook=new StudyBooks("5","ATATÜRK","NUTUK",20,false,"10.11.2010","History");
        Books studyBookOne=new StudyBooks("6","ATATÜRK","GEOMETRİ",20,false,"10.12.2010","Maths");
        Books studyBookTwo=new StudyBooks("7","ATATÜRK","ANILAR",20,false,"10.11.2010","History");
        Books journal=new Journals("8","Ahmet Kılıç","NightLife Magazine",5.50,false,"10.02.2020","Magazine");
        Books journaltwo=new Journals("9","Doğan Kabak","Car Journal",12.5,false,"20.08.2018","Cars");
        dokuzEylulLibrary.addBook(novelOne);
        dokuzEylulLibrary.addBook(novelTwo);
        dokuzEylulLibrary.addBook(novelTree);
        dokuzEylulLibrary.addBook(novelFour);
        dokuzEylulLibrary.addBook(studyBook);
        dokuzEylulLibrary.addBook(studyBookOne);
        dokuzEylulLibrary.addBook(studyBookTwo);
        dokuzEylulLibrary.addBook(journaltwo);
        Student student=  new Student("Mustafa Başar");
        student.beLibraryMember(52,student.getName(),"11.09.2023","Izmir");
        dokuzEylulLibrary.addMember(student.getMemberCard());
        student.getMemberCard().RentBook(novelOne);
        student.getMemberCard().RentBook(studyBook);
        student.getMemberCard().RentBook(journal);
        dokuzEylulLibrary.getInvoices();
        System.out.println("****************************");
        student.getMemberCard().giveTheBookBack(novelOne);
        student.getMemberCard().giveTheBookBack(studyBook);
        student.getMemberCard().RentBook(journaltwo);
        dokuzEylulLibrary.getInvoices();
        dokuzEylulLibrary.RentedInvoices();
        System.out.println("****************************");
        student.getMemberCard().giveTheBookBack(journal);
        student.getMemberCard().giveTheBookBack(journaltwo);
        dokuzEylulLibrary.RentedInvoices();
        System.out.println("****************************");
        dokuzEylulLibrary.deleteBook("Journal");
        System.out.println(dokuzEylulLibrary.getBooksMap());

    }
}