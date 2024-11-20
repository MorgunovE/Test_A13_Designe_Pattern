package edu.bdeb.a13.decorator;

public class Tomat extends Ingredient {

    public Tomat(Plat plat) {
        this.sur=plat;
    }

    @Override
    public double getPrix() {
        return 0.5 + sur.getPrix();
    }

}
