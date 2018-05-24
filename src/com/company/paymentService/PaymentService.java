package com.company.paymentService;

public class PaymentService {
	private boolean alive = true;

	private PaymentService () { }

	public boolean isAlive() {
		return this.alive;
	}

	public static PaymentService getService() {
		return new PaymentService();
	}
}
