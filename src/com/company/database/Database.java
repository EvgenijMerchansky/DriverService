package com.company.database;

public class Database {
	private boolean alive = true;

	private Database() {
	}

	public boolean isAlive() {
		return this.alive;
	}

	public static Database getDatabase() {
		return new Database();
	}
}
