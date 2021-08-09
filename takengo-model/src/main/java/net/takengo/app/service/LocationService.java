package net.takengo.app.service;

import net.takengo.app.entity.location.City;

import java.util.List;

public interface LocationService {

    /**
     * Returns list of existing cities
     * @return
     */
    List<City> findCities();

    /**
     * Saves specified city instance
     * @param city
     */
    void saveCity(City city);
}
