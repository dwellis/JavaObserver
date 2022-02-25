package com.derek;

import java.util.ArrayList;

public class PostOffice implements Subject {

    private ArrayList<Passport> allReceviedPassport;
    private ArrayList<Observer> observerSubscribersLedger;

    public PostOffice()
    {
        allReceviedPassport = new ArrayList<>();
        observerSubscribersLedger = new ArrayList<>();
    }

    public void ppOfficeSendsaPPPostOffice(Passport m){
        allReceviedPassport.add(m);
        Notify();
    }

    public ArrayList<Passport> getAllRecivedPPatPO()
    {
        return allReceviedPassport;
    }

    @Override
    public void subscribe(Observer o) {
        observerSubscribersLedger.add(o);
    }

    @Override
    public void unSubscribe(Observer o) {
        observerSubscribersLedger.remove(o);
    }

    @Override
    public void Notify() {
        //if a passport arrives at the post office.. we need to notify abdul
        for (int i = 0; i < observerSubscribersLedger.size(); i++)
            observerSubscribersLedger.get(i).update(this);
    }
}
