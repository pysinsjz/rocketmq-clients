// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: apache/rocketmq/v1/service.proto

package apache.rocketmq.v1;

public interface QueryOffsetRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:apache.rocketmq.v1.QueryOffsetRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.apache.rocketmq.v1.Partition partition = 1;</code>
   * @return Whether the partition field is set.
   */
  boolean hasPartition();
  /**
   * <code>.apache.rocketmq.v1.Partition partition = 1;</code>
   * @return The partition.
   */
  apache.rocketmq.v1.Partition getPartition();
  /**
   * <code>.apache.rocketmq.v1.Partition partition = 1;</code>
   */
  apache.rocketmq.v1.PartitionOrBuilder getPartitionOrBuilder();

  /**
   * <code>.apache.rocketmq.v1.Resource group = 2;</code>
   * @return Whether the group field is set.
   */
  boolean hasGroup();
  /**
   * <code>.apache.rocketmq.v1.Resource group = 2;</code>
   * @return The group.
   */
  apache.rocketmq.v1.Resource getGroup();
  /**
   * <code>.apache.rocketmq.v1.Resource group = 2;</code>
   */
  apache.rocketmq.v1.ResourceOrBuilder getGroupOrBuilder();

  /**
   * <code>.apache.rocketmq.v1.OffsetPolicy policy = 3;</code>
   * @return The enum numeric value on the wire for policy.
   */
  int getPolicyValue();
  /**
   * <code>.apache.rocketmq.v1.OffsetPolicy policy = 3;</code>
   * @return The policy.
   */
  apache.rocketmq.v1.OffsetPolicy getPolicy();
}
