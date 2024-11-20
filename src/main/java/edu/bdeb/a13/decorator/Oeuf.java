package edu.bdeb.a13.decorator;

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
