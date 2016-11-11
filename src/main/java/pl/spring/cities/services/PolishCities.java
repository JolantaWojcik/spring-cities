package pl.spring.cities.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class PolishCities implements CitiesRaport{
	//Stworz klase np: PolandCitiest implements CitiesRaport i zwraca ona liste miast dla danego kraju
	
	public List<String> cities() {
		// TODO Auto-generated method stub
		List<String> plCities = new ArrayList<String>();
		plCities.add("Krakow");
		plCities.add("Warszawa");
		plCities.add("Wroclaw");
		return plCities;
	}

	public String country() {
		// TODO Auto-generated method stub
		return "Poland";
	}
}
