package com.black.Maven4;

import org.springframework.stereotype.Component;

@Component("common")
public class CommonClass {
	
Network network=new Airtel();

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
