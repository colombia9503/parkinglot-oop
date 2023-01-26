package com.sumana.parkinglot.domain.payments;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

@RequiredArgsConstructor
public class Placement {

    @NonNull
    private LocalDateTime startDateTime;
    private LocalDateTime endDateTime;
}
