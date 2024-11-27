package edu.bdeb.a13.segregationPrinciple;

public class Main {
    public static void main(String[] args) {
        IPorte porte = new Porte();
        porte.ouvrir();
        try {
            Thread.sleep(11000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ((ISecuriseePorte) porte).genererAlerte();
        porte.fermer();
    }
}