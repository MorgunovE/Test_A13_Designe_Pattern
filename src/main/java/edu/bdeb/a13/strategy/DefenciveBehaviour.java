package edu.bdeb.a13.strategy;

public class DefenciveBehaviour implements IBehaviour {

    @Override
    public void move() {
        System.out.println("Defencive Behaviour: if find another robot run from it");
    }
}
