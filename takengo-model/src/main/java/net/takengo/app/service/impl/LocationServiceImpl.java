package net.takengo.app.service.impl;

import net.takengo.app.entity.location.City;
import net.takengo.app.entity.utils.CommonUtils;
import net.takengo.app.service.LocationService;

import java.util.ArrayList;
import java.util.List;

public class LocationServiceImpl implements LocationService {
    private final List<City> cities;

    public LocationServiceImpl() {
        cities = new ArrayList<>();
    }

    @Override
    public List<City> findCities() {
        return CommonUtils.getSafeList(cities);
    }

    @Override
    public void saveCity(City city) {
        if(!cities.contains(city)) {
            cities.add(city);
        }
    }
}
