package com.github.slamdunk.springframework.study.proxy.facade;

/**
 * an interface defined for ticket service
 * 
 * @author liuzhongda
 *
 */
public interface TicketService {
	/**
	 * method of selling tickets
	 */
	public void sellTicket();

	/**
	 * method of inquiring tickets
	 */
	public void inquire();

	/**
	 * method of withdrawing tickets
	 */
	public void withdraw();
}
