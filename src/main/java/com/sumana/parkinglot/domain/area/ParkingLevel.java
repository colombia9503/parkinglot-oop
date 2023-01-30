package com.sumana.parkinglot.domain.area;

import com.sumana.parkinglot.domain.exception.InsufficientSlotsPerLevelException;
import com.sumana.parkinglot.domain.payments.Placement;
import com.sumana.parkinglot.domain.payments.Retirement;
import com.sumana.parkinglot.domain.vehicles.Size;
import com.sumana.parkinglot.domain.vehicles.Vehicle;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ParkingLevel {

    private static final int MIN_SLOTS_PER_LEVEL = Size.LargeSize.getNeededSlots();
    private int floor;
    private ParkingSlot[] parkingSlots;
    private int availableSlots;

    public ParkingLevel(int floor, int availableSlots) {
        if (availableSlots < MIN_SLOTS_PER_LEVEL)
            throw new InsufficientSlotsPerLevelException(
                    String.format("The available slots per level must be greater than %1d", MIN_SLOTS_PER_LEVEL)
            );

        this.floor = floor;
        this.availableSlots = availableSlots;
        parkingSlots = new ParkingSlot[availableSlots];
    }

    public int getAvailableSlots() {
        return this.availableSlots;
    }

    public boolean parkVehicle(Vehicle vehicle) {
        int vehicleNeededSlots = vehicle.getSize().getNeededSlots();
        if (this.availableSlots < vehicleNeededSlots)
            return false;

        Placement placement = new Placement(LocalDateTime.now());
        vehicle.setPlacement(placement);

        this.availableSlots -= vehicleNeededSlots;
        int cellNumber = (availableSlots - this.parkingSlots.length) * -1;
        for (int i = cellNumber; i < vehicleNeededSlots; i++) {
            ParkingSlot parkingSlot = new ParkingSlot(vehicle, i, this);
            parkingSlots[i] = parkingSlot;
            vehicle.addParkingSlot(parkingSlot);
        }
        return true;
    }

    public Retirement retireVehicle(Vehicle vehicle) {
        int vehicleSize = vehicle.getSize().getNeededSlots();

        this.availableSlots += vehicleSize;
        vehicle.clearSlots();

        return new Retirement(vehicle);
    }


}
