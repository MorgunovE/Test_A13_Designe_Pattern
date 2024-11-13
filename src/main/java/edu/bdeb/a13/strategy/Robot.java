package edu.bdeb.a13.strategy;

public class Robot {
    String name;
    IBehaviour behaviour;

    public Robot(String name, IBehaviour behaviour) {
        this.name = name;
        this.behaviour = behaviour;
    }

    public Robot() {
        this.name = "Robot";
    }

    public Robot(Robot robot) {
        this.name = robot.name;
        this.behaviour = robot.behaviour;
    }

    public void move() {
        this.behaviour.move();
    }

    public void setBehaviour(IBehaviour behaviour) {
        this.behaviour = behaviour;
    }

    public IBehaviour getBehaviour() {
        return this.behaviour;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return this.name;
    }
}
