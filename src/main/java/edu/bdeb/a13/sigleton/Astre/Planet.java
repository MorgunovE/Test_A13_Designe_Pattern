package edu.bdeb.a13.sigleton.Astre;

import java.util.ArrayList;
import java.util.List;

public class Planet extends Astre implements IOrbitable {
    private String nom;
    public List<Satellite> listeSatellites = new ArrayList<>();

    // Constructor to initialize the planet with a name
    public Planet(String nom) {
        this.nom = nom;
    }

    // Method to add a satellite to the list
    public void addSatellite(Satellite satellite) {
        listeSatellites.add(satellite);
    }

    @Override
    public void OrbiterAutour(Astre a) {
        Soleil.listePlanetes.add(this);
    }

    @Override
    public String toString() {
        return nom + " with satellites: " + listeSatellites;
    }
}