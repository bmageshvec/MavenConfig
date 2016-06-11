package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Driver {
	
	
	private License license;
	
	
	@Autowired
	public Driver(License license)
	{
		this.license=license;
		System.out.println("Driver called==================");
	}
	
	@Override
	public String toString() {
		return "Driver has "+license;
	}

}
