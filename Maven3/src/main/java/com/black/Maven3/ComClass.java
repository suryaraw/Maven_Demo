package com.black.Maven3;

import org.springframework.stereotype.Component;

@Component("Cclass")
public class ComClass {

	private Network network =new Airtel();

	public Network getNetwork() {
		return network;
	}

	public void setNetwork(Network network) {
		this.network = network;
	}
	
	void common () {
		
		network.port();
	}
	
}
