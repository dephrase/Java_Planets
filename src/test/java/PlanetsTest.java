import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PlanetsTest {

    Planet earth;

    @Before
    public void before(){
        earth = new Planet("Earth", 100);
    }

    @Test
    public void testPlanetHasName(){
        assertEquals("Earth", earth.getName());
    }

    @Test
    public void testPlanetHasSize(){
        assertEquals(100, earth.getSize());
    }

    @Test
    public void testPlanetCanExplode(){
        assertEquals("Boom, Earth has exploded", earth.explode());
    }
}
