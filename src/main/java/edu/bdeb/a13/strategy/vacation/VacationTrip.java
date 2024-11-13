package edu.bdeb.a13.strategy.vacation;

public class VacationTrip {
    private TravelStrategy travelStrategy;

    public VacationTrip(TravelStrategy travelStrategy) {
        this.travelStrategy = travelStrategy;
    }

    public void setTravelStrategy(TravelStrategy travelStrategy) {
        this.travelStrategy = travelStrategy;
    }

    public void travel() {
        travelStrategy.travel();
    }
}