package com.dagli.grpcserver.service;

import com.dagli.HelloRequest;
import com.dagli.HelloResponse;
import com.dagli.HelloServiceGrpc;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

/**
 * Insecure connection, which we’ve been using since the beginning of this course. In this
 * connection, all data transferred between client and server is not encrypted.
 */
@GrpcService
public class HelloServiceImpl extends HelloServiceGrpc.HelloServiceImplBase {

  /** Insecure gRPC communication type between services. */
  @Override
  public void hello(HelloRequest request, StreamObserver<HelloResponse> responseObserver) {

    String message = "Hi " + request.getName() + ". This is insecure type of connection.";

    HelloResponse response = HelloResponse.newBuilder().setMessage(message).build();

    responseObserver.onNext(response);
    responseObserver.onCompleted();
  }
}
