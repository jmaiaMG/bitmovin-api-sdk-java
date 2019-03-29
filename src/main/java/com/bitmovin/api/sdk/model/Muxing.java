package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.BitmovinResource;
import com.bitmovin.api.sdk.model.EncodingOutput;
import com.bitmovin.api.sdk.model.Ignoring;
import com.bitmovin.api.sdk.model.MuxingStream;
import com.bitmovin.api.sdk.model.StreamConditionsMode;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * Muxing
 */

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = false)
@JsonSubTypes({
  @JsonSubTypes.Type(value = Fmp4Muxing.class, name = "FMP4"),
  @JsonSubTypes.Type(value = Mp4Muxing.class, name = "MP4"),
  @JsonSubTypes.Type(value = TsMuxing.class, name = "TS"),
  @JsonSubTypes.Type(value = WebmMuxing.class, name = "WEBM"),
  @JsonSubTypes.Type(value = Mp3Muxing.class, name = "MP3"),
  @JsonSubTypes.Type(value = ProgressiveWebmMuxing.class, name = "PROGRESSIVE_WEBM"),
  @JsonSubTypes.Type(value = ProgressiveMovMuxing.class, name = "PROGRESSIVE_MOV"),
  @JsonSubTypes.Type(value = ProgressiveTsMuxing.class, name = "PROGRESSIVE_TS"),
  @JsonSubTypes.Type(value = BroadcastTsMuxing.class, name = "BROADCAST_TS"),
})

public class Muxing extends BitmovinResource {
  @JsonProperty("streams")
  private List<MuxingStream> streams = new ArrayList<MuxingStream>();

  @JsonProperty("outputs")
  private List<EncodingOutput> outputs;

  @JsonProperty("avgBitrate")
  private Long avgBitrate;

  @JsonProperty("minBitrate")
  private Long minBitrate;

  @JsonProperty("maxBitrate")
  private Long maxBitrate;

  @JsonProperty("ignoredBy")
  private List<Ignoring> ignoredBy;

  @JsonProperty("streamConditionsMode")
  private StreamConditionsMode streamConditionsMode = null;


  public Muxing addStreamsItem(MuxingStream streamsItem) {
    this.streams.add(streamsItem);
    return this;
  }

  /**
   * Get streams
   * @return streams
   */
  public List<MuxingStream> getStreams() {
    return streams;
  }

  public void setStreams(List<MuxingStream> streams) {
    this.streams = streams;
  }


  public Muxing addOutputsItem(EncodingOutput outputsItem) {
    if (this.outputs == null) {
      this.outputs = new ArrayList<>();
    }
    this.outputs.add(outputsItem);
    return this;
  }

  /**
   * Get outputs
   * @return outputs
   */
  public List<EncodingOutput> getOutputs() {
    return outputs;
  }

  public void setOutputs(List<EncodingOutput> outputs) {
    this.outputs = outputs;
  }

  /**
   * Average bitrate. Available after encoding finishes.
   * @return avgBitrate
   */
  public Long getAvgBitrate() {
    return avgBitrate;
  }

  /**
   * Min bitrate. Available after encoding finishes.
   * @return minBitrate
   */
  public Long getMinBitrate() {
    return minBitrate;
  }

  /**
   * Max bitrate. Available after encoding finishes.
   * @return maxBitrate
   */
  public Long getMaxBitrate() {
    return maxBitrate;
  }

  /**
   * If this is set and contains objects, then this muxing has been ignored during the encoding process
   * @return ignoredBy
   */
  public List<Ignoring> getIgnoredBy() {
    return ignoredBy;
  }


  /**
   * Specifies how to handle streams that don&#39;t fulfill stream conditions
   * @return streamConditionsMode
   */
  public StreamConditionsMode getStreamConditionsMode() {
    return streamConditionsMode;
  }

  public void setStreamConditionsMode(StreamConditionsMode streamConditionsMode) {
    this.streamConditionsMode = streamConditionsMode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Muxing muxing = (Muxing) o;
    return Objects.equals(this.streams, muxing.streams) &&
        Objects.equals(this.outputs, muxing.outputs) &&
        Objects.equals(this.avgBitrate, muxing.avgBitrate) &&
        Objects.equals(this.minBitrate, muxing.minBitrate) &&
        Objects.equals(this.maxBitrate, muxing.maxBitrate) &&
        Objects.equals(this.ignoredBy, muxing.ignoredBy) &&
        Objects.equals(this.streamConditionsMode, muxing.streamConditionsMode) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(streams, outputs, avgBitrate, minBitrate, maxBitrate, ignoredBy, streamConditionsMode, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Muxing {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    streams: ").append(toIndentedString(streams)).append("\n");
    sb.append("    outputs: ").append(toIndentedString(outputs)).append("\n");
    sb.append("    avgBitrate: ").append(toIndentedString(avgBitrate)).append("\n");
    sb.append("    minBitrate: ").append(toIndentedString(minBitrate)).append("\n");
    sb.append("    maxBitrate: ").append(toIndentedString(maxBitrate)).append("\n");
    sb.append("    ignoredBy: ").append(toIndentedString(ignoredBy)).append("\n");
    sb.append("    streamConditionsMode: ").append(toIndentedString(streamConditionsMode)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
