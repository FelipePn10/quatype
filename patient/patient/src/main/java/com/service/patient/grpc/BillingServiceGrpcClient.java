package com.service.patient.grpc;

import billing.BillingRequest;
import billing.BillingResponse;
import billing.BillingServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class BillingServiceGrpcClient {
    private  static final Logger logger = LoggerFactory.getLogger(BillingServiceGrpcClient.class);

    //Encapsula as chamadas gRPC
    private final BillingServiceGrpc.BillingServiceBlockingStub blockingStub;

    // localhost:9001/BillingService/CreatePatientAccount
    // aws.grpc:123123/BillingSerice/CreatePatientAccount
    public BillingServiceGrpcClient(
            @Value("${billing.service.address:localhost}") String serverAddress,
            @Value("${billing.service.grpc.port:9001}") int serverPort
    ) {
        logger.info("Connecting to billing service gRPC service at {}:{}", serverAddress, serverPort);
        // Cria um builder do canal para o servidor informado (imutável)
        ManagedChannel channel = ManagedChannelBuilder.forAddress(serverAddress, serverPort).usePlaintext().build();
        // Cria o Stub passando o canal construído.
        blockingStub = BillingServiceGrpc.newBlockingStub(channel);
    }

    public BillingResponse createbillingAccount(String patientId, String name, String email) {
        BillingRequest request =
                BillingRequest.newBuilder().setPatientId(patientId).setName(name).setEmail(email).build();
        BillingResponse response = blockingStub.createBillingAccount(request);
        logger.info("Received response from billing service via gRPC: {}", response);
        return response;
    }
}
