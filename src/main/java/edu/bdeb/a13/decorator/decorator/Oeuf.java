package edu.bdeb.a13.decorator.decorator;

import edu.bdeb.a13.decorator.utils.Ingredient;
import edu.bdeb.a13.decorator.utils.Plat;

public class Oeuf  extends Ingredient {

    public Oeuf(Plat plat) {
        this.sur = plat;
    }

    @Override
    public double getPrix() {
        return 1.5 + sur.getPrix();
    }

    @Override
    public String toString() {
        return sur.toString() + " avec oeuf";
    }
}
