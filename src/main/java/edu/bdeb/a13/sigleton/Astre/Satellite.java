package edu.bdeb.a13.sigleton.Astre;

public class Satellite extends Astre implements IOrbitable {
    private String nom;

    // Constructor to initialize the satellite with a name
    public Satellite(String nom) {
        this.nom = nom;
    }

    // Copy constructor
    public Satellite(Satellite sat) {
        this.nom = sat.nom;
    }

    @Override
    public void OrbiterAutour(Astre a) {
        // Implementation of orbiting around another celestial body
    }

    @Override
    public String toString() {
        return nom;
    }
}