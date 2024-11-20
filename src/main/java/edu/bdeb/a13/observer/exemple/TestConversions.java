package edu.bdeb.a13.observer.exemple;

import java.util.Scanner;

public class TestConversions {
    public static void main(String[] args) {
        Observable observable = new Observable();
        observable.addObserver(new ObservateurHex());
        observable.addObserver(new ObservateurOct());
        observable.addObserver(new ObservateurBin());

        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.print("\nSaisir un entier : ");
            observable.setValue(scan.nextInt());
        }
    }
}