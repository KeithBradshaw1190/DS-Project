package org.DS.keithproject.SmartHomeGRPC;

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
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: Lamp.proto")
public final class LampServiceGrpc {

  private LampServiceGrpc() {}

  public static final String SERVICE_NAME = "SmartHomeGRPC.LampService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.DS.keithproject.SmartHomeGRPC.valRequest,
      org.DS.keithproject.SmartHomeGRPC.valResponse> getChangeBrightnessMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "changeBrightness",
      requestType = org.DS.keithproject.SmartHomeGRPC.valRequest.class,
      responseType = org.DS.keithproject.SmartHomeGRPC.valResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<org.DS.keithproject.SmartHomeGRPC.valRequest,
      org.DS.keithproject.SmartHomeGRPC.valResponse> getChangeBrightnessMethod() {
    io.grpc.MethodDescriptor<org.DS.keithproject.SmartHomeGRPC.valRequest, org.DS.keithproject.SmartHomeGRPC.valResponse> getChangeBrightnessMethod;
    if ((getChangeBrightnessMethod = LampServiceGrpc.getChangeBrightnessMethod) == null) {
      synchronized (LampServiceGrpc.class) {
        if ((getChangeBrightnessMethod = LampServiceGrpc.getChangeBrightnessMethod) == null) {
          LampServiceGrpc.getChangeBrightnessMethod = getChangeBrightnessMethod = 
              io.grpc.MethodDescriptor.<org.DS.keithproject.SmartHomeGRPC.valRequest, org.DS.keithproject.SmartHomeGRPC.valResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "SmartHomeGRPC.LampService", "changeBrightness"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.keithproject.SmartHomeGRPC.valRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.keithproject.SmartHomeGRPC.valResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new LampServiceMethodDescriptorSupplier("changeBrightness"))
                  .build();
          }
        }
     }
     return getChangeBrightnessMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.DS.keithproject.SmartHomeGRPC.BooleanReq,
      org.DS.keithproject.SmartHomeGRPC.BooleanRes> getOnOffMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "onOff",
      requestType = org.DS.keithproject.SmartHomeGRPC.BooleanReq.class,
      responseType = org.DS.keithproject.SmartHomeGRPC.BooleanRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.DS.keithproject.SmartHomeGRPC.BooleanReq,
      org.DS.keithproject.SmartHomeGRPC.BooleanRes> getOnOffMethod() {
    io.grpc.MethodDescriptor<org.DS.keithproject.SmartHomeGRPC.BooleanReq, org.DS.keithproject.SmartHomeGRPC.BooleanRes> getOnOffMethod;
    if ((getOnOffMethod = LampServiceGrpc.getOnOffMethod) == null) {
      synchronized (LampServiceGrpc.class) {
        if ((getOnOffMethod = LampServiceGrpc.getOnOffMethod) == null) {
          LampServiceGrpc.getOnOffMethod = getOnOffMethod = 
              io.grpc.MethodDescriptor.<org.DS.keithproject.SmartHomeGRPC.BooleanReq, org.DS.keithproject.SmartHomeGRPC.BooleanRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SmartHomeGRPC.LampService", "onOff"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.keithproject.SmartHomeGRPC.BooleanReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.keithproject.SmartHomeGRPC.BooleanRes.getDefaultInstance()))
                  .setSchemaDescriptor(new LampServiceMethodDescriptorSupplier("onOff"))
                  .build();
          }
        }
     }
     return getOnOffMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.DS.keithproject.SmartHomeGRPC.StringRequest,
      org.DS.keithproject.SmartHomeGRPC.StringResponse> getChangeDeviceNameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "changeDeviceName",
      requestType = org.DS.keithproject.SmartHomeGRPC.StringRequest.class,
      responseType = org.DS.keithproject.SmartHomeGRPC.StringResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.DS.keithproject.SmartHomeGRPC.StringRequest,
      org.DS.keithproject.SmartHomeGRPC.StringResponse> getChangeDeviceNameMethod() {
    io.grpc.MethodDescriptor<org.DS.keithproject.SmartHomeGRPC.StringRequest, org.DS.keithproject.SmartHomeGRPC.StringResponse> getChangeDeviceNameMethod;
    if ((getChangeDeviceNameMethod = LampServiceGrpc.getChangeDeviceNameMethod) == null) {
      synchronized (LampServiceGrpc.class) {
        if ((getChangeDeviceNameMethod = LampServiceGrpc.getChangeDeviceNameMethod) == null) {
          LampServiceGrpc.getChangeDeviceNameMethod = getChangeDeviceNameMethod = 
              io.grpc.MethodDescriptor.<org.DS.keithproject.SmartHomeGRPC.StringRequest, org.DS.keithproject.SmartHomeGRPC.StringResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SmartHomeGRPC.LampService", "changeDeviceName"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.keithproject.SmartHomeGRPC.StringRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.keithproject.SmartHomeGRPC.StringResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new LampServiceMethodDescriptorSupplier("changeDeviceName"))
                  .build();
          }
        }
     }
     return getChangeDeviceNameMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LampServiceStub newStub(io.grpc.Channel channel) {
    return new LampServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LampServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new LampServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LampServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new LampServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class LampServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void changeBrightness(org.DS.keithproject.SmartHomeGRPC.valRequest request,
        io.grpc.stub.StreamObserver<org.DS.keithproject.SmartHomeGRPC.valResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getChangeBrightnessMethod(), responseObserver);
    }

    /**
     */
    public void onOff(org.DS.keithproject.SmartHomeGRPC.BooleanReq request,
        io.grpc.stub.StreamObserver<org.DS.keithproject.SmartHomeGRPC.BooleanRes> responseObserver) {
      asyncUnimplementedUnaryCall(getOnOffMethod(), responseObserver);
    }

    /**
     */
    public void changeDeviceName(org.DS.keithproject.SmartHomeGRPC.StringRequest request,
        io.grpc.stub.StreamObserver<org.DS.keithproject.SmartHomeGRPC.StringResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getChangeDeviceNameMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getChangeBrightnessMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                org.DS.keithproject.SmartHomeGRPC.valRequest,
                org.DS.keithproject.SmartHomeGRPC.valResponse>(
                  this, METHODID_CHANGE_BRIGHTNESS)))
          .addMethod(
            getOnOffMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.DS.keithproject.SmartHomeGRPC.BooleanReq,
                org.DS.keithproject.SmartHomeGRPC.BooleanRes>(
                  this, METHODID_ON_OFF)))
          .addMethod(
            getChangeDeviceNameMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.DS.keithproject.SmartHomeGRPC.StringRequest,
                org.DS.keithproject.SmartHomeGRPC.StringResponse>(
                  this, METHODID_CHANGE_DEVICE_NAME)))
          .build();
    }
  }

  /**
   */
  public static final class LampServiceStub extends io.grpc.stub.AbstractStub<LampServiceStub> {
    private LampServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LampServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LampServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LampServiceStub(channel, callOptions);
    }

    /**
     */
    public void changeBrightness(org.DS.keithproject.SmartHomeGRPC.valRequest request,
        io.grpc.stub.StreamObserver<org.DS.keithproject.SmartHomeGRPC.valResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getChangeBrightnessMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void onOff(org.DS.keithproject.SmartHomeGRPC.BooleanReq request,
        io.grpc.stub.StreamObserver<org.DS.keithproject.SmartHomeGRPC.BooleanRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getOnOffMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void changeDeviceName(org.DS.keithproject.SmartHomeGRPC.StringRequest request,
        io.grpc.stub.StreamObserver<org.DS.keithproject.SmartHomeGRPC.StringResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getChangeDeviceNameMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class LampServiceBlockingStub extends io.grpc.stub.AbstractStub<LampServiceBlockingStub> {
    private LampServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LampServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LampServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LampServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<org.DS.keithproject.SmartHomeGRPC.valResponse> changeBrightness(
        org.DS.keithproject.SmartHomeGRPC.valRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getChangeBrightnessMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.DS.keithproject.SmartHomeGRPC.BooleanRes onOff(org.DS.keithproject.SmartHomeGRPC.BooleanReq request) {
      return blockingUnaryCall(
          getChannel(), getOnOffMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.DS.keithproject.SmartHomeGRPC.StringResponse changeDeviceName(org.DS.keithproject.SmartHomeGRPC.StringRequest request) {
      return blockingUnaryCall(
          getChannel(), getChangeDeviceNameMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class LampServiceFutureStub extends io.grpc.stub.AbstractStub<LampServiceFutureStub> {
    private LampServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LampServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LampServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LampServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.DS.keithproject.SmartHomeGRPC.BooleanRes> onOff(
        org.DS.keithproject.SmartHomeGRPC.BooleanReq request) {
      return futureUnaryCall(
          getChannel().newCall(getOnOffMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.DS.keithproject.SmartHomeGRPC.StringResponse> changeDeviceName(
        org.DS.keithproject.SmartHomeGRPC.StringRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getChangeDeviceNameMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CHANGE_BRIGHTNESS = 0;
  private static final int METHODID_ON_OFF = 1;
  private static final int METHODID_CHANGE_DEVICE_NAME = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final LampServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(LampServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CHANGE_BRIGHTNESS:
          serviceImpl.changeBrightness((org.DS.keithproject.SmartHomeGRPC.valRequest) request,
              (io.grpc.stub.StreamObserver<org.DS.keithproject.SmartHomeGRPC.valResponse>) responseObserver);
          break;
        case METHODID_ON_OFF:
          serviceImpl.onOff((org.DS.keithproject.SmartHomeGRPC.BooleanReq) request,
              (io.grpc.stub.StreamObserver<org.DS.keithproject.SmartHomeGRPC.BooleanRes>) responseObserver);
          break;
        case METHODID_CHANGE_DEVICE_NAME:
          serviceImpl.changeDeviceName((org.DS.keithproject.SmartHomeGRPC.StringRequest) request,
              (io.grpc.stub.StreamObserver<org.DS.keithproject.SmartHomeGRPC.StringResponse>) responseObserver);
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

  private static abstract class LampServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    LampServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.DS.keithproject.SmartHomeGRPC.LampServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("LampService");
    }
  }

  private static final class LampServiceFileDescriptorSupplier
      extends LampServiceBaseDescriptorSupplier {
    LampServiceFileDescriptorSupplier() {}
  }

  private static final class LampServiceMethodDescriptorSupplier
      extends LampServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    LampServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (LampServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new LampServiceFileDescriptorSupplier())
              .addMethod(getChangeBrightnessMethod())
              .addMethod(getOnOffMethod())
              .addMethod(getChangeDeviceNameMethod())
              .build();
        }
      }
    }
    return result;
  }
}
