package edu.bdeb.a13.strategy.vacation;

public class PlaneTravelStrategy implements TravelStrategy {
    @Override
    public void travel() {
        System.out.println("Traveling by plane.");
    }
}
