package com.black.Maven3;

import org.springframework.beans.factory.annotation.Value;

public class Airtel implements Network {
	@Value("${airtel.name}")
	private String name;
	@Value("${airtel.age}")

	private String age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	@Override
	public void port() {
		// TODO Auto-generated method stub

		System.out.println("Airtel Port Calling...");

		System.out.println(name + " " + age);

	}

}
