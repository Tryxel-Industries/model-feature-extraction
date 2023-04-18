// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/news_dataset_sentences.proto

package no.tryxelindustries.java_feature_gen.entitys.protos;

public interface NewsEntrySentencesOrBuilder extends
    // @@protoc_insertion_point(interface_extends:java_feature_gen.NewsEntrySentences)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 id = 1;</code>
   * @return The id.
   */
  int getId();

  /**
   * <code>int64 publish_date = 2;</code>
   * @return The publishDate.
   */
  long getPublishDate();

  /**
   * <code>string label = 4;</code>
   * @return The label.
   */
  java.lang.String getLabel();
  /**
   * <code>string label = 4;</code>
   * @return The bytes for label.
   */
  com.google.protobuf.ByteString
      getLabelBytes();

  /**
   * <code>repeated string sentences = 5;</code>
   * @return A list containing the sentences.
   */
  java.util.List<java.lang.String>
      getSentencesList();
  /**
   * <code>repeated string sentences = 5;</code>
   * @return The count of sentences.
   */
  int getSentencesCount();
  /**
   * <code>repeated string sentences = 5;</code>
   * @param index The index of the element to return.
   * @return The sentences at the given index.
   */
  java.lang.String getSentences(int index);
  /**
   * <code>repeated string sentences = 5;</code>
   * @param index The index of the value to return.
   * @return The bytes of the sentences at the given index.
   */
  com.google.protobuf.ByteString
      getSentencesBytes(int index);
}