package net.takengo.app.conroller;

import net.takengo.app.rest.service.LocationRestSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "/cities")
public class LocationRestController {

    private final LocationRestSevice locationRestSevice;

    @Autowired
    public LocationRestController(LocationRestSevice locationRestSevice) {
        this.locationRestSevice = locationRestSevice;
    }

    @GetMapping(path = "/list", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<String> findCities() {
        List <String> list = new ArrayList<>();
        list.add("Odessa");
        list.add("Kyiv");
        return list;
    }

}
