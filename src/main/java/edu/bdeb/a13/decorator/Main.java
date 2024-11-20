package edu.bdeb.a13.decorator;

public class Main {

    public static void main(String[] args) {

        Plat plat = new PizzaDeBase(); // 10
        Plat platAvecOeuf = new Oeuf(plat); // 11.5

        Plat platAvecOeufEtOgnion = new Ognion(platAvecOeuf); // 12

        System.out.println(platAvecOeufEtOgnion.getPrix()); // 12
    }
}
