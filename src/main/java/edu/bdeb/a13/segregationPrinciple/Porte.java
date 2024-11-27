package edu.bdeb.a13.segregationPrinciple;

public class Porte implements IPorte, ISecuriseePorte {
    private boolean isOpen;
    private long openTime;

    @Override
    public void ouvrir() {
        isOpen = true;
        openTime = System.currentTimeMillis();
        System.out.println("Porte ouverte");
    }

    @Override
    public void fermer() {
        isOpen = false;
        System.out.println("Porte fermée");
    }

    @Override
    public void genererAlerte() {
        if (isOpen && (System.currentTimeMillis() - openTime) > 10000) { // 10 seconds for example
            System.out.println("Alerte: La porte est restée ouverte trop longtemps!");
        }
    }
}