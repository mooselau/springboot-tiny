package io.grpc.examples.routeguide;

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
    comments = "Source: route_guide.proto")
public final class RouteGuideGrpc {

  private RouteGuideGrpc() {}

  public static final String SERVICE_NAME = "routeguide.RouteGuide";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.grpc.examples.routeguide.RouteGuideOuterClass.Point,
      io.grpc.examples.routeguide.RouteGuideOuterClass.Feature> getGetFeatureMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetFeature",
      requestType = io.grpc.examples.routeguide.RouteGuideOuterClass.Point.class,
      responseType = io.grpc.examples.routeguide.RouteGuideOuterClass.Feature.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.grpc.examples.routeguide.RouteGuideOuterClass.Point,
      io.grpc.examples.routeguide.RouteGuideOuterClass.Feature> getGetFeatureMethod() {
    io.grpc.MethodDescriptor<io.grpc.examples.routeguide.RouteGuideOuterClass.Point, io.grpc.examples.routeguide.RouteGuideOuterClass.Feature> getGetFeatureMethod;
    if ((getGetFeatureMethod = RouteGuideGrpc.getGetFeatureMethod) == null) {
      synchronized (RouteGuideGrpc.class) {
        if ((getGetFeatureMethod = RouteGuideGrpc.getGetFeatureMethod) == null) {
          RouteGuideGrpc.getGetFeatureMethod = getGetFeatureMethod =
              io.grpc.MethodDescriptor.<io.grpc.examples.routeguide.RouteGuideOuterClass.Point, io.grpc.examples.routeguide.RouteGuideOuterClass.Feature>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetFeature"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.examples.routeguide.RouteGuideOuterClass.Point.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.examples.routeguide.RouteGuideOuterClass.Feature.getDefaultInstance()))
              .setSchemaDescriptor(new RouteGuideMethodDescriptorSupplier("GetFeature"))
              .build();
        }
      }
    }
    return getGetFeatureMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.grpc.examples.routeguide.RouteGuideOuterClass.Rectangle,
      io.grpc.examples.routeguide.RouteGuideOuterClass.Feature> getListFeatureMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListFeature",
      requestType = io.grpc.examples.routeguide.RouteGuideOuterClass.Rectangle.class,
      responseType = io.grpc.examples.routeguide.RouteGuideOuterClass.Feature.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<io.grpc.examples.routeguide.RouteGuideOuterClass.Rectangle,
      io.grpc.examples.routeguide.RouteGuideOuterClass.Feature> getListFeatureMethod() {
    io.grpc.MethodDescriptor<io.grpc.examples.routeguide.RouteGuideOuterClass.Rectangle, io.grpc.examples.routeguide.RouteGuideOuterClass.Feature> getListFeatureMethod;
    if ((getListFeatureMethod = RouteGuideGrpc.getListFeatureMethod) == null) {
      synchronized (RouteGuideGrpc.class) {
        if ((getListFeatureMethod = RouteGuideGrpc.getListFeatureMethod) == null) {
          RouteGuideGrpc.getListFeatureMethod = getListFeatureMethod =
              io.grpc.MethodDescriptor.<io.grpc.examples.routeguide.RouteGuideOuterClass.Rectangle, io.grpc.examples.routeguide.RouteGuideOuterClass.Feature>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListFeature"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.examples.routeguide.RouteGuideOuterClass.Rectangle.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.examples.routeguide.RouteGuideOuterClass.Feature.getDefaultInstance()))
              .setSchemaDescriptor(new RouteGuideMethodDescriptorSupplier("ListFeature"))
              .build();
        }
      }
    }
    return getListFeatureMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.grpc.examples.routeguide.RouteGuideOuterClass.Point,
      io.grpc.examples.routeguide.RouteGuideOuterClass.RouteSummary> getRecordRouteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RecordRoute",
      requestType = io.grpc.examples.routeguide.RouteGuideOuterClass.Point.class,
      responseType = io.grpc.examples.routeguide.RouteGuideOuterClass.RouteSummary.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<io.grpc.examples.routeguide.RouteGuideOuterClass.Point,
      io.grpc.examples.routeguide.RouteGuideOuterClass.RouteSummary> getRecordRouteMethod() {
    io.grpc.MethodDescriptor<io.grpc.examples.routeguide.RouteGuideOuterClass.Point, io.grpc.examples.routeguide.RouteGuideOuterClass.RouteSummary> getRecordRouteMethod;
    if ((getRecordRouteMethod = RouteGuideGrpc.getRecordRouteMethod) == null) {
      synchronized (RouteGuideGrpc.class) {
        if ((getRecordRouteMethod = RouteGuideGrpc.getRecordRouteMethod) == null) {
          RouteGuideGrpc.getRecordRouteMethod = getRecordRouteMethod =
              io.grpc.MethodDescriptor.<io.grpc.examples.routeguide.RouteGuideOuterClass.Point, io.grpc.examples.routeguide.RouteGuideOuterClass.RouteSummary>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RecordRoute"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.examples.routeguide.RouteGuideOuterClass.Point.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.examples.routeguide.RouteGuideOuterClass.RouteSummary.getDefaultInstance()))
              .setSchemaDescriptor(new RouteGuideMethodDescriptorSupplier("RecordRoute"))
              .build();
        }
      }
    }
    return getRecordRouteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.grpc.examples.routeguide.RouteGuideOuterClass.RouteNote,
      io.grpc.examples.routeguide.RouteGuideOuterClass.RouteNote> getRouteChatMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RouteChat",
      requestType = io.grpc.examples.routeguide.RouteGuideOuterClass.RouteNote.class,
      responseType = io.grpc.examples.routeguide.RouteGuideOuterClass.RouteNote.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<io.grpc.examples.routeguide.RouteGuideOuterClass.RouteNote,
      io.grpc.examples.routeguide.RouteGuideOuterClass.RouteNote> getRouteChatMethod() {
    io.grpc.MethodDescriptor<io.grpc.examples.routeguide.RouteGuideOuterClass.RouteNote, io.grpc.examples.routeguide.RouteGuideOuterClass.RouteNote> getRouteChatMethod;
    if ((getRouteChatMethod = RouteGuideGrpc.getRouteChatMethod) == null) {
      synchronized (RouteGuideGrpc.class) {
        if ((getRouteChatMethod = RouteGuideGrpc.getRouteChatMethod) == null) {
          RouteGuideGrpc.getRouteChatMethod = getRouteChatMethod =
              io.grpc.MethodDescriptor.<io.grpc.examples.routeguide.RouteGuideOuterClass.RouteNote, io.grpc.examples.routeguide.RouteGuideOuterClass.RouteNote>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RouteChat"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.examples.routeguide.RouteGuideOuterClass.RouteNote.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.examples.routeguide.RouteGuideOuterClass.RouteNote.getDefaultInstance()))
              .setSchemaDescriptor(new RouteGuideMethodDescriptorSupplier("RouteChat"))
              .build();
        }
      }
    }
    return getRouteChatMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RouteGuideStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RouteGuideStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RouteGuideStub>() {
        @java.lang.Override
        public RouteGuideStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RouteGuideStub(channel, callOptions);
        }
      };
    return RouteGuideStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RouteGuideBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RouteGuideBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RouteGuideBlockingStub>() {
        @java.lang.Override
        public RouteGuideBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RouteGuideBlockingStub(channel, callOptions);
        }
      };
    return RouteGuideBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RouteGuideFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RouteGuideFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RouteGuideFutureStub>() {
        @java.lang.Override
        public RouteGuideFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RouteGuideFutureStub(channel, callOptions);
        }
      };
    return RouteGuideFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class RouteGuideImplBase implements io.grpc.BindableService {

    /**
     */
    public void getFeature(io.grpc.examples.routeguide.RouteGuideOuterClass.Point request,
        io.grpc.stub.StreamObserver<io.grpc.examples.routeguide.RouteGuideOuterClass.Feature> responseObserver) {
      asyncUnimplementedUnaryCall(getGetFeatureMethod(), responseObserver);
    }

    /**
     */
    public void listFeature(io.grpc.examples.routeguide.RouteGuideOuterClass.Rectangle request,
        io.grpc.stub.StreamObserver<io.grpc.examples.routeguide.RouteGuideOuterClass.Feature> responseObserver) {
      asyncUnimplementedUnaryCall(getListFeatureMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<io.grpc.examples.routeguide.RouteGuideOuterClass.Point> recordRoute(
        io.grpc.stub.StreamObserver<io.grpc.examples.routeguide.RouteGuideOuterClass.RouteSummary> responseObserver) {
      return asyncUnimplementedStreamingCall(getRecordRouteMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<io.grpc.examples.routeguide.RouteGuideOuterClass.RouteNote> routeChat(
        io.grpc.stub.StreamObserver<io.grpc.examples.routeguide.RouteGuideOuterClass.RouteNote> responseObserver) {
      return asyncUnimplementedStreamingCall(getRouteChatMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetFeatureMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.grpc.examples.routeguide.RouteGuideOuterClass.Point,
                io.grpc.examples.routeguide.RouteGuideOuterClass.Feature>(
                  this, METHODID_GET_FEATURE)))
          .addMethod(
            getListFeatureMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                io.grpc.examples.routeguide.RouteGuideOuterClass.Rectangle,
                io.grpc.examples.routeguide.RouteGuideOuterClass.Feature>(
                  this, METHODID_LIST_FEATURE)))
          .addMethod(
            getRecordRouteMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                io.grpc.examples.routeguide.RouteGuideOuterClass.Point,
                io.grpc.examples.routeguide.RouteGuideOuterClass.RouteSummary>(
                  this, METHODID_RECORD_ROUTE)))
          .addMethod(
            getRouteChatMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                io.grpc.examples.routeguide.RouteGuideOuterClass.RouteNote,
                io.grpc.examples.routeguide.RouteGuideOuterClass.RouteNote>(
                  this, METHODID_ROUTE_CHAT)))
          .build();
    }
  }

  /**
   */
  public static final class RouteGuideStub extends io.grpc.stub.AbstractAsyncStub<RouteGuideStub> {
    private RouteGuideStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RouteGuideStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RouteGuideStub(channel, callOptions);
    }

    /**
     */
    public void getFeature(io.grpc.examples.routeguide.RouteGuideOuterClass.Point request,
        io.grpc.stub.StreamObserver<io.grpc.examples.routeguide.RouteGuideOuterClass.Feature> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetFeatureMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listFeature(io.grpc.examples.routeguide.RouteGuideOuterClass.Rectangle request,
        io.grpc.stub.StreamObserver<io.grpc.examples.routeguide.RouteGuideOuterClass.Feature> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getListFeatureMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<io.grpc.examples.routeguide.RouteGuideOuterClass.Point> recordRoute(
        io.grpc.stub.StreamObserver<io.grpc.examples.routeguide.RouteGuideOuterClass.RouteSummary> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getRecordRouteMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<io.grpc.examples.routeguide.RouteGuideOuterClass.RouteNote> routeChat(
        io.grpc.stub.StreamObserver<io.grpc.examples.routeguide.RouteGuideOuterClass.RouteNote> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getRouteChatMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class RouteGuideBlockingStub extends io.grpc.stub.AbstractBlockingStub<RouteGuideBlockingStub> {
    private RouteGuideBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RouteGuideBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RouteGuideBlockingStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.examples.routeguide.RouteGuideOuterClass.Feature getFeature(io.grpc.examples.routeguide.RouteGuideOuterClass.Point request) {
      return blockingUnaryCall(
          getChannel(), getGetFeatureMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<io.grpc.examples.routeguide.RouteGuideOuterClass.Feature> listFeature(
        io.grpc.examples.routeguide.RouteGuideOuterClass.Rectangle request) {
      return blockingServerStreamingCall(
          getChannel(), getListFeatureMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class RouteGuideFutureStub extends io.grpc.stub.AbstractFutureStub<RouteGuideFutureStub> {
    private RouteGuideFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RouteGuideFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RouteGuideFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.examples.routeguide.RouteGuideOuterClass.Feature> getFeature(
        io.grpc.examples.routeguide.RouteGuideOuterClass.Point request) {
      return futureUnaryCall(
          getChannel().newCall(getGetFeatureMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_FEATURE = 0;
  private static final int METHODID_LIST_FEATURE = 1;
  private static final int METHODID_RECORD_ROUTE = 2;
  private static final int METHODID_ROUTE_CHAT = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RouteGuideImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RouteGuideImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_FEATURE:
          serviceImpl.getFeature((io.grpc.examples.routeguide.RouteGuideOuterClass.Point) request,
              (io.grpc.stub.StreamObserver<io.grpc.examples.routeguide.RouteGuideOuterClass.Feature>) responseObserver);
          break;
        case METHODID_LIST_FEATURE:
          serviceImpl.listFeature((io.grpc.examples.routeguide.RouteGuideOuterClass.Rectangle) request,
              (io.grpc.stub.StreamObserver<io.grpc.examples.routeguide.RouteGuideOuterClass.Feature>) responseObserver);
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
        case METHODID_RECORD_ROUTE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.recordRoute(
              (io.grpc.stub.StreamObserver<io.grpc.examples.routeguide.RouteGuideOuterClass.RouteSummary>) responseObserver);
        case METHODID_ROUTE_CHAT:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.routeChat(
              (io.grpc.stub.StreamObserver<io.grpc.examples.routeguide.RouteGuideOuterClass.RouteNote>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class RouteGuideBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RouteGuideBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.grpc.examples.routeguide.RouteGuideOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RouteGuide");
    }
  }

  private static final class RouteGuideFileDescriptorSupplier
      extends RouteGuideBaseDescriptorSupplier {
    RouteGuideFileDescriptorSupplier() {}
  }

  private static final class RouteGuideMethodDescriptorSupplier
      extends RouteGuideBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RouteGuideMethodDescriptorSupplier(String methodName) {
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
      synchronized (RouteGuideGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RouteGuideFileDescriptorSupplier())
              .addMethod(getGetFeatureMethod())
              .addMethod(getListFeatureMethod())
              .addMethod(getRecordRouteMethod())
              .addMethod(getRouteChatMethod())
              .build();
        }
      }
    }
    return result;
  }
}
