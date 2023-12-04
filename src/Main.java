import com.workintech.Library.*;

public class Main {
    public static void main(String[] args) {
        Library dokuzEylulLibrary = new Library("Ferit Kutucu","Bilmem123");
        Books novelOne=new Novels("1","Victor Hugo","Sefiller",10.5,false,"11.09.2012");
        Books novelTwo=new Novels("2","Victor Hugo","Notre Dame'ın Kamburu",7.5,false,"13.09.2012");
        Books novelTree=new Novels("3","Victor Hugo","Bir İdam Mahkumunun Son Günü",7.5,false,"15.09.2012");
        Books novelFour=new Novels("4","Victor Hugo","Bir İdam Mahkumunun Son Günü",7.5,false,"15.09.2012");
        Books studyBook=new StudyBooks("5","ATATÜRK","NUTUK",20,false,"10.11.2010","History");
        Books studyBookOne=new StudyBooks("6","ATATÜRK","GEOMETRİ",20,false,"10.12.2010","Maths");
        Books studyBookTwo=new StudyBooks("7","ATATÜRK","ANILAR",20,false,"10.11.2010","History");
        Books journal=new Journals("8","Ahmet Kılıç","NightLife Magazine",5.50,false,"10.02.2020","Magazine");
        Books journaltwo=new Journals("9","Doğan Kabak","Car Journal",12.5,false,"20.08.2018","Cars");
        Person person=new Person("Ahmet Aslan");
        person.beLibraryMember(230.54,person.getName(),memberType.TEACHER,"20.10.2023","Izmir");
        dokuzEylulLibrary.addMember(person.getMemberCard());
        person.getMemberCard().RentBook(novelOne);
        person.getMemberCard().RentBook(studyBook);
        person.getMemberCard().RentBook(journal);
        dokuzEylulLibrary.getInvoices();
        person.getMemberCard().giveTheBookBack(novelOne);
        person.getMemberCard().giveTheBookBack(studyBook);
        person.getMemberCard().RentBook(journaltwo);
        dokuzEylulLibrary.getInvoices();





    }
}