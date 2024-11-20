package edu.bdeb.a13.decorator.component;

import edu.bdeb.a13.decorator.utils.Plat;

public class PizzaDeBase implements Plat {

    @Override
    public double getPrix() {
        return 10;
    }

}
