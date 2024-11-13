package edu.bdeb.a13.strategy;

public class MainV2 {

    public static void main(String[] args) {
        Robot r1 = new Robot("Big Robot", new KamikadzeBehaviour());

        r1.setBehaviour(new AggressiveBehaviour());
        r1.move();

        r1.setBehaviour(new DefenciveBehaviour());
        r1.move();

        r1.setBehaviour(new NormalBehaviour());
        r1.move();
    }
}
