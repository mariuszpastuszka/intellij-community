// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: processMediator.proto

package com.intellij.execution.process.mediator.common.rpc;

public interface WriteStreamRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:intellij.process.mediator.common.rpc.WriteStreamRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.intellij.process.mediator.common.rpc.FileHandle handle = 1;</code>
   * @return Whether the handle field is set.
   */
  boolean hasHandle();
  /**
   * <code>.intellij.process.mediator.common.rpc.FileHandle handle = 1;</code>
   * @return The handle.
   */
  com.intellij.execution.process.mediator.common.rpc.FileHandle getHandle();
  /**
   * <code>.intellij.process.mediator.common.rpc.FileHandle handle = 1;</code>
   */
  com.intellij.execution.process.mediator.common.rpc.FileHandleOrBuilder getHandleOrBuilder();

  /**
   * <code>.intellij.process.mediator.common.rpc.DataChunk chunk = 2;</code>
   * @return Whether the chunk field is set.
   */
  boolean hasChunk();
  /**
   * <code>.intellij.process.mediator.common.rpc.DataChunk chunk = 2;</code>
   * @return The chunk.
   */
  com.intellij.execution.process.mediator.common.rpc.DataChunk getChunk();
  /**
   * <code>.intellij.process.mediator.common.rpc.DataChunk chunk = 2;</code>
   */
  com.intellij.execution.process.mediator.common.rpc.DataChunkOrBuilder getChunkOrBuilder();

  com.intellij.execution.process.mediator.common.rpc.WriteStreamRequest.FileHandleOrBufferCase getFileHandleOrBufferCase();
}
