package br.com.estudos;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\n"}, d2 = {"Lbr/com/estudos/GrpcServerController;", "", "grpcServer", "Lio/micronaut/grpc/server/GrpcEmbeddedServer;", "(Lio/micronaut/grpc/server/GrpcEmbeddedServer;)V", "getGrpcServer", "()Lio/micronaut/grpc/server/GrpcEmbeddedServer;", "stop", "Lio/micronaut/http/HttpResponse;", "", "fretes"})
@io.micronaut.http.annotation.Controller()
public final class GrpcServerController {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    private final io.micronaut.grpc.server.GrpcEmbeddedServer grpcServer = null;
    
    @org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Get(value = "/grpc-server/stop")
    public final io.micronaut.http.HttpResponse<java.lang.String> stop() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.micronaut.grpc.server.GrpcEmbeddedServer getGrpcServer() {
        return null;
    }
    
    public GrpcServerController(@org.jetbrains.annotations.NotNull()
    io.micronaut.grpc.server.GrpcEmbeddedServer grpcServer) {
        super();
    }
}