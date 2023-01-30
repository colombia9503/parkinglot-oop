package com.sumana.parkinglot.domain.payments;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

@Data
@RequiredArgsConstructor
public class Placement {

    @NonNull
    private LocalDateTime startDateTime;
}
