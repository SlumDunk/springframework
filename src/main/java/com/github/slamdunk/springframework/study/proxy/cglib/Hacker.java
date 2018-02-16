package com.github.slamdunk.springframework.study.proxy.cglib;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**
 * hacker class implements the interface of methodInterceptor
 * 
 * @author liuzhongda
 *
 */
public class Hacker implements MethodInterceptor {

	public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("**** I am a hacker,Let's see what the poor programmer is doing Now...");
		proxy.invokeSuper(obj, args);
		System.out.println("****  Oh,what a poor programmer.....");
		return null;
	}

}
