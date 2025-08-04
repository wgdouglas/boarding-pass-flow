package com.delta.boardingpass.service.eligibility;

public interface EligibilityCheckerService {
    boolean isEligibleForBagTag(String ticketNumber);
}
