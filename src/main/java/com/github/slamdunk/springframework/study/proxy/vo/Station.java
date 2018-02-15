package com.github.slamdunk.springframework.study.proxy.vo;

import com.github.slamdunk.springframework.study.proxy.facade.TicketService;

/**
 * an implemented class for the interface of TicketService
 * 
 * @author liuzhongda
 *
 */
public class Station implements TicketService {

	public void sellTicket() {
		// TODO Auto-generated method stub
		System.out.println("sell tickets");
	}

	public void inquire() {
		// TODO Auto-generated method stub
		System.out.println("inquire tickets");
	}

	public void withdraw() {
		// TODO Auto-generated method stub
		System.out.println("withdraw tickets");
	}

}
