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
    comments = "Source: Chromecast.proto")
public final class ChromecastServiceGrpc {

  private ChromecastServiceGrpc() {}

  public static final String SERVICE_NAME = "SmartHomeGRPC.ChromecastService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.DS.keithproject.SmartHomeGRPC.Empty,
      org.DS.keithproject.SmartHomeGRPC.ccResp> getInitialDeviceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "initialDevice",
      requestType = org.DS.keithproject.SmartHomeGRPC.Empty.class,
      responseType = org.DS.keithproject.SmartHomeGRPC.ccResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.DS.keithproject.SmartHomeGRPC.Empty,
      org.DS.keithproject.SmartHomeGRPC.ccResp> getInitialDeviceMethod() {
    io.grpc.MethodDescriptor<org.DS.keithproject.SmartHomeGRPC.Empty, org.DS.keithproject.SmartHomeGRPC.ccResp> getInitialDeviceMethod;
    if ((getInitialDeviceMethod = ChromecastServiceGrpc.getInitialDeviceMethod) == null) {
      synchronized (ChromecastServiceGrpc.class) {
        if ((getInitialDeviceMethod = ChromecastServiceGrpc.getInitialDeviceMethod) == null) {
          ChromecastServiceGrpc.getInitialDeviceMethod = getInitialDeviceMethod = 
              io.grpc.MethodDescriptor.<org.DS.keithproject.SmartHomeGRPC.Empty, org.DS.keithproject.SmartHomeGRPC.ccResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SmartHomeGRPC.ChromecastService", "initialDevice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.keithproject.SmartHomeGRPC.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.keithproject.SmartHomeGRPC.ccResp.getDefaultInstance()))
                  .setSchemaDescriptor(new ChromecastServiceMethodDescriptorSupplier("initialDevice"))
                  .build();
          }
        }
     }
     return getInitialDeviceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.DS.keithproject.SmartHomeGRPC.StringRequest,
      org.DS.keithproject.SmartHomeGRPC.StringResponse> getChangeApplicationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "changeApplication",
      requestType = org.DS.keithproject.SmartHomeGRPC.StringRequest.class,
      responseType = org.DS.keithproject.SmartHomeGRPC.StringResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.DS.keithproject.SmartHomeGRPC.StringRequest,
      org.DS.keithproject.SmartHomeGRPC.StringResponse> getChangeApplicationMethod() {
    io.grpc.MethodDescriptor<org.DS.keithproject.SmartHomeGRPC.StringRequest, org.DS.keithproject.SmartHomeGRPC.StringResponse> getChangeApplicationMethod;
    if ((getChangeApplicationMethod = ChromecastServiceGrpc.getChangeApplicationMethod) == null) {
      synchronized (ChromecastServiceGrpc.class) {
        if ((getChangeApplicationMethod = ChromecastServiceGrpc.getChangeApplicationMethod) == null) {
          ChromecastServiceGrpc.getChangeApplicationMethod = getChangeApplicationMethod = 
              io.grpc.MethodDescriptor.<org.DS.keithproject.SmartHomeGRPC.StringRequest, org.DS.keithproject.SmartHomeGRPC.StringResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SmartHomeGRPC.ChromecastService", "changeApplication"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.keithproject.SmartHomeGRPC.StringRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.keithproject.SmartHomeGRPC.StringResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ChromecastServiceMethodDescriptorSupplier("changeApplication"))
                  .build();
          }
        }
     }
     return getChangeApplicationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.DS.keithproject.SmartHomeGRPC.valRequest,
      org.DS.keithproject.SmartHomeGRPC.valResponse> getChangeVolumeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "changeVolume",
      requestType = org.DS.keithproject.SmartHomeGRPC.valRequest.class,
      responseType = org.DS.keithproject.SmartHomeGRPC.valResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.DS.keithproject.SmartHomeGRPC.valRequest,
      org.DS.keithproject.SmartHomeGRPC.valResponse> getChangeVolumeMethod() {
    io.grpc.MethodDescriptor<org.DS.keithproject.SmartHomeGRPC.valRequest, org.DS.keithproject.SmartHomeGRPC.valResponse> getChangeVolumeMethod;
    if ((getChangeVolumeMethod = ChromecastServiceGrpc.getChangeVolumeMethod) == null) {
      synchronized (ChromecastServiceGrpc.class) {
        if ((getChangeVolumeMethod = ChromecastServiceGrpc.getChangeVolumeMethod) == null) {
          ChromecastServiceGrpc.getChangeVolumeMethod = getChangeVolumeMethod = 
              io.grpc.MethodDescriptor.<org.DS.keithproject.SmartHomeGRPC.valRequest, org.DS.keithproject.SmartHomeGRPC.valResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SmartHomeGRPC.ChromecastService", "changeVolume"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.keithproject.SmartHomeGRPC.valRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.keithproject.SmartHomeGRPC.valResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ChromecastServiceMethodDescriptorSupplier("changeVolume"))
                  .build();
          }
        }
     }
     return getChangeVolumeMethod;
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
    if ((getOnOffMethod = ChromecastServiceGrpc.getOnOffMethod) == null) {
      synchronized (ChromecastServiceGrpc.class) {
        if ((getOnOffMethod = ChromecastServiceGrpc.getOnOffMethod) == null) {
          ChromecastServiceGrpc.getOnOffMethod = getOnOffMethod = 
              io.grpc.MethodDescriptor.<org.DS.keithproject.SmartHomeGRPC.BooleanReq, org.DS.keithproject.SmartHomeGRPC.BooleanRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SmartHomeGRPC.ChromecastService", "onOff"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.keithproject.SmartHomeGRPC.BooleanReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.keithproject.SmartHomeGRPC.BooleanRes.getDefaultInstance()))
                  .setSchemaDescriptor(new ChromecastServiceMethodDescriptorSupplier("onOff"))
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
    if ((getChangeDeviceNameMethod = ChromecastServiceGrpc.getChangeDeviceNameMethod) == null) {
      synchronized (ChromecastServiceGrpc.class) {
        if ((getChangeDeviceNameMethod = ChromecastServiceGrpc.getChangeDeviceNameMethod) == null) {
          ChromecastServiceGrpc.getChangeDeviceNameMethod = getChangeDeviceNameMethod = 
              io.grpc.MethodDescriptor.<org.DS.keithproject.SmartHomeGRPC.StringRequest, org.DS.keithproject.SmartHomeGRPC.StringResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SmartHomeGRPC.ChromecastService", "changeDeviceName"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.keithproject.SmartHomeGRPC.StringRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.keithproject.SmartHomeGRPC.StringResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ChromecastServiceMethodDescriptorSupplier("changeDeviceName"))
                  .build();
          }
        }
     }
     return getChangeDeviceNameMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ChromecastServiceStub newStub(io.grpc.Channel channel) {
    return new ChromecastServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ChromecastServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ChromecastServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ChromecastServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ChromecastServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ChromecastServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void initialDevice(org.DS.keithproject.SmartHomeGRPC.Empty request,
        io.grpc.stub.StreamObserver<org.DS.keithproject.SmartHomeGRPC.ccResp> responseObserver) {
      asyncUnimplementedUnaryCall(getInitialDeviceMethod(), responseObserver);
    }

    /**
     */
    public void changeApplication(org.DS.keithproject.SmartHomeGRPC.StringRequest request,
        io.grpc.stub.StreamObserver<org.DS.keithproject.SmartHomeGRPC.StringResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getChangeApplicationMethod(), responseObserver);
    }

    /**
     */
    public void changeVolume(org.DS.keithproject.SmartHomeGRPC.valRequest request,
        io.grpc.stub.StreamObserver<org.DS.keithproject.SmartHomeGRPC.valResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getChangeVolumeMethod(), responseObserver);
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
            getInitialDeviceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.DS.keithproject.SmartHomeGRPC.Empty,
                org.DS.keithproject.SmartHomeGRPC.ccResp>(
                  this, METHODID_INITIAL_DEVICE)))
          .addMethod(
            getChangeApplicationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.DS.keithproject.SmartHomeGRPC.StringRequest,
                org.DS.keithproject.SmartHomeGRPC.StringResponse>(
                  this, METHODID_CHANGE_APPLICATION)))
          .addMethod(
            getChangeVolumeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.DS.keithproject.SmartHomeGRPC.valRequest,
                org.DS.keithproject.SmartHomeGRPC.valResponse>(
                  this, METHODID_CHANGE_VOLUME)))
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
  public static final class ChromecastServiceStub extends io.grpc.stub.AbstractStub<ChromecastServiceStub> {
    private ChromecastServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ChromecastServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ChromecastServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ChromecastServiceStub(channel, callOptions);
    }

    /**
     */
    public void initialDevice(org.DS.keithproject.SmartHomeGRPC.Empty request,
        io.grpc.stub.StreamObserver<org.DS.keithproject.SmartHomeGRPC.ccResp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getInitialDeviceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void changeApplication(org.DS.keithproject.SmartHomeGRPC.StringRequest request,
        io.grpc.stub.StreamObserver<org.DS.keithproject.SmartHomeGRPC.StringResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getChangeApplicationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void changeVolume(org.DS.keithproject.SmartHomeGRPC.valRequest request,
        io.grpc.stub.StreamObserver<org.DS.keithproject.SmartHomeGRPC.valResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getChangeVolumeMethod(), getCallOptions()), request, responseObserver);
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
  public static final class ChromecastServiceBlockingStub extends io.grpc.stub.AbstractStub<ChromecastServiceBlockingStub> {
    private ChromecastServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ChromecastServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ChromecastServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ChromecastServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.DS.keithproject.SmartHomeGRPC.ccResp initialDevice(org.DS.keithproject.SmartHomeGRPC.Empty request) {
      return blockingUnaryCall(
          getChannel(), getInitialDeviceMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.DS.keithproject.SmartHomeGRPC.StringResponse changeApplication(org.DS.keithproject.SmartHomeGRPC.StringRequest request) {
      return blockingUnaryCall(
          getChannel(), getChangeApplicationMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.DS.keithproject.SmartHomeGRPC.valResponse changeVolume(org.DS.keithproject.SmartHomeGRPC.valRequest request) {
      return blockingUnaryCall(
          getChannel(), getChangeVolumeMethod(), getCallOptions(), request);
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
  public static final class ChromecastServiceFutureStub extends io.grpc.stub.AbstractStub<ChromecastServiceFutureStub> {
    private ChromecastServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ChromecastServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ChromecastServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ChromecastServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.DS.keithproject.SmartHomeGRPC.ccResp> initialDevice(
        org.DS.keithproject.SmartHomeGRPC.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getInitialDeviceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.DS.keithproject.SmartHomeGRPC.StringResponse> changeApplication(
        org.DS.keithproject.SmartHomeGRPC.StringRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getChangeApplicationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.DS.keithproject.SmartHomeGRPC.valResponse> changeVolume(
        org.DS.keithproject.SmartHomeGRPC.valRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getChangeVolumeMethod(), getCallOptions()), request);
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

  private static final int METHODID_INITIAL_DEVICE = 0;
  private static final int METHODID_CHANGE_APPLICATION = 1;
  private static final int METHODID_CHANGE_VOLUME = 2;
  private static final int METHODID_ON_OFF = 3;
  private static final int METHODID_CHANGE_DEVICE_NAME = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ChromecastServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ChromecastServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_INITIAL_DEVICE:
          serviceImpl.initialDevice((org.DS.keithproject.SmartHomeGRPC.Empty) request,
              (io.grpc.stub.StreamObserver<org.DS.keithproject.SmartHomeGRPC.ccResp>) responseObserver);
          break;
        case METHODID_CHANGE_APPLICATION:
          serviceImpl.changeApplication((org.DS.keithproject.SmartHomeGRPC.StringRequest) request,
              (io.grpc.stub.StreamObserver<org.DS.keithproject.SmartHomeGRPC.StringResponse>) responseObserver);
          break;
        case METHODID_CHANGE_VOLUME:
          serviceImpl.changeVolume((org.DS.keithproject.SmartHomeGRPC.valRequest) request,
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

  private static abstract class ChromecastServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ChromecastServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.DS.keithproject.SmartHomeGRPC.ChromecastServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ChromecastService");
    }
  }

  private static final class ChromecastServiceFileDescriptorSupplier
      extends ChromecastServiceBaseDescriptorSupplier {
    ChromecastServiceFileDescriptorSupplier() {}
  }

  private static final class ChromecastServiceMethodDescriptorSupplier
      extends ChromecastServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ChromecastServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ChromecastServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ChromecastServiceFileDescriptorSupplier())
              .addMethod(getInitialDeviceMethod())
              .addMethod(getChangeApplicationMethod())
              .addMethod(getChangeVolumeMethod())
              .addMethod(getOnOffMethod())
              .addMethod(getChangeDeviceNameMethod())
              .build();
        }
      }
    }
    return result;
  }
}
