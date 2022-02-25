package com.derek;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello Observer");
        PostOffice postoffice = new PostOffice();
        Person chris = new Person("Chris");
        Person john = new Person("John");
        Person derek = new Person("Derek");

        //chris n john were bugging/polling the post office
        chris.checkArrivalTheirPassport(null);
        john.checkArrivalTheirPassport(null);

        //post office was angry and asked them to leave[register] their ph nos
        postoffice.subscribe(chris);
        postoffice.subscribe(john);
        postoffice.subscribe(derek);

        Passport passport = new Passport("John", "johns address", "You've got a secret passport");
        Passport passport2 = new Passport("Derek", "House address", "New passport issued");
        postoffice.ppOfficeSendsaPPPostOffice(passport);
        postoffice.unSubscribe(john);
        postoffice.ppOfficeSendsaPPPostOffice(passport2);

    }
}
