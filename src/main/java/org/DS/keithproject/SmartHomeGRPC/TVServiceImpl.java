// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TV.proto

package org.DS.keithproject.SmartHomeGRPC;

public final class TVServiceImpl {
  private TVServiceImpl() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SmartHomeGRPC_StringRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SmartHomeGRPC_StringRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SmartHomeGRPC_StringResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SmartHomeGRPC_StringResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SmartHomeGRPC_BooleanReq_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SmartHomeGRPC_BooleanReq_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SmartHomeGRPC_BooleanRes_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SmartHomeGRPC_BooleanRes_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SmartHomeGRPC_valRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SmartHomeGRPC_valRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SmartHomeGRPC_valResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SmartHomeGRPC_valResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\010TV.proto\022\rSmartHomeGRPC\"\035\n\rStringReque" +
      "st\022\014\n\004text\030\001 \001(\t\"\036\n\016StringResponse\022\014\n\004te" +
      "xt\030\001 \001(\t\"\031\n\nBooleanReq\022\013\n\003msg\030\002 \001(\010\"\031\n\nB" +
      "ooleanRes\022\013\n\003msg\030\002 \001(\010\"\034\n\nvalRequest\022\016\n\006" +
      "length\030\003 \001(\005\"\035\n\013valResponse\022\016\n\006length\030\003 " +
      "\001(\0052\365\002\n\tTvService\022I\n\014changeVolume\022\031.Smar" +
      "tHomeGRPC.valRequest\032\032.SmartHomeGRPC.val" +
      "Response\"\0000\001\022?\n\004mute\022\031.SmartHomeGRPC.Boo" +
      "leanReq\032\032.SmartHomeGRPC.valResponse\"\000\022?\n" +
      "\005onOff\022\031.SmartHomeGRPC.BooleanReq\032\031.Smar" +
      "tHomeGRPC.BooleanRes\"\000\022Q\n\020changeDeviceNa" +
      "me\022\034.SmartHomeGRPC.StringRequest\032\035.Smart" +
      "HomeGRPC.StringResponse\"\000\022H\n\rchangeChann" +
      "el\022\031.SmartHomeGRPC.valRequest\032\032.SmartHom" +
      "eGRPC.valResponse\"\000B4\n!org.DS.keithproje" +
      "ct.SmartHomeGRPCB\rTVServiceImplP\001b\006proto" +
      "3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_SmartHomeGRPC_StringRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SmartHomeGRPC_StringRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SmartHomeGRPC_StringRequest_descriptor,
        new java.lang.String[] { "Text", });
    internal_static_SmartHomeGRPC_StringResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_SmartHomeGRPC_StringResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SmartHomeGRPC_StringResponse_descriptor,
        new java.lang.String[] { "Text", });
    internal_static_SmartHomeGRPC_BooleanReq_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_SmartHomeGRPC_BooleanReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SmartHomeGRPC_BooleanReq_descriptor,
        new java.lang.String[] { "Msg", });
    internal_static_SmartHomeGRPC_BooleanRes_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_SmartHomeGRPC_BooleanRes_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SmartHomeGRPC_BooleanRes_descriptor,
        new java.lang.String[] { "Msg", });
    internal_static_SmartHomeGRPC_valRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_SmartHomeGRPC_valRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SmartHomeGRPC_valRequest_descriptor,
        new java.lang.String[] { "Length", });
    internal_static_SmartHomeGRPC_valResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_SmartHomeGRPC_valResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SmartHomeGRPC_valResponse_descriptor,
        new java.lang.String[] { "Length", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
