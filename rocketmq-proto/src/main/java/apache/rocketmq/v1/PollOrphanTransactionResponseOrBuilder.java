// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: apache/rocketmq/v1/service.proto

package apache.rocketmq.v1;

public interface PollOrphanTransactionResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:apache.rocketmq.v1.PollOrphanTransactionResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.apache.rocketmq.v1.ResponseCommon common = 1;</code>
   * @return Whether the common field is set.
   */
  boolean hasCommon();
  /**
   * <code>.apache.rocketmq.v1.ResponseCommon common = 1;</code>
   * @return The common.
   */
  apache.rocketmq.v1.ResponseCommon getCommon();
  /**
   * <code>.apache.rocketmq.v1.ResponseCommon common = 1;</code>
   */
  apache.rocketmq.v1.ResponseCommonOrBuilder getCommonOrBuilder();

  /**
   * <code>repeated .apache.rocketmq.v1.Message orphan_transactions = 2;</code>
   */
  java.util.List<apache.rocketmq.v1.Message> 
      getOrphanTransactionsList();
  /**
   * <code>repeated .apache.rocketmq.v1.Message orphan_transactions = 2;</code>
   */
  apache.rocketmq.v1.Message getOrphanTransactions(int index);
  /**
   * <code>repeated .apache.rocketmq.v1.Message orphan_transactions = 2;</code>
   */
  int getOrphanTransactionsCount();
  /**
   * <code>repeated .apache.rocketmq.v1.Message orphan_transactions = 2;</code>
   */
  java.util.List<? extends apache.rocketmq.v1.MessageOrBuilder> 
      getOrphanTransactionsOrBuilderList();
  /**
   * <code>repeated .apache.rocketmq.v1.Message orphan_transactions = 2;</code>
   */
  apache.rocketmq.v1.MessageOrBuilder getOrphanTransactionsOrBuilder(
      int index);
}
