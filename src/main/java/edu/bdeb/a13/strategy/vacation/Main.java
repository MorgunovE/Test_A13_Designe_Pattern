package edu.bdeb.a13.strategy.vacation;

public class Main {
    public static void main(String[] args) {
        VacationTrip trip = new VacationTrip(new CarTravelStrategy());
        trip.travel();

        trip.setTravelStrategy(new TrainTravelStrategy());
        trip.travel();

        trip.setTravelStrategy(new PlaneTravelStrategy());
        trip.travel();
    }
}
