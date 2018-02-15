package com.github.slamdunk.springframework.study.service;

import com.github.slamdunk.springframework.study.annotation.FileLog;

/**
 * purchase service
 * 
 * @author liuzhongda
 *
 */
public class PurchaseService {
	/**
	 * purchase product
	 * 
	 * @param productName
	 *            name of product
	 * @param price
	 *            price
	 * @param type
	 *            type of goods
	 */
	@FileLog(value="hello world")
	public void purchaseProduct(String productName, double price, String type) {
		System.out.println("buy goods------------------");
	}
}
