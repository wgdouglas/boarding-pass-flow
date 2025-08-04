package com.delta.boardingpass.service;

import java.time.LocalDateTime;

public interface TimelineService {
    boolean isWithinPrintWindow(LocalDateTime flightTime);
}

