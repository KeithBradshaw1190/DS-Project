// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TV.proto

package org.DS.keithproject.SmartHomeGRPC;

public interface tvRespOrBuilder extends
    // @@protoc_insertion_point(interface_extends:SmartHomeGRPC.tvResp)
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
   * <code>int32 channel = 7;</code>
   */
  int getChannel();
}