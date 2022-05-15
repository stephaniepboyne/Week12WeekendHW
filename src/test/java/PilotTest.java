import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    private Pilot pilot;
    private Rank rankType;

    @Before
    public void before(){
        rankType = Rank.PILOT;
        pilot = new Pilot("Jerry Meyers", rankType, "B2010" );
    }

    @Test
    public void pilotHasName(){
        assertEquals("Jerry Meyers", pilot.getName());
    }

    @Test
    public void pilotHasRank(){
        assertEquals(1, pilot.getRank());
    }

    @Test
    public void pilotHasLicenceNumber(){
        assertEquals("B2010", pilot.getLicenceNumber());
    }

    @Test
    public void testCanFly(){
        assertEquals("I can fly!", pilot.canFly());
    }

}
