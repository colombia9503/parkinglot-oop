package com.sumana.parkinglot.domain.vehicles;

import com.sumana.parkinglot.domain.area.ParkingSlot;

public class Van extends Vehicle {
    @Override
    public boolean fitInParkingLevel(ParkingSlot parkingSlot) {
        return false;
    }
}
