import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    private FlightManager flightManager;
    private Flight flight;
    private PlaneType planeType;
    private Pilot pilot;
    private Rank pilotRank;
    private Plane plane;
    private Passenger passenger;
    private Bag bag1;
    private Bag bag2;


    @Before
    public void before(){
        passenger = new Passenger("Frodo Bagging");
        pilotRank = Rank.PILOT;
        pilot = new Pilot("Bilbo Baggins", pilotRank, "B2010");
        planeType = PlaneType.PIPERM350;
        plane = new Plane(planeType.getCapacity(), planeType.getWeight());
        flight = new Flight(pilot, plane, "PI5790", "GLA", "13.40");
        flightManager = new FlightManager(flight);
        bag1 = new Bag(40.00);
        bag2 = new Bag(20.00);
        passenger.addBag(bag1);
        passenger.addBag(bag2);
    }

    @Test
    public void testBaggageWeightPerPassenger(){
        assertEquals(434.00, flightManager.baggageWeightPerPassenger(), 0.0);
    }

    @Test
    public void testBagWeight(){
        flight.bookPassenger(flight.getPlane(), flight.getBookedPassengers(), passenger);
        assertEquals(60.00, flightManager.bagWeight(passenger), 0.0);
    }

    @Test
    public void testRemainingWeightForBaggage(){
        flight.bookPassenger(flight.getPlane(), flight.getBookedPassengers(), passenger);
        flight.bookPassenger(flight.getPlane(), flight.getBookedPassengers(), passenger);
        assertEquals(2050.00, flightManager.remainingWeightForBaggage(flight), 0.0);
    }

}
