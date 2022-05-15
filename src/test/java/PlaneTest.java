import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    private Plane plane;
    private PlaneType planeType;

    @Before
    public void before(){
        planeType = PlaneType.MERCURE;
        plane = new Plane(planeType.getCapacity(), planeType.getWeight());
    }

    @Test
    public void hasCapacity(){
        assertEquals(160, plane.getCapacity());
    }

    @Test
    public void hasWeight(){
        assertEquals(146000.00, plane.getWeight(), 0.0);
    }

}
