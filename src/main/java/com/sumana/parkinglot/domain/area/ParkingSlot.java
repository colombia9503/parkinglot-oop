package com.sumana.parkinglot.domain.area;

import com.sumana.parkinglot.domain.vehicles.Vehicle;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ParkingSlot {
    private Vehicle vehicle;
    private int cellNumber;
    private ParkingLevel parkingLevel;
}
