package com.company;

import com.company.database.Database;
import com.company.drivier.Driver;
import com.company.paymentService.PaymentService;

class DriverService {
	private final Database database;
	private final Driver driver;
	private final PaymentService paymentService;

	private DriverService(
		Database dataBase,
		Driver driver,
		PaymentService paymentService
	) {
		this.database = dataBase;
		this.driver = driver;
		this.paymentService = paymentService;
	}

	public static Builder getBuilder() {
		return new Builder();
	}

	static class Builder {
		private Database database;
		private Driver driver;
		private PaymentService paymentService;

		public Builder setDatabase(Database dataBase) {
			this.database = dataBase;
			return this;
		}

		public Builder setDriver(Driver driver) {
			this.driver = driver;
			return this;
		}

		public Builder setPaymentService(PaymentService paymentService) {
			this.paymentService = paymentService;
			return this;
		}

		public DriverService build() {
			if (database.isAlive() && paymentService.isAlive() && driver != null) {
				return new DriverService(database, driver, paymentService);
			} else {
				throw new IllegalArgumentException("Sorry, invalid data!");
			}
		}
	}
}
