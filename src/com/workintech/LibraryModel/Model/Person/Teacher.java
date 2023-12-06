package com.workintech.LibraryModel.Model.Person;

import com.workintech.LibraryModel.Enums.memberType;

public class Teacher extends Reader{
    private MemberCard memberCard;
    public Teacher(String name) {
        super(name);
    }

    @Override
    public MemberCard getMemberCard() {

        return this.memberCard;
    }

    @Override
    public void setMemberCard(MemberCard memberCard) {
        this.memberCard = memberCard;
    }

    public void beLibraryMember(double money, String membername, String dateOfMemberShip, String adress) {
        if (memberCard == null) {
            memberCard = new MemberCard(money, membername,memberType.TEACHER, dateOfMemberShip, adress);
            System.out.println(super.getName() + " is now a library member as a teacher with card number " + memberCard.getMember_id());
        } else {
            System.out.println(super.getName() + " is already a library member with card number " + memberCard.getMember_id());
        }
    }


    @Override
    public String toString() {
        return "Teacher{" +
                "memberCard=" + memberCard +
                '}';
    }
}
