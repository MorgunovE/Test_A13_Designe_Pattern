package edu.bdeb.a13.strategy;

public class NormalBehaviour implements IBehaviour {

    @Override
    public void move() {
        System.out.println("Normal Behaviour: if find another robot ignore it");
    }
}

