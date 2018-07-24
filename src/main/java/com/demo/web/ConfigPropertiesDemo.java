package com.demo.web;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix="condemo")
public class ConfigPropertiesDemo {
	private static String location;
	private boolean skip;
	
	public static String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		System.out.println("Setting location");
		ConfigPropertiesDemo.location = location;
	}
	public boolean isSkip() {
		return skip;
	}
	public void setSkip(boolean skip) {
		this.skip = skip;
	}
	
	
	

}
