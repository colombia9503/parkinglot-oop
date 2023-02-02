package com.sumana.parkinglot.domain.payments;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Receipt {
    private String customerFullName;
    private Charge charge;

}
