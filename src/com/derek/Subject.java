package com.derek;

public interface Subject {
    void subscribe(Observer o);
    void unSubscribe(Observer o);
    void Notify();
}
