package edu.bdeb.a13.sigleton.Astre;

public class Terre extends Planet {
    private static Terre instance = null;

    // Constructor to initialize the planet Terre with its name
    private Terre() {
        super("Terre");
        this.OrbiterAutour(Soleil.getInstance());
        this.listeSatellites.add(new Satellite("Lune"));
    }

    public static Planet getInstance() {
        if (instance == null) {
            instance = new Terre();
        }
        return instance;
    }

    @Override
    public String toString() {
        return "Terre with satellites: " + listeSatellites;
    }

    // Additional methods and attributes specific to Terre can be added here
}
