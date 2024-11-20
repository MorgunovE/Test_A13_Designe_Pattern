package edu.bdeb.a13.observer.exemple;

public class ObservateurBin implements Observer {
    @Override
    public void update(int value) {
        System.out.print("\nObservateurBin :  " + Integer.toBinaryString(value));
    }
}