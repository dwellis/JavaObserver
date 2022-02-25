package com.derek;

import java.util.ArrayList;

public class Person implements Observer {

    private String name;

    public Person(String name)
    {
        this.name = name;
    }

    @Override
    public void update(Object obj) {
        if (obj instanceof PostOffice)
        {
            PostOffice po = (PostOffice) obj;
            checkArrivalTheirPassport(po.getAllRecivedPPatPO());
        }
    }

    public void checkArrivalTheirPassport(ArrayList<Passport> setOfPassport) {
        if(setOfPassport!= null) { //if there are passports in the po
            for ( int i =0; i < setOfPassport.size(); i++)

            {
                if (name.compareTo(setOfPassport.get(i).receiverName) == 0)
                    System.out.println(name + ": " + setOfPassport.get(i).content);
            }
        }
        else {
            System.out.println(name+" your passport hasn't arrived yet");
        }
    }



}
