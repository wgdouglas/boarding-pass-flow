package com.delta.boardingpass.service.impl;

import com.delta.boardingpass.dto.external.sabre.ExternalSabreResponse;
import com.delta.boardingpass.service.gateway.sabre.SabreAPIClient;
import com.delta.boardingpass.service.gateway.sabre.SabreGatewayService;
import com.delta.boardingpass.transformer.SabreResponseTransformer;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BagTagServiceImpl implements SabreGatewayService {

    private final SabreAPIClient sabreAPIClient;
    private final SabreResponseTransformer sabreResponseTransformer;

    public BagTagServiceImpl(SabreAPIClient sabreAPIClient, SabreResponseTransformer sabreResponseTransformer) {
        this.sabreAPIClient = sabreAPIClient;
        this.sabreResponseTransformer = sabreResponseTransformer;
    }

    @Override
    public ExternalSabreResponse fetchBoardingData(String pnrCode){
        // Step 1: Call mocked external Sabre API
        // Step 2: Transform external response to internal format
        // TODO: implement using WebClient or RestTemplate
        return null;
    }
}
