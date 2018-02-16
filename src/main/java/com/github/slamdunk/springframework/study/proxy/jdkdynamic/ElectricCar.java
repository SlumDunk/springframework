package com.github.slamdunk.springframework.study.proxy.jdkdynamic;

import com.github.slamdunk.springframework.study.proxy.facade.Rechargable;
import com.github.slamdunk.springframework.study.proxy.facade.Vehicle;

public class ElectricCar implements Rechargable, Vehicle {

	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("electric car is moving sliently....");
	}

	public void recharge() {
		// TODO Auto-generated method stub
		System.out.println("electric car is recharging....");
	}

}
