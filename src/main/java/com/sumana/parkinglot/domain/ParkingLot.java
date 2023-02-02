package com.sumana.parkinglot.domain;

import com.sumana.parkinglot.domain.area.ParkingLevel;
import com.sumana.parkinglot.domain.area.ParkingSlot;
import com.sumana.parkinglot.domain.exception.InsufficientParkingLevelsException;
import com.sumana.parkinglot.domain.payments.Charge;

public class ParkingLot {

    private static final int MIN_PARKING_LEVELS = 1;

    private ParkingLevel[] parkingLevels;
    private int cellsPerLevel;

    public ParkingLot(int numberOfLevels, int cellsPerLevel) {
        if (numberOfLevels < MIN_PARKING_LEVELS)
            throw new InsufficientParkingLevelsException(
                    String.format("Not sufficient parking levels: %s1", numberOfLevels)
            );
        this.cellsPerLevel = cellsPerLevel;
        this.parkingLevels = new ParkingLevel[numberOfLevels];
        // TODO implement parking lot logic, it is already implemented for levels
    }

    public ParkingSlot admitVehicle(String licencePlate) {
        return null;
    }

    public Charge retireVehicle(String licencePlate) {
        // TODO implement a way to search for the vehicle in the parking with the licence plate.
        return null;
    }
}
