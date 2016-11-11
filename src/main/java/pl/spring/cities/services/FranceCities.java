package pl.spring.cities.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class FranceCities implements CitiesRaport{
	
	public List<String> cities() {
		// TODO Auto-generated method stub
		List<String> frCities = new ArrayList<String>();
		frCities.add("Paris");
		frCities.add("Taize");
		frCities.add("Lille");
		return frCities;
	}

	public String country() {
		// TODO Auto-generated method stub
		return "France";
	}
}