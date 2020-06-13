
package com.cognizant.springlearn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringLearnApplication {
	private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);

	public static void main(String[] args) {

		SpringApplication.run(SpringLearnApplication.class, args);

		//displayDate();
		//displayCountry();
		displayCountries();

	}

	public static void displayDate() {
		LOGGER.info("START");
		ApplicationContext ctx = new ClassPathXmlApplicationContext("date-format.xml");
		// retriving bean by name and type
		SimpleDateFormat format = ctx.getBean("dateFormat", SimpleDateFormat.class);
		Date date = null;

		try {
			date = format.parse("31/12/2018");
			LOGGER.debug(date.toString());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		LOGGER.info("END");

	}

	public static void displayCountry() {
		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
		Country country = (Country) context.getBean("country", Country.class);
		Country anotherCountry =(Country) context.getBean("country", Country.class); 
		LOGGER.debug("Country : {}", country.toString());
	}
	public static void displayCountries()
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
		List<Country> ctr = (List<Country>)context.getBean("countryList", Country.class);
		LOGGER.debug("Country : {}", ctr);
		LOGGER.info("END");
	}

}
