package net.takengo.app.entity.location;

import net.takengo.app.entity.location.City;
import net.takengo.app.entity.location.Station;
import net.takengo.app.entity.transport.TransportType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CityTest {

    private static City city;

    private static Station station;

    @BeforeAll
    public static void setUp(){
        city = new City("Kyiv");
        station = new Station(city,TransportType.AUTO);
    }

    @Test
    public void testAddValidStationSuccess() {
         city.addStation(station);

         assertTrue(containsStation(city, station));
    }

    @Test
    public void testAddNullStationFailure() {

        Assertions.assertThrows(NullPointerException.class, () -> {

            city.addStation(null);
        });
    }

    @Test
    public void testAddDuplicateStationFailure() {
        city.addStation(station);
        city.addStation(station);

        assertEquals(city.getStations().size(), 1);
    }

    @Test
    public void testRemoveStationSuccess() {

        city.addStation(station);

        city.removeStation(TransportType.AUTO,station);

        assertTrue(city.getStations().isEmpty());
    }

    @Test
    public void testRemoveNullStationFailure() {
        Assertions.assertThrows(NullPointerException.class, () -> {
            city.addStation(null);
        });
    }

    private boolean containsStation(City city, Station station) {
        return city.getStations().contains(station);
    }
}
