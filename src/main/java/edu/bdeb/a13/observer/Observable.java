package edu.bdeb.a13.observer;


public interface Observable {
    public void addObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers(Message message);
}
