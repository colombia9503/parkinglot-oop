package com.sumana.parkinglot.domain.vehicles;

import lombok.Getter;

@Getter
public enum Size {
    CompactSize(1, 1.00f),
    RegularSize(1, 2.20f),
    LargeSize(3, 3.50f),
    ;

    private final int neededSlots;
    private final float pricePerHour;

    Size(int neededSlots, float pricePerHour) {
        this.neededSlots = neededSlots;
        this.pricePerHour = pricePerHour;
    }
}
