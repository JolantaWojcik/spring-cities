package pl.spring.cities.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import pl.spring.cities.services.CitiesPrinter;

public class Main {
    public static void main( String[] args ){
    	
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");

    	CitiesPrinter cp = context.getBean(CitiesPrinter.class);
    	System.out.println(cp.printCities("Germany"));
    }
}
