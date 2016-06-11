package com.example;

import org.springframework.stereotype.Component;

@Component
public class License {
	
	private String licenseNo="NEW_LICENSE";
	
	public License()
	{
		System.out.println("Licence Object created");
	}
	
	@Override
	public String toString() {
		return this.licenseNo;
	}

}
