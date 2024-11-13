package edu.bdeb.a13.sigleton.Astre;

import java.util.ArrayList;
import java.util.List;

public class Soleil extends Astre {
    private static Soleil instance = null;
    public static List<Planet> listePlanetes;

    // Private constructor to prevent instantiation
    private Soleil() {
        listePlanetes = new ArrayList<Planet>();
    }

    // Method to get the unique instance of Soleil

    // Method to add a planet to the list
    public void addPlanet(Planet planet) {
        listePlanetes.add(planet);
    }

    public static Astre getInstance() {
        if (instance == null) {
            instance = new Soleil();
        }
        return instance;
    }

    @Override
    public String toString() {
        return "Soleil with planets: " + listePlanetes;
    }
}