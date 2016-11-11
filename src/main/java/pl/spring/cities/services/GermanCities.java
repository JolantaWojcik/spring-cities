package pl.spring.cities.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class GermanCities implements CitiesRaport{
	
	public List<String> cities() {
		// TODO Auto-generated method stub
		List<String> geCities = new ArrayList<String>();
	    geCities.add("Berlin");
		geCities.add("Bonn");
		geCities.add("Frankfurt");
		return geCities;
	}

	public String country() {
		// TODO Auto-generated method stub
		return "Germany";
	}

}
