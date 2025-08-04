package com.delta.boardingpass.service;

import com.delta.boardingpass.model.bagTag.BagTagPrintRequest;
import com.delta.boardingpass.model.bagTag.BagTagPrintResponse;

public interface BagTagPrintService {
    BagTagPrintResponse generateBagTag(BagTagPrintRequest bagTagRequest);
}
