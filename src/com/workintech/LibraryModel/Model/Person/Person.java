package com.workintech.LibraryModel.Model.Person;

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




}
