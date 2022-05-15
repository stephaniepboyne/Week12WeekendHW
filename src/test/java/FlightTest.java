import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    private Flight flight;
    private PlaneType planeType;
    private Pilot pilot;
    private Rank pilotRank;
    private Plane plane;
    private Passenger passenger;
    private Bag bag;

    @Before
    public void before(){
        passenger = new Passenger("Merry Brandybuck");
        bag = new Bag(30);
        pilotRank = Rank.PILOT;
        pilot = new Pilot("Bilbo Baggins", pilotRank, "B2010");
        planeType = PlaneType.PIPERM350;
        plane = new Plane(planeType.getCapacity(), planeType.getWeight());
        flight = new Flight(pilot, plane, "PI5790", "GLA", "13.40");
    }

    @Test
    public void getPilotName(){
        assertEquals("Bilbo Baggins", flight.getPilot().getName());
    }

    @Test
    public void getPlaneCapacity(){
        assertEquals(5, flight.getPlane().getCapacity());
    }

    @Test
    public void getFlightNumber(){
        assertEquals("PI5790", flight.getFlightNumber());
    }

    @Test
    public void getDestination(){
        assertEquals("GLA", flight.getDestination());
    }

    @Test
    public void getDepartureTime(){
        assertEquals("13.40", flight.getDepartureTime());
    }

    @Test
    public void testAvailableSeats(){
        assertEquals(5, flight.availableSeats(flight.getPlane(), flight.getBookedPassengers()));
    }

    @Test
    public void testBookPassenger(){
        flight.bookPassenger(plane, flight.getBookedPassengers(), passenger);
        assertEquals(4, flight.availableSeats(flight.getPlane(), flight.getBookedPassengers()));
        assertEquals(1, flight.getBookedPassengers().size());
    }

    @Test
    public void testCannotBookExtraPassenger(){
        flight.bookPassenger(plane, flight.getBookedPassengers(), passenger);
        flight.bookPassenger(plane, flight.getBookedPassengers(), passenger);
        flight.bookPassenger(plane, flight.getBookedPassengers(), passenger);
        flight.bookPassenger(plane, flight.getBookedPassengers(), passenger);
        flight.bookPassenger(plane, flight.getBookedPassengers(), passenger);
        flight.bookPassenger(plane, flight.getBookedPassengers(), passenger);
        assertEquals(0, flight.availableSeats(flight.getPlane(), flight.getBookedPassengers()));
        assertEquals(5, flight.getBookedPassengers().size());
    }

}
