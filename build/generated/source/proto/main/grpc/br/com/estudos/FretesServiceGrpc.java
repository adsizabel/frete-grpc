package br.com.estudos;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.38.0)",
    comments = "Source: fretes.proto")
public final class FretesServiceGrpc {

  private FretesServiceGrpc() {}

  public static final String SERVICE_NAME = "br.com.estudos.FretesService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<br.com.estudos.FretesRequest,
      br.com.estudos.FretesReply> getSendMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "send",
      requestType = br.com.estudos.FretesRequest.class,
      responseType = br.com.estudos.FretesReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<br.com.estudos.FretesRequest,
      br.com.estudos.FretesReply> getSendMethod() {
    io.grpc.MethodDescriptor<br.com.estudos.FretesRequest, br.com.estudos.FretesReply> getSendMethod;
    if ((getSendMethod = FretesServiceGrpc.getSendMethod) == null) {
      synchronized (FretesServiceGrpc.class) {
        if ((getSendMethod = FretesServiceGrpc.getSendMethod) == null) {
          FretesServiceGrpc.getSendMethod = getSendMethod =
              io.grpc.MethodDescriptor.<br.com.estudos.FretesRequest, br.com.estudos.FretesReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "send"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.estudos.FretesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.estudos.FretesReply.getDefaultInstance()))
              .setSchemaDescriptor(new FretesServiceMethodDescriptorSupplier("send"))
              .build();
        }
      }
    }
    return getSendMethod;
  }

  private static volatile io.grpc.MethodDescriptor<br.com.estudos.CalculaFreteRequest,
      br.com.estudos.CalculaFreteResponse> getCalculaFreteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "calculaFrete",
      requestType = br.com.estudos.CalculaFreteRequest.class,
      responseType = br.com.estudos.CalculaFreteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<br.com.estudos.CalculaFreteRequest,
      br.com.estudos.CalculaFreteResponse> getCalculaFreteMethod() {
    io.grpc.MethodDescriptor<br.com.estudos.CalculaFreteRequest, br.com.estudos.CalculaFreteResponse> getCalculaFreteMethod;
    if ((getCalculaFreteMethod = FretesServiceGrpc.getCalculaFreteMethod) == null) {
      synchronized (FretesServiceGrpc.class) {
        if ((getCalculaFreteMethod = FretesServiceGrpc.getCalculaFreteMethod) == null) {
          FretesServiceGrpc.getCalculaFreteMethod = getCalculaFreteMethod =
              io.grpc.MethodDescriptor.<br.com.estudos.CalculaFreteRequest, br.com.estudos.CalculaFreteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "calculaFrete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.estudos.CalculaFreteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.estudos.CalculaFreteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FretesServiceMethodDescriptorSupplier("calculaFrete"))
              .build();
        }
      }
    }
    return getCalculaFreteMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static FretesServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FretesServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FretesServiceStub>() {
        @java.lang.Override
        public FretesServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FretesServiceStub(channel, callOptions);
        }
      };
    return FretesServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static FretesServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FretesServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FretesServiceBlockingStub>() {
        @java.lang.Override
        public FretesServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FretesServiceBlockingStub(channel, callOptions);
        }
      };
    return FretesServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static FretesServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FretesServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FretesServiceFutureStub>() {
        @java.lang.Override
        public FretesServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FretesServiceFutureStub(channel, callOptions);
        }
      };
    return FretesServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class FretesServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void send(br.com.estudos.FretesRequest request,
        io.grpc.stub.StreamObserver<br.com.estudos.FretesReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSendMethod(), responseObserver);
    }

    /**
     */
    public void calculaFrete(br.com.estudos.CalculaFreteRequest request,
        io.grpc.stub.StreamObserver<br.com.estudos.CalculaFreteResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCalculaFreteMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSendMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                br.com.estudos.FretesRequest,
                br.com.estudos.FretesReply>(
                  this, METHODID_SEND)))
          .addMethod(
            getCalculaFreteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                br.com.estudos.CalculaFreteRequest,
                br.com.estudos.CalculaFreteResponse>(
                  this, METHODID_CALCULA_FRETE)))
          .build();
    }
  }

  /**
   */
  public static final class FretesServiceStub extends io.grpc.stub.AbstractAsyncStub<FretesServiceStub> {
    private FretesServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FretesServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FretesServiceStub(channel, callOptions);
    }

    /**
     */
    public void send(br.com.estudos.FretesRequest request,
        io.grpc.stub.StreamObserver<br.com.estudos.FretesReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSendMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void calculaFrete(br.com.estudos.CalculaFreteRequest request,
        io.grpc.stub.StreamObserver<br.com.estudos.CalculaFreteResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCalculaFreteMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class FretesServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<FretesServiceBlockingStub> {
    private FretesServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FretesServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FretesServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public br.com.estudos.FretesReply send(br.com.estudos.FretesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSendMethod(), getCallOptions(), request);
    }

    /**
     */
    public br.com.estudos.CalculaFreteResponse calculaFrete(br.com.estudos.CalculaFreteRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCalculaFreteMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class FretesServiceFutureStub extends io.grpc.stub.AbstractFutureStub<FretesServiceFutureStub> {
    private FretesServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FretesServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FretesServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<br.com.estudos.FretesReply> send(
        br.com.estudos.FretesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSendMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<br.com.estudos.CalculaFreteResponse> calculaFrete(
        br.com.estudos.CalculaFreteRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCalculaFreteMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEND = 0;
  private static final int METHODID_CALCULA_FRETE = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final FretesServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(FretesServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEND:
          serviceImpl.send((br.com.estudos.FretesRequest) request,
              (io.grpc.stub.StreamObserver<br.com.estudos.FretesReply>) responseObserver);
          break;
        case METHODID_CALCULA_FRETE:
          serviceImpl.calculaFrete((br.com.estudos.CalculaFreteRequest) request,
              (io.grpc.stub.StreamObserver<br.com.estudos.CalculaFreteResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class FretesServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    FretesServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return br.com.estudos.Fretes.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("FretesService");
    }
  }

  private static final class FretesServiceFileDescriptorSupplier
      extends FretesServiceBaseDescriptorSupplier {
    FretesServiceFileDescriptorSupplier() {}
  }

  private static final class FretesServiceMethodDescriptorSupplier
      extends FretesServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    FretesServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (FretesServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new FretesServiceFileDescriptorSupplier())
              .addMethod(getSendMethod())
              .addMethod(getCalculaFreteMethod())
              .build();
        }
      }
    }
    return result;
  }
}
