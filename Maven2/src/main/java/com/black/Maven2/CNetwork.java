package com.black.Maven2;

import org.springframework.stereotype.Component;

@Component("Cnet")
public class CNetwork {
	
	private Network network=new Airtel();

	public Network getNetwork() {
		return network;
	}

	public void setNetwork(Network network) {
		this.network = network;
	}

	
	void common () {
		System.err.println("Port From CommonNetWork..");
		System.err.println("-----------------------");

		
		network.sim();
	}
}
