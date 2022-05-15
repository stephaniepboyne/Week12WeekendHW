import java.util.ArrayList;

public class FlightManager {

    private Flight flight;
    private Passenger passenger;

    public FlightManager(Flight flight){
        this.flight = flight;
    }

    public double baggageWeightPerPassenger(){
        double halfWeight = flight.getPlane().getWeight() / 2;
        return halfWeight / flight.getPlane().getCapacity();
    }

    public double bagWeight(Passenger passenger) {
        ArrayList<Double> bagWeights = new ArrayList<>();
        if (passenger.getBags().size() > 0) {
            for (Bag bag : passenger.getBags()) {
                bagWeights.add(bag.getWeight());
            }
            double sum = 0.00;
            for (int i = 0; i < bagWeights.size(); i++){
                sum += bagWeights.get(i);
            }
            return sum;
        }
        return 0.00;
    }

    public double remainingWeightForBaggage(Flight flight){
        ArrayList<Double> allWeights = new ArrayList<>();
        for (Passenger passenger : flight.getBookedPassengers()){
            allWeights.add(bagWeight(passenger));
        }
        double sum = 0.00;
        for (int i = 0; i < allWeights.size(); i++){
            sum += allWeights.get(i);
        }
        double halfWeight = flight.getPlane().getWeight() / 2;
        return halfWeight - sum;

    }
}
