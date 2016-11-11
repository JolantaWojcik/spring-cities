package pl.spring.cities.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class FinnishCities implements CitiesRaport{
	
	public List<String> cities() {
		// TODO Auto-generated method stub
		List<String> fiCities = new ArrayList<String>();
		fiCities.add("Helsinki");
		fiCities.add("Espo");
		fiCities.add("Turku");
		return fiCities;
	}

	public String country() {
		// TODO Auto-generated method stub
		return "Finnland";
	}
}