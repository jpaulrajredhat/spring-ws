package com.springws;

import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import com.springws.springsoap.gen.Country;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;


@Component
public class CountryRepository {

    private static final Map<String, Country> countries = new HashMap<>();

    @PostConstruct
    public void initData() {
        // initialize countries map
        Country country = new Country();
        country.setCapital("Delhi");
        country.setName("India");

        Country country1 = new Country();
        country1.setCapital("Washington");
        country1.setName("USA");

        countries.put("IND", country);
        countries.put("USA", country1);

    }

    public Country findCountry(String name) {
        System.out.println("request " + name);
        System.out.println("request name " + countries.get(name));
        return countries.get(name);
    }
}
