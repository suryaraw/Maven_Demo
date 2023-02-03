package com.black.Maven1;

import org.springframework.beans.factory.annotation.Value;

public class Airtel implements Network{
	
	@Value("${airtel.Vnumber}")
private int number;
	public int getNumber() {
	return number;
}
public void setNumber(int number) {
	this.number = number;
}
	@Override
	public void sim() {
		// TODO Auto-generated method stub
		System.err.println("Airtel new version... Version number : " + number);
		
	}

}
