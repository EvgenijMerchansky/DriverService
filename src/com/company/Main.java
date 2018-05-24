package com.company;

import com.company.database.Database;
import com.company.drivier.Driver;
import com.company.paymentService.PaymentService;

public class Main {
    public static void main(String[] args) {
        // TODO: server instance

        DriverService driverService = DriverService
          .getBuilder()
          .setDatabase(Database.getDatabase())
          .setPaymentService(PaymentService.getService())
          .setDriver(Driver.getDriver())
          .build();
    }
}
