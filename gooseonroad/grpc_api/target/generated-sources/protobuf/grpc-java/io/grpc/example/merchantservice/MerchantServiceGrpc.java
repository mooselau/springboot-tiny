package io.grpc.example.merchantservice;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.26.0)",
    comments = "Source: merchant_service.proto")
public final class MerchantServiceGrpc {

  private MerchantServiceGrpc() {}

  public static final String SERVICE_NAME = "merchantservice.MerchantService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      io.grpc.example.merchantservice.MerchantServiceOuterClass.IndustryTypes> getGetMerchantIndustryTypesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getMerchantIndustryTypes",
      requestType = com.google.protobuf.Empty.class,
      responseType = io.grpc.example.merchantservice.MerchantServiceOuterClass.IndustryTypes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      io.grpc.example.merchantservice.MerchantServiceOuterClass.IndustryTypes> getGetMerchantIndustryTypesMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, io.grpc.example.merchantservice.MerchantServiceOuterClass.IndustryTypes> getGetMerchantIndustryTypesMethod;
    if ((getGetMerchantIndustryTypesMethod = MerchantServiceGrpc.getGetMerchantIndustryTypesMethod) == null) {
      synchronized (MerchantServiceGrpc.class) {
        if ((getGetMerchantIndustryTypesMethod = MerchantServiceGrpc.getGetMerchantIndustryTypesMethod) == null) {
          MerchantServiceGrpc.getGetMerchantIndustryTypesMethod = getGetMerchantIndustryTypesMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, io.grpc.example.merchantservice.MerchantServiceOuterClass.IndustryTypes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getMerchantIndustryTypes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.example.merchantservice.MerchantServiceOuterClass.IndustryTypes.getDefaultInstance()))
              .setSchemaDescriptor(new MerchantServiceMethodDescriptorSupplier("getMerchantIndustryTypes"))
              .build();
        }
      }
    }
    return getGetMerchantIndustryTypesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      io.grpc.example.merchantservice.MerchantServiceOuterClass.IndustryType> getGetMerchantIndustryTypeListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getMerchantIndustryTypeList",
      requestType = com.google.protobuf.Empty.class,
      responseType = io.grpc.example.merchantservice.MerchantServiceOuterClass.IndustryType.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      io.grpc.example.merchantservice.MerchantServiceOuterClass.IndustryType> getGetMerchantIndustryTypeListMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, io.grpc.example.merchantservice.MerchantServiceOuterClass.IndustryType> getGetMerchantIndustryTypeListMethod;
    if ((getGetMerchantIndustryTypeListMethod = MerchantServiceGrpc.getGetMerchantIndustryTypeListMethod) == null) {
      synchronized (MerchantServiceGrpc.class) {
        if ((getGetMerchantIndustryTypeListMethod = MerchantServiceGrpc.getGetMerchantIndustryTypeListMethod) == null) {
          MerchantServiceGrpc.getGetMerchantIndustryTypeListMethod = getGetMerchantIndustryTypeListMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, io.grpc.example.merchantservice.MerchantServiceOuterClass.IndustryType>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getMerchantIndustryTypeList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.example.merchantservice.MerchantServiceOuterClass.IndustryType.getDefaultInstance()))
              .setSchemaDescriptor(new MerchantServiceMethodDescriptorSupplier("getMerchantIndustryTypeList"))
              .build();
        }
      }
    }
    return getGetMerchantIndustryTypeListMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MerchantServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MerchantServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MerchantServiceStub>() {
        @java.lang.Override
        public MerchantServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MerchantServiceStub(channel, callOptions);
        }
      };
    return MerchantServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MerchantServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MerchantServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MerchantServiceBlockingStub>() {
        @java.lang.Override
        public MerchantServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MerchantServiceBlockingStub(channel, callOptions);
        }
      };
    return MerchantServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MerchantServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MerchantServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MerchantServiceFutureStub>() {
        @java.lang.Override
        public MerchantServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MerchantServiceFutureStub(channel, callOptions);
        }
      };
    return MerchantServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class MerchantServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * normal
     * </pre>
     */
    public void getMerchantIndustryTypes(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<io.grpc.example.merchantservice.MerchantServiceOuterClass.IndustryTypes> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMerchantIndustryTypesMethod(), responseObserver);
    }

    /**
     * <pre>
     * client-side streaming api
     * </pre>
     */
    public void getMerchantIndustryTypeList(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<io.grpc.example.merchantservice.MerchantServiceOuterClass.IndustryType> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMerchantIndustryTypeListMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMerchantIndustryTypesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                io.grpc.example.merchantservice.MerchantServiceOuterClass.IndustryTypes>(
                  this, METHODID_GET_MERCHANT_INDUSTRY_TYPES)))
          .addMethod(
            getGetMerchantIndustryTypeListMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                io.grpc.example.merchantservice.MerchantServiceOuterClass.IndustryType>(
                  this, METHODID_GET_MERCHANT_INDUSTRY_TYPE_LIST)))
          .build();
    }
  }

  /**
   */
  public static final class MerchantServiceStub extends io.grpc.stub.AbstractAsyncStub<MerchantServiceStub> {
    private MerchantServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MerchantServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MerchantServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * normal
     * </pre>
     */
    public void getMerchantIndustryTypes(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<io.grpc.example.merchantservice.MerchantServiceOuterClass.IndustryTypes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMerchantIndustryTypesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * client-side streaming api
     * </pre>
     */
    public void getMerchantIndustryTypeList(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<io.grpc.example.merchantservice.MerchantServiceOuterClass.IndustryType> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetMerchantIndustryTypeListMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class MerchantServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<MerchantServiceBlockingStub> {
    private MerchantServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MerchantServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MerchantServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * normal
     * </pre>
     */
    public io.grpc.example.merchantservice.MerchantServiceOuterClass.IndustryTypes getMerchantIndustryTypes(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getGetMerchantIndustryTypesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * client-side streaming api
     * </pre>
     */
    public java.util.Iterator<io.grpc.example.merchantservice.MerchantServiceOuterClass.IndustryType> getMerchantIndustryTypeList(
        com.google.protobuf.Empty request) {
      return blockingServerStreamingCall(
          getChannel(), getGetMerchantIndustryTypeListMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class MerchantServiceFutureStub extends io.grpc.stub.AbstractFutureStub<MerchantServiceFutureStub> {
    private MerchantServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MerchantServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MerchantServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * normal
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.example.merchantservice.MerchantServiceOuterClass.IndustryTypes> getMerchantIndustryTypes(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMerchantIndustryTypesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_MERCHANT_INDUSTRY_TYPES = 0;
  private static final int METHODID_GET_MERCHANT_INDUSTRY_TYPE_LIST = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MerchantServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MerchantServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_MERCHANT_INDUSTRY_TYPES:
          serviceImpl.getMerchantIndustryTypes((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<io.grpc.example.merchantservice.MerchantServiceOuterClass.IndustryTypes>) responseObserver);
          break;
        case METHODID_GET_MERCHANT_INDUSTRY_TYPE_LIST:
          serviceImpl.getMerchantIndustryTypeList((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<io.grpc.example.merchantservice.MerchantServiceOuterClass.IndustryType>) responseObserver);
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

  private static abstract class MerchantServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MerchantServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.grpc.example.merchantservice.MerchantServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MerchantService");
    }
  }

  private static final class MerchantServiceFileDescriptorSupplier
      extends MerchantServiceBaseDescriptorSupplier {
    MerchantServiceFileDescriptorSupplier() {}
  }

  private static final class MerchantServiceMethodDescriptorSupplier
      extends MerchantServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MerchantServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (MerchantServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MerchantServiceFileDescriptorSupplier())
              .addMethod(getGetMerchantIndustryTypesMethod())
              .addMethod(getGetMerchantIndustryTypeListMethod())
              .build();
        }
      }
    }
    return result;
  }
}
