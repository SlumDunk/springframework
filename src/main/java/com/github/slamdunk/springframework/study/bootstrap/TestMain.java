package com.github.slamdunk.springframework.study.bootstrap;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.github.slamdunk.springframework.study.service.PurchaseService;
import com.github.slamdunk.springframework.study.vo.User;

/**
 * main class created for testing
 * 
 * @author liuzhongda
 *
 */
public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		User bt = (User) context.getBean("beantest");
		System.out.println(bt);
		PurchaseService service = (PurchaseService) context.getBean("purchaseService");
		service.purchaseProduct("电风扇", 98, "日用品");
	}

}
