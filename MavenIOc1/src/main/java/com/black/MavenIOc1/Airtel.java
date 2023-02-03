package com.black.MavenIOc1;

public class Airtel implements Network {
	
	public Airtel(int schmId, String schmName) {
		super();
		SchmId = schmId;
		SchmName = schmName;
	}

	private int SchmId;
	private String SchmName;
	
//	public void setSchmId(int schmId) {
//		SchmId = schmId;
//	}
//
//	public void setSchmName(String schmName) {
//		SchmName = schmName;
//	}
	public void sim() {
		
		System.out.println("Airtel Sim !");
		System.out.println(SchmId+" "+SchmName);
		
	}

}
