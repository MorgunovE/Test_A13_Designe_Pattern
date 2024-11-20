package edu.bdeb.a13.decorator.decorator;

import edu.bdeb.a13.decorator.utils.Ingredient;
import edu.bdeb.a13.decorator.utils.Plat;

public class Tomat extends Ingredient {

    public Tomat(Plat plat) {
        this.sur=plat;
    }

    @Override
    public double getPrix() {
        return 0.5 + sur.getPrix();
    }

}
