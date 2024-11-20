package edu.bdeb.a13.observer.exemple;

public class ObservateurHex implements Observer {
    @Override
    public void update(int value) {
        System.out.print(" \nObservateurHex :  " + Integer.toHexString(value));
    }
}