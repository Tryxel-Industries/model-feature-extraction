// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/news_dataset_semantic_features.proto

package no.tryxelindustries.java_feature_gen.entitys.protos;

public interface DatasetSemanticFeaturesOrBuilder extends
    // @@protoc_insertion_point(interface_extends:java_feature_gen.DatasetSemanticFeatures)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string dataset_name = 1;</code>
   * @return The datasetName.
   */
  java.lang.String getDatasetName();
  /**
   * <code>string dataset_name = 1;</code>
   * @return The bytes for datasetName.
   */
  com.google.protobuf.ByteString
      getDatasetNameBytes();

  /**
   * <code>repeated .java_feature_gen.NewsEntrySemanticFeatures news_entries = 2;</code>
   */
  java.util.List<no.tryxelindustries.java_feature_gen.entitys.protos.NewsEntrySemanticFeatures> 
      getNewsEntriesList();
  /**
   * <code>repeated .java_feature_gen.NewsEntrySemanticFeatures news_entries = 2;</code>
   */
  no.tryxelindustries.java_feature_gen.entitys.protos.NewsEntrySemanticFeatures getNewsEntries(int index);
  /**
   * <code>repeated .java_feature_gen.NewsEntrySemanticFeatures news_entries = 2;</code>
   */
  int getNewsEntriesCount();
  /**
   * <code>repeated .java_feature_gen.NewsEntrySemanticFeatures news_entries = 2;</code>
   */
  java.util.List<? extends no.tryxelindustries.java_feature_gen.entitys.protos.NewsEntrySemanticFeaturesOrBuilder> 
      getNewsEntriesOrBuilderList();
  /**
   * <code>repeated .java_feature_gen.NewsEntrySemanticFeatures news_entries = 2;</code>
   */
  no.tryxelindustries.java_feature_gen.entitys.protos.NewsEntrySemanticFeaturesOrBuilder getNewsEntriesOrBuilder(
      int index);
}