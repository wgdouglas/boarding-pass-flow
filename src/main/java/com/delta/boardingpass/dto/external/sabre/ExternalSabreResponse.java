package com.delta.boardingpass.dto.external.sabre;

import lombok.Data;

@Data
public class ExternalSabreResponse {
    private String statusCode;
    private Eligibility eligibility;
    private String timestamp;

    @Data
    public static class Eligibility {
        private boolean isEligible;
        private String reason;
    }
}
