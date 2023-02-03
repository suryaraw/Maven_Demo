package com.black.MavenIOc1;

public class CommonClass {

	private Network network;
	
	public Network getNetwork() {
		return network;
	}

	public void setNetwork(Network network) {
		this.network = network;
	}

	void common() {
		
		
		network.sim();
	}
}
