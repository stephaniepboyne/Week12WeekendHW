import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {
    private Passenger passenger;
    private Bag bag1;
    private Bag bag2;

    @Before
    public void before(){
        passenger = new Passenger("Jerry");
        bag1 = new Bag(40.00);
        bag2 = new Bag(20.00);
    }

    @Test
    public void hasName(){
        assertEquals("Jerry", passenger.getName());
    }

    @Test
    public void testGetBags(){
        passenger.addBag(bag1);
        passenger.addBag(bag2);
        assertEquals(2, passenger.getNumberOfBags());
    }



}
