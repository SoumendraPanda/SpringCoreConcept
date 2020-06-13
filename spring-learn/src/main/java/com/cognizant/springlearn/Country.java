package com.cognizant.springlearn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Country {
	private static final Logger LOGGER = LoggerFactory.getLogger(Country.class); 
	private String code;
	private String name;
	public Country() {
		
		     LOGGER.info("Inside Country Constructor");
		
	}
	public String getCode() {
		
		     LOGGER.info("Inside code getter method");
		
		return code;
	}
	public void setCode(String code) {
		
		     LOGGER.info("Inside code setter method");
		
		this.code = code;
	}
	public String getName() {
		
		     LOGGER.info("Inside name getter method");
		
		return name;
	}
	public void setName(String name) {
		
		     LOGGER.info("Inside name setter method");
		
		this.name = name;
	}
	@Override
	public String toString() {
		return "Country [code=" + code + ", name=" + name + "]";
	}

}
