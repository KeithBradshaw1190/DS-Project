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
    comments = "Source: TV.proto")
public final class TvServiceGrpc {

  private TvServiceGrpc() {}

  public static final String SERVICE_NAME = "SmartHomeGRPC.TvService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.DS.keithproject.SmartHomeGRPC.Empty,
      org.DS.keithproject.SmartHomeGRPC.tvResp> getInitialDeviceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "initialDevice",
      requestType = org.DS.keithproject.SmartHomeGRPC.Empty.class,
      responseType = org.DS.keithproject.SmartHomeGRPC.tvResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.DS.keithproject.SmartHomeGRPC.Empty,
      org.DS.keithproject.SmartHomeGRPC.tvResp> getInitialDeviceMethod() {
    io.grpc.MethodDescriptor<org.DS.keithproject.SmartHomeGRPC.Empty, org.DS.keithproject.SmartHomeGRPC.tvResp> getInitialDeviceMethod;
    if ((getInitialDeviceMethod = TvServiceGrpc.getInitialDeviceMethod) == null) {
      synchronized (TvServiceGrpc.class) {
        if ((getInitialDeviceMethod = TvServiceGrpc.getInitialDeviceMethod) == null) {
          TvServiceGrpc.getInitialDeviceMethod = getInitialDeviceMethod = 
              io.grpc.MethodDescriptor.<org.DS.keithproject.SmartHomeGRPC.Empty, org.DS.keithproject.SmartHomeGRPC.tvResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SmartHomeGRPC.TvService", "initialDevice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.keithproject.SmartHomeGRPC.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.keithproject.SmartHomeGRPC.tvResp.getDefaultInstance()))
                  .setSchemaDescriptor(new TvServiceMethodDescriptorSupplier("initialDevice"))
                  .build();
          }
        }
     }
     return getInitialDeviceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.DS.keithproject.SmartHomeGRPC.valRequest,
      org.DS.keithproject.SmartHomeGRPC.valResponse> getChangeVolumeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "changeVolume",
      requestType = org.DS.keithproject.SmartHomeGRPC.valRequest.class,
      responseType = org.DS.keithproject.SmartHomeGRPC.valResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<org.DS.keithproject.SmartHomeGRPC.valRequest,
      org.DS.keithproject.SmartHomeGRPC.valResponse> getChangeVolumeMethod() {
    io.grpc.MethodDescriptor<org.DS.keithproject.SmartHomeGRPC.valRequest, org.DS.keithproject.SmartHomeGRPC.valResponse> getChangeVolumeMethod;
    if ((getChangeVolumeMethod = TvServiceGrpc.getChangeVolumeMethod) == null) {
      synchronized (TvServiceGrpc.class) {
        if ((getChangeVolumeMethod = TvServiceGrpc.getChangeVolumeMethod) == null) {
          TvServiceGrpc.getChangeVolumeMethod = getChangeVolumeMethod = 
              io.grpc.MethodDescriptor.<org.DS.keithproject.SmartHomeGRPC.valRequest, org.DS.keithproject.SmartHomeGRPC.valResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "SmartHomeGRPC.TvService", "changeVolume"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.keithproject.SmartHomeGRPC.valRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.keithproject.SmartHomeGRPC.valResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new TvServiceMethodDescriptorSupplier("changeVolume"))
                  .build();
          }
        }
     }
     return getChangeVolumeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.DS.keithproject.SmartHomeGRPC.BooleanReq,
      org.DS.keithproject.SmartHomeGRPC.valResponse> getMuteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "mute",
      requestType = org.DS.keithproject.SmartHomeGRPC.BooleanReq.class,
      responseType = org.DS.keithproject.SmartHomeGRPC.valResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.DS.keithproject.SmartHomeGRPC.BooleanReq,
      org.DS.keithproject.SmartHomeGRPC.valResponse> getMuteMethod() {
    io.grpc.MethodDescriptor<org.DS.keithproject.SmartHomeGRPC.BooleanReq, org.DS.keithproject.SmartHomeGRPC.valResponse> getMuteMethod;
    if ((getMuteMethod = TvServiceGrpc.getMuteMethod) == null) {
      synchronized (TvServiceGrpc.class) {
        if ((getMuteMethod = TvServiceGrpc.getMuteMethod) == null) {
          TvServiceGrpc.getMuteMethod = getMuteMethod = 
              io.grpc.MethodDescriptor.<org.DS.keithproject.SmartHomeGRPC.BooleanReq, org.DS.keithproject.SmartHomeGRPC.valResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SmartHomeGRPC.TvService", "mute"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.keithproject.SmartHomeGRPC.BooleanReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.keithproject.SmartHomeGRPC.valResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new TvServiceMethodDescriptorSupplier("mute"))
                  .build();
          }
        }
     }
     return getMuteMethod;
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
    if ((getOnOffMethod = TvServiceGrpc.getOnOffMethod) == null) {
      synchronized (TvServiceGrpc.class) {
        if ((getOnOffMethod = TvServiceGrpc.getOnOffMethod) == null) {
          TvServiceGrpc.getOnOffMethod = getOnOffMethod = 
              io.grpc.MethodDescriptor.<org.DS.keithproject.SmartHomeGRPC.BooleanReq, org.DS.keithproject.SmartHomeGRPC.BooleanRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SmartHomeGRPC.TvService", "onOff"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.keithproject.SmartHomeGRPC.BooleanReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.keithproject.SmartHomeGRPC.BooleanRes.getDefaultInstance()))
                  .setSchemaDescriptor(new TvServiceMethodDescriptorSupplier("onOff"))
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
    if ((getChangeDeviceNameMethod = TvServiceGrpc.getChangeDeviceNameMethod) == null) {
      synchronized (TvServiceGrpc.class) {
        if ((getChangeDeviceNameMethod = TvServiceGrpc.getChangeDeviceNameMethod) == null) {
          TvServiceGrpc.getChangeDeviceNameMethod = getChangeDeviceNameMethod = 
              io.grpc.MethodDescriptor.<org.DS.keithproject.SmartHomeGRPC.StringRequest, org.DS.keithproject.SmartHomeGRPC.StringResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SmartHomeGRPC.TvService", "changeDeviceName"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.keithproject.SmartHomeGRPC.StringRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.keithproject.SmartHomeGRPC.StringResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new TvServiceMethodDescriptorSupplier("changeDeviceName"))
                  .build();
          }
        }
     }
     return getChangeDeviceNameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.DS.keithproject.SmartHomeGRPC.valRequest,
      org.DS.keithproject.SmartHomeGRPC.valResponse> getChangeChannelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "changeChannel",
      requestType = org.DS.keithproject.SmartHomeGRPC.valRequest.class,
      responseType = org.DS.keithproject.SmartHomeGRPC.valResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.DS.keithproject.SmartHomeGRPC.valRequest,
      org.DS.keithproject.SmartHomeGRPC.valResponse> getChangeChannelMethod() {
    io.grpc.MethodDescriptor<org.DS.keithproject.SmartHomeGRPC.valRequest, org.DS.keithproject.SmartHomeGRPC.valResponse> getChangeChannelMethod;
    if ((getChangeChannelMethod = TvServiceGrpc.getChangeChannelMethod) == null) {
      synchronized (TvServiceGrpc.class) {
        if ((getChangeChannelMethod = TvServiceGrpc.getChangeChannelMethod) == null) {
          TvServiceGrpc.getChangeChannelMethod = getChangeChannelMethod = 
              io.grpc.MethodDescriptor.<org.DS.keithproject.SmartHomeGRPC.valRequest, org.DS.keithproject.SmartHomeGRPC.valResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SmartHomeGRPC.TvService", "changeChannel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.keithproject.SmartHomeGRPC.valRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.keithproject.SmartHomeGRPC.valResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new TvServiceMethodDescriptorSupplier("changeChannel"))
                  .build();
          }
        }
     }
     return getChangeChannelMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TvServiceStub newStub(io.grpc.Channel channel) {
    return new TvServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TvServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new TvServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TvServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new TvServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class TvServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void initialDevice(org.DS.keithproject.SmartHomeGRPC.Empty request,
        io.grpc.stub.StreamObserver<org.DS.keithproject.SmartHomeGRPC.tvResp> responseObserver) {
      asyncUnimplementedUnaryCall(getInitialDeviceMethod(), responseObserver);
    }

    /**
     */
    public void changeVolume(org.DS.keithproject.SmartHomeGRPC.valRequest request,
        io.grpc.stub.StreamObserver<org.DS.keithproject.SmartHomeGRPC.valResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getChangeVolumeMethod(), responseObserver);
    }

    /**
     */
    public void mute(org.DS.keithproject.SmartHomeGRPC.BooleanReq request,
        io.grpc.stub.StreamObserver<org.DS.keithproject.SmartHomeGRPC.valResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMuteMethod(), responseObserver);
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

    /**
     */
    public void changeChannel(org.DS.keithproject.SmartHomeGRPC.valRequest request,
        io.grpc.stub.StreamObserver<org.DS.keithproject.SmartHomeGRPC.valResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getChangeChannelMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getInitialDeviceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.DS.keithproject.SmartHomeGRPC.Empty,
                org.DS.keithproject.SmartHomeGRPC.tvResp>(
                  this, METHODID_INITIAL_DEVICE)))
          .addMethod(
            getChangeVolumeMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                org.DS.keithproject.SmartHomeGRPC.valRequest,
                org.DS.keithproject.SmartHomeGRPC.valResponse>(
                  this, METHODID_CHANGE_VOLUME)))
          .addMethod(
            getMuteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.DS.keithproject.SmartHomeGRPC.BooleanReq,
                org.DS.keithproject.SmartHomeGRPC.valResponse>(
                  this, METHODID_MUTE)))
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
          .addMethod(
            getChangeChannelMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.DS.keithproject.SmartHomeGRPC.valRequest,
                org.DS.keithproject.SmartHomeGRPC.valResponse>(
                  this, METHODID_CHANGE_CHANNEL)))
          .build();
    }
  }

  /**
   */
  public static final class TvServiceStub extends io.grpc.stub.AbstractStub<TvServiceStub> {
    private TvServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TvServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TvServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TvServiceStub(channel, callOptions);
    }

    /**
     */
    public void initialDevice(org.DS.keithproject.SmartHomeGRPC.Empty request,
        io.grpc.stub.StreamObserver<org.DS.keithproject.SmartHomeGRPC.tvResp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getInitialDeviceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void changeVolume(org.DS.keithproject.SmartHomeGRPC.valRequest request,
        io.grpc.stub.StreamObserver<org.DS.keithproject.SmartHomeGRPC.valResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getChangeVolumeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void mute(org.DS.keithproject.SmartHomeGRPC.BooleanReq request,
        io.grpc.stub.StreamObserver<org.DS.keithproject.SmartHomeGRPC.valResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMuteMethod(), getCallOptions()), request, responseObserver);
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

    /**
     */
    public void changeChannel(org.DS.keithproject.SmartHomeGRPC.valRequest request,
        io.grpc.stub.StreamObserver<org.DS.keithproject.SmartHomeGRPC.valResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getChangeChannelMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class TvServiceBlockingStub extends io.grpc.stub.AbstractStub<TvServiceBlockingStub> {
    private TvServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TvServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TvServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TvServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.DS.keithproject.SmartHomeGRPC.tvResp initialDevice(org.DS.keithproject.SmartHomeGRPC.Empty request) {
      return blockingUnaryCall(
          getChannel(), getInitialDeviceMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<org.DS.keithproject.SmartHomeGRPC.valResponse> changeVolume(
        org.DS.keithproject.SmartHomeGRPC.valRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getChangeVolumeMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.DS.keithproject.SmartHomeGRPC.valResponse mute(org.DS.keithproject.SmartHomeGRPC.BooleanReq request) {
      return blockingUnaryCall(
          getChannel(), getMuteMethod(), getCallOptions(), request);
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

    /**
     */
    public org.DS.keithproject.SmartHomeGRPC.valResponse changeChannel(org.DS.keithproject.SmartHomeGRPC.valRequest request) {
      return blockingUnaryCall(
          getChannel(), getChangeChannelMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class TvServiceFutureStub extends io.grpc.stub.AbstractStub<TvServiceFutureStub> {
    private TvServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TvServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TvServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TvServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.DS.keithproject.SmartHomeGRPC.tvResp> initialDevice(
        org.DS.keithproject.SmartHomeGRPC.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getInitialDeviceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.DS.keithproject.SmartHomeGRPC.valResponse> mute(
        org.DS.keithproject.SmartHomeGRPC.BooleanReq request) {
      return futureUnaryCall(
          getChannel().newCall(getMuteMethod(), getCallOptions()), request);
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

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.DS.keithproject.SmartHomeGRPC.valResponse> changeChannel(
        org.DS.keithproject.SmartHomeGRPC.valRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getChangeChannelMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_INITIAL_DEVICE = 0;
  private static final int METHODID_CHANGE_VOLUME = 1;
  private static final int METHODID_MUTE = 2;
  private static final int METHODID_ON_OFF = 3;
  private static final int METHODID_CHANGE_DEVICE_NAME = 4;
  private static final int METHODID_CHANGE_CHANNEL = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TvServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TvServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_INITIAL_DEVICE:
          serviceImpl.initialDevice((org.DS.keithproject.SmartHomeGRPC.Empty) request,
              (io.grpc.stub.StreamObserver<org.DS.keithproject.SmartHomeGRPC.tvResp>) responseObserver);
          break;
        case METHODID_CHANGE_VOLUME:
          serviceImpl.changeVolume((org.DS.keithproject.SmartHomeGRPC.valRequest) request,
              (io.grpc.stub.StreamObserver<org.DS.keithproject.SmartHomeGRPC.valResponse>) responseObserver);
          break;
        case METHODID_MUTE:
          serviceImpl.mute((org.DS.keithproject.SmartHomeGRPC.BooleanReq) request,
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
        case METHODID_CHANGE_CHANNEL:
          serviceImpl.changeChannel((org.DS.keithproject.SmartHomeGRPC.valRequest) request,
              (io.grpc.stub.StreamObserver<org.DS.keithproject.SmartHomeGRPC.valResponse>) responseObserver);
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

  private static abstract class TvServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TvServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.DS.keithproject.SmartHomeGRPC.TVServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TvService");
    }
  }

  private static final class TvServiceFileDescriptorSupplier
      extends TvServiceBaseDescriptorSupplier {
    TvServiceFileDescriptorSupplier() {}
  }

  private static final class TvServiceMethodDescriptorSupplier
      extends TvServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TvServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (TvServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TvServiceFileDescriptorSupplier())
              .addMethod(getInitialDeviceMethod())
              .addMethod(getChangeVolumeMethod())
              .addMethod(getMuteMethod())
              .addMethod(getOnOffMethod())
              .addMethod(getChangeDeviceNameMethod())
              .addMethod(getChangeChannelMethod())
              .build();
        }
      }
    }
    return result;
  }
}
