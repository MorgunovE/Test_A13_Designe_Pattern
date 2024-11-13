package edu.bdeb.a13.strategy;

public class KamikadzeBehaviour implements IBehaviour {

    @Override
    public void move() {
        System.out.println("Kamikaze Behaviour: if find another robot explode");
    }
}
