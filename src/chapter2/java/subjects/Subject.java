package src.chapter2.java.subjects;

import src.chapter2.java.observers.Observer;

public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
