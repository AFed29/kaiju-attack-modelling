package City;

import Jaeger.Mark2;
import Kaiju.Category2;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CityTest {
    Category2 category2;
    Mark2 mark2;
    City city;

    @Before
    public void before() {
        city = new City("Edinburgh", 2000);
        category2 = new Category2("Onibaba");
        mark2 = new Mark2("Diablo Intercept", "Chile");
    }

    @Test
    public void cityCanBeAttackedByKaiju() {
        category2.slash(city);
        assertEquals(1940, city.getHealthValue());
    }

    @Test
    public void cityCanBeAttackedByJaeger() {
        mark2.rocketPunch(city);
        assertEquals(1950, city.getHealthValue());
    }
}
