package pl.spring.cities.services;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CitiesPrinter {
	//wstrzyknie mi wszystkie beany z kontekstu ktore implementuja interfejs
		@Autowired
		private Set<CitiesRaport> reports;
		private Map<String, CitiesRaport> reportsMap;
		
		// adnotacja @postConstruct daje ten sam efekt co init-method w xml'u
		@PostConstruct
		public void initBean(){
			reportsMap = new HashMap<>();
			reports.forEach(r -> reportsMap.put(r.country(), r));
		}
		
		public List<String> printCities(String country){
			return reportsMap.get(country).cities();
		}
}
