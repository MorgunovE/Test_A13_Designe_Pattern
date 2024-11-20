package edu.bdeb.a13.observer.exemple;

public class ObservateurOct implements Observer {
    @Override
    public void update(int value) {
        System.out.print(" \nObservateurOct :  " + Integer.toOctalString(value));
    }
}