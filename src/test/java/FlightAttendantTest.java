import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightAttendantTest {

    private FlightAttendant flightAttendant;
    private Rank rankType;

    @Before
    public void before(){
        rankType = Rank.ATTENDANT;
        flightAttendant = new FlightAttendant("Steve Smith", rankType);
    }

    @Test
    public void hasName(){
        assertEquals("Steve Smith", flightAttendant.getName());
    }

    @Test
    public void hasRank(){
        assertEquals(3, flightAttendant.getRank());
    }

    @Test
    public void canMakeAnnouncement(){
        assertEquals("The captain has turned on the Fasten Seat Belt sign.", flightAttendant.makeAnnouncement());
    }
}
