package net.takengo.app.entity.service;

import net.takengo.app.entity.location.City;
import net.takengo.app.service.LocationService;
import net.takengo.app.service.impl.LocationServiceImpl;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LocationServiceImplTest {
    private static LocationService service;

    private static City city;

    @BeforeAll
    public static void setup() {
        service = new LocationServiceImpl();
        city = new City("Kyiv");
    }

    @Test
    public void testNoDataReturnedAtStart() {
        List<City> cities = service.findCities();
        assertEquals(1, cities.size());
    }

    @Test
    public void testSaveNewCitySuccess() {
        service.saveCity(city);

        List<City> cities = service.findCities();
        assertEquals(cities.size(), 1);
        assertEquals(cities.get(0).getName(), "Kyiv");
    }
}