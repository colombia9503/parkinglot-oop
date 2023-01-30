package com.sumana.parkinglot.domain.payments;

import com.sumana.parkinglot.domain.vehicles.Vehicle;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Retirement {
    private final Vehicle vehicle;
    private final LocalDateTime endDateTime;

    public Retirement(Vehicle vehicle) {
        this.endDateTime = LocalDateTime.now();
        this.vehicle = vehicle;
    }

    public long getPaymentRatio() {
        long hours = ChronoUnit.HOURS.between(
                this.vehicle.getPlacement().getStartDateTime(),
                this.endDateTime
        );

        return hours * this.vehicle.getSize().getNeededSlots();
    }
}
