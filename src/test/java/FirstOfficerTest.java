import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FirstOfficerTest {

    private FirstOfficer firstOfficer;
    private Rank rankType;

    @Before
    public void before(){
        rankType = Rank.OFFICER;
        firstOfficer = new FirstOfficer("Valerie Boyle", rankType);
    }

    @Test
    public void hasName(){
        assertEquals("Valerie Boyle", firstOfficer.getName());
    }

    @Test
    public void hasRank(){
        assertEquals(2, firstOfficer.getRank());
    }

}
