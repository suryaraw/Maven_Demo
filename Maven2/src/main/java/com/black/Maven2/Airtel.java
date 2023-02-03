package com.black.Maven2;

import org.springframework.beans.factory.annotation.Value;



public class Airtel implements Network {
	@Value("${airt.vers}")
	private String version ;

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public void sim() {
		
		System.err.println("Version : "+version);
		System.out.println("Black magic launching soon.... Mother of Airtel Chip's");
	}
}
