package com.sumana.parkinglot.domain.vehicles;

import com.sumana.parkinglot.domain.area.ParkingSlot;
import com.sumana.parkinglot.domain.payments.Placement;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@RequiredArgsConstructor
public abstract class Vehicle {
    protected List<ParkingSlot> parkingSlots = new ArrayList<>();
    @NonNull
    protected String licencePlate;

    @NonNull
    protected Size size;

    @NonNull
    protected Placement placement;

    public void clearSlots() {
        this.parkingSlots.clear();
    }

    public Size getSize() {
        return this.size;
    }

    public String getLicencePlate() {
        return this.licencePlate;
    }

    public void addParkingSlot(ParkingSlot parkingSlot) {
        this.parkingSlots.add(parkingSlot);
    }
}
