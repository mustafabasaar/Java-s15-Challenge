package com.workintech.Library;

import com.workintech.Library.MemberCard;
import com.workintech.Library.memberType;

public class Person {
    private String name;
    private MemberCard memberCard;


    public Person(String name) {
        this.name = name;
        this.memberCard = null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MemberCard getMemberCard() {
        return memberCard;
    }

    public void setMemberCard(MemberCard memberCard) {
        this.memberCard = memberCard;
    }

    public void beLibraryMember(double money, String membername, memberType type, String dateOfMemberShip, String adress) {
        if (memberCard == null) {
            memberCard = new MemberCard(money, membername, type, dateOfMemberShip, adress);
            System.out.println(name + " is now a library member with card number " + memberCard.getMember_id());
        } else {
            System.out.println(name + " is already a library member with card number " + memberCard.getMember_id());
        }
    }


}
