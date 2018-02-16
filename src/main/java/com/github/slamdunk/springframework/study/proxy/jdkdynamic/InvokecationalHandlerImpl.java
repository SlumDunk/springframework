package com.github.slamdunk.springframework.study.proxy.jdkdynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class InvokecationalHandlerImpl implements InvocationHandler {

	private ElectricCar car;

	public InvokecationalHandlerImpl(ElectricCar car) {
		this.car = car;
	}

	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("you are going to invoke" + method.getName() + "....");
		method.invoke(car, null);
		System.out.println(method.getName() + " invocation Has Been finished...");
		return null;
	}

}
