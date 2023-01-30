package com.sumana.parkinglot.domain;

import com.sumana.parkinglot.domain.area.ParkingLevel;

public class ParkingLot {

    private static final int MIN_PARKING_LEVELS = 1;

    private ParkingLevel[] parkingLevels;
    private int cellsPerLevel;

    public ParkingLot(int numberOfLevels, int cellsPerLevel) {
        this.cellsPerLevel = cellsPerLevel;
        this.parkingLevels = new ParkingLevel[numberOfLevels];
        // TODO implement parking lot logic, it is already implemented for levels
    }
}
