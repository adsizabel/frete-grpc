package br.com.estudos;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u0016J\"\u0010\n\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u0016\u00a8\u0006\u000b"}, d2 = {"Lbr/com/estudos/HealthCheckerService;", "Lio/grpc/health/v1/HealthGrpc$HealthImplBase;", "()V", "check", "", "request", "Lio/grpc/health/v1/HealthCheckRequest;", "responseObserver", "Lio/grpc/stub/StreamObserver;", "Lio/grpc/health/v1/HealthCheckResponse;", "watch", "fretes"})
@javax.inject.Singleton()
public final class HealthCheckerService extends io.grpc.health.v1.HealthGrpc.HealthImplBase {
    
    @java.lang.Override()
    public void check(@org.jetbrains.annotations.Nullable()
    io.grpc.health.v1.HealthCheckRequest request, @org.jetbrains.annotations.Nullable()
    io.grpc.stub.StreamObserver<io.grpc.health.v1.HealthCheckResponse> responseObserver) {
    }
    
    @java.lang.Override()
    public void watch(@org.jetbrains.annotations.Nullable()
    io.grpc.health.v1.HealthCheckRequest request, @org.jetbrains.annotations.Nullable()
    io.grpc.stub.StreamObserver<io.grpc.health.v1.HealthCheckResponse> responseObserver) {
    }
    
    public HealthCheckerService() {
        super();
    }
}