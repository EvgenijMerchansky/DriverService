package com.company.drivier;

public class Driver {
	private boolean alive = true;

	private Driver() {
	}

	public static Driver getDriver() {
		return new Driver();
	}
}
