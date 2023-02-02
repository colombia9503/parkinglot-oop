package com.sumana.parkinglot.domain.payments;

import com.sumana.parkinglot.domain.vehicles.Vehicle;
import lombok.*;

@Data()
@RequiredArgsConstructor
public class Charge {

    @NonNull
    private Float value;
    @NonNull
    private Vehicle vehicle;

    @Setter(AccessLevel.NONE)
    private boolean isPaid = false;

    public void pay() {
        this.isPaid = true;
    }
}
