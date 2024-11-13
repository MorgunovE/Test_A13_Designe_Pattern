package edu.bdeb.a13.strategy.vacation;

public class TrainTravelStrategy implements TravelStrategy {
    @Override
    public void travel() {
        System.out.println("Traveling by train.");
    }
}