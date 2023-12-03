import com.workintech.Library.*;

public class Main {
    public static void main(String[] args) {
        Library dokuzEylulLibrary = new Library("Ferit Kutucu","Bilmem123");
        Books novelOne=new Novels("1","Victor Hugo","Sefiller",10.5,false,"11.09.2012");
        Books novelTwo=new Novels("2","Victor Hugo","Notre Dame'ın Kamburu",7.5,false,"13.09.2012");
        Books novelTree=new Novels("3","Victor Hugo","Bir İdam Mahkumunun Son Günü",7.5,false,"15.09.2012");
        Books novelFour=new Novels("4","Victor Hugo","Bir İdam Mahkumunun Son Günü",7.5,false,"15.09.2012");
        StudyBooks studyBook=new StudyBooks("5","ATATÜRK","NUTUK",20,false,"10.11.2010","History");
        StudyBooks studyBookOne=new StudyBooks("6","ATATÜRK","GEOMETRİ",20,false,"10.12.2010","Maths");
        StudyBooks studyBookTwo=new StudyBooks("7","ATATÜRK","ANILAR",20,false,"10.11.2010","History");
        Journals journal=new Journals("8","Ahmet Kılıç","NightLife Magazine",5.50,false,"10.02.2020","Magazine");
        Journals journaltwo=new Journals("9","Doğan Kabak","Car Journal",12.5,false,"20.08.2018","Cars");
        MemberRecord member=new MemberRecord("1", "Mehmet Basar",memberType.STUDENT,"10.02.2023","Izmir",220.43);
        MemberRecord membertwo=new MemberRecord("2", "Ahmet Keklik",memberType.TEACHER,"10.03.2015","Izmir",178.52);
        MemberRecord memberthree=new MemberRecord("3", "Ayse Bilgen",memberType.STUDENT,"11.08.2021","Istanbul",345.55);
        dokuzEylulLibrary.addBook(novelOne);
        dokuzEylulLibrary.addBook(novelTwo);
        dokuzEylulLibrary.addBook(novelTree);
        dokuzEylulLibrary.addBook(novelFour);
        dokuzEylulLibrary.addBook(studyBook);
        dokuzEylulLibrary.addBook(studyBookOne);
        dokuzEylulLibrary.addBook(studyBookTwo);
        dokuzEylulLibrary.addBook(journal);
        dokuzEylulLibrary.addBook(journaltwo);
        dokuzEylulLibrary.addMember(member);
        dokuzEylulLibrary.addMember(membertwo);
        dokuzEylulLibrary.addMember(memberthree);
        member.RentBook(novelOne);
        member.RentBook(novelTwo);
        member.RentBook(journal);
        member.RentBook(journaltwo);
        member.RentBook(studyBook);
        System.out.println("Sistemde kayıtlı faturalar"+dokuzEylulLibrary.getInvoiceMap());
        System.out.println("******************************");
        System.out.println("memberin elinde olan kiralık kitaplar"+member.getRentedBooks());
        System.out.println("Member parası"+ member.getMemberMoney());
        System.out.println("******************************");
        member.giveTheBookBack(novelOne);
        member.giveTheBookBack(novelTwo);
        member.giveTheBookBack(journal);
        System.out.println("memberin elinde kalan kiralık kitaplar"+member.getRentedBooks());
        System.out.println("Member faturaları"+ member.getInvoices());
        System.out.println("Member parası"+ member.getMemberMoney());
        System.out.println("Sistemde kayıtlı faturalar"+dokuzEylulLibrary.getInvoiceMap());

    }
}