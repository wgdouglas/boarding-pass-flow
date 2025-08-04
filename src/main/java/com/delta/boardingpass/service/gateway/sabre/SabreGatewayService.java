package com.delta.boardingpass.service.gateway.sabre;

import com.delta.boardingpass.dto.external.sabre.ExternalSabreResponse;

public interface SabreGatewayService {
    ExternalSabreResponse fetchBoardingData(String pnrCode);
}
