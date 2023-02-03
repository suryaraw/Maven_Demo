package com.black.Maven1;

public class Vi implements Network {
	
	private int SchmID;
	private String SchmName;

	public int getSchmID() {
		return SchmID;
	}

	public void setSchmID(int schmID) {
		SchmID = schmID;
	}

	public String getSchmName() {
		return SchmName;
	}

	public void setSchmName(String schmName) {
		SchmName = schmName;
	}

	public void sim() {
		System.err.println("Vi sim..");
		System.out.println("ID :  "+SchmID+" UPDATE INFO : "+SchmName);
		//System.out.println(getSchmID()+" "+		getSchmName());
		
	}
}
