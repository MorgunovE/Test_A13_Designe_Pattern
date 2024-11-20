package edu.bdeb.a13.decorator;

import edu.bdeb.a13.decorator.component.PizzaDeBase;
import edu.bdeb.a13.decorator.decorator.Oeuf;
import edu.bdeb.a13.decorator.decorator.Ognion;
import edu.bdeb.a13.decorator.decorator.Tomat;
import edu.bdeb.a13.decorator.utils.Plat;

public class Main {

    public static void main(String[] args) {

        Plat plat = new PizzaDeBase(); // 10
        Plat platAvecOeuf = new Oeuf(plat); // 11.5

        Plat platAvecOeufEtOgnion = new Ognion(platAvecOeuf); // 12

        Plat platAvecOeufEtOgnionEtTomate = new Tomat(platAvecOeufEtOgnion); // 12.5

        System.out.println(platAvecOeufEtOgnionEtTomate.getPrix()); // 12.5
    }
}
