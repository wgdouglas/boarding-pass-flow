# Key Modules

```
src/
└── main/
├── java/com/boardingpassflow/
│     ├── controller/BoardingPassGatewayController.java
│     ├── orchestrator/BoardingFlowService.java
│     ├── client/SabreClientService.java
│     ├── crypto/CryptoService.java
│     ├── model/Passenger.java (JAXB POJO)
│     └── manifest/ManifestService.java
└── resources/
└── application.yml
```

## Structure the One-App Prototype

```
boarding-pass-service/
├── bff/                         # Handles API requests, transformations
│   └── controller/
├── sabre-gateway/              # JAXB client + transformer
├── bagtag-system/              # Bagtag eligibility, timeline
├── orchestrator/               # Handles flow across services
├── crypto-service/             # Handles token/id encoding
├── config/                     # Secrets, beans, etc.
├── test/                       # All unit/integration tests
└── application.yml

```

## Main One-App Project Structure

```
src/main/java/com/delta/boardingpass
│
├── config/
│   ├── AppConfig.java
│   ├── ApiClientConfig.java
│   └── SecretsConfig.java
│
├── controller/
│   ├── BoardingPassController.java
│   └── CryptoController.java
│
├── service/
│   ├── BoardingPassService.java
│   ├── CryptoService.java
│   ├── OrchestratorService.java
│   ├── BagTagPrintService.java
│   └── SabreGatewayService.java
│
├── transformer/
│   ├── BoardingPassTransformer.java
│   └── SabreResponseTransformer.java
│
├── client/
│   ├── SabreWebServiceClient.java
│   ├── BagTagPrintClient.java
│   └── ManifestClient.java
│
├── model/
│   ├── BoardingPassRequest.java
│   ├── BoardingPassResponse.java
│   ├── SabrePassengerInfo.java
│   └── JAXB-generated/  (read-only auto-generated from XSD)
│
├── repository/
│   └── BoardingPassRepository.java
│
├── entity/
│   └── BoardingPassEntity.java
│
└── BoardingPassApplication.java

```