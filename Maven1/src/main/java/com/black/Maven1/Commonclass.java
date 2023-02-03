package com.black.Maven1;

import org.springframework.stereotype.Component;

@Component("common")
public class Commonclass {
	
	private Network network = new Docomo();

	public Network getNetwork() {
		return network;
	}

	public void setNetwork(Network network) {
		this.network = network;
	}
	
	void common () {
		
		network.sim();
		
	}

}