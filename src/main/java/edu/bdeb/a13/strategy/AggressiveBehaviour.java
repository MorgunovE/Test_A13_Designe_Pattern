package edu.bdeb.a13.strategy;

public class AggressiveBehaviour implements IBehaviour {

    @Override
    public void move() {
        System.out.println("Aggressive Behaviour: if find another robot attack it");
    }
}
