// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Speaker.proto

package org.DS.keithproject.SmartHomeGRPC;

public interface speakerRespOrBuilder extends
    // @@protoc_insertion_point(interface_extends:SmartHomeGRPC.speakerResp)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string dname = 4;</code>
   */
  java.lang.String getDname();
  /**
   * <code>string dname = 4;</code>
   */
  com.google.protobuf.ByteString
      getDnameBytes();

  /**
   * <code>string status = 5;</code>
   */
  java.lang.String getStatus();
  /**
   * <code>string status = 5;</code>
   */
  com.google.protobuf.ByteString
      getStatusBytes();

  /**
   * <code>int32 volume = 6;</code>
   */
  int getVolume();

  /**
   * <code>bool muted = 7;</code>
   */
  boolean getMuted();
}