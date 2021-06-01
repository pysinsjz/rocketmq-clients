// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: apache/rocketmq/v1/definition.proto

package apache.rocketmq.v1;

public interface EndpointsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:apache.rocketmq.v1.Endpoints)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.apache.rocketmq.v1.Schema schema = 1;</code>
   * @return The enum numeric value on the wire for schema.
   */
  int getSchemaValue();
  /**
   * <code>.apache.rocketmq.v1.Schema schema = 1;</code>
   * @return The schema.
   */
  apache.rocketmq.v1.Schema getSchema();

  /**
   * <code>repeated .apache.rocketmq.v1.Address addresses = 2;</code>
   */
  java.util.List<apache.rocketmq.v1.Address> 
      getAddressesList();
  /**
   * <code>repeated .apache.rocketmq.v1.Address addresses = 2;</code>
   */
  apache.rocketmq.v1.Address getAddresses(int index);
  /**
   * <code>repeated .apache.rocketmq.v1.Address addresses = 2;</code>
   */
  int getAddressesCount();
  /**
   * <code>repeated .apache.rocketmq.v1.Address addresses = 2;</code>
   */
  java.util.List<? extends apache.rocketmq.v1.AddressOrBuilder> 
      getAddressesOrBuilderList();
  /**
   * <code>repeated .apache.rocketmq.v1.Address addresses = 2;</code>
   */
  apache.rocketmq.v1.AddressOrBuilder getAddressesOrBuilder(
      int index);
}
