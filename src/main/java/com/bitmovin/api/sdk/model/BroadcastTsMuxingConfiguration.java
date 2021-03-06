package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.BroadcastTsAudioInputStreamConfiguration;
import com.bitmovin.api.sdk.model.BroadcastTsProgramConfiguration;
import com.bitmovin.api.sdk.model.BroadcastTsTransportConfiguration;
import com.bitmovin.api.sdk.model.BroadcastTsVideoInputStreamConfiguration;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * BroadcastTsMuxingConfiguration
 */

public class BroadcastTsMuxingConfiguration {
  @JsonProperty("transport")
  private BroadcastTsTransportConfiguration transport;

  @JsonProperty("program")
  private BroadcastTsProgramConfiguration program;

  @JsonProperty("videoStreams")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<BroadcastTsVideoInputStreamConfiguration> videoStreams = new ArrayList<BroadcastTsVideoInputStreamConfiguration>();

  @JsonProperty("audioStreams")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<BroadcastTsAudioInputStreamConfiguration> audioStreams = new ArrayList<BroadcastTsAudioInputStreamConfiguration>();


  /**
   * Transport configuration details for the Broadcast TS muxing.
   * @return transport
   */
  public BroadcastTsTransportConfiguration getTransport() {
    return transport;
  }

  /**
   * Transport configuration details for the Broadcast TS muxing.
   *
   * @param transport
   *        Transport configuration details for the Broadcast TS muxing.
   */
  public void setTransport(BroadcastTsTransportConfiguration transport) {
    this.transport = transport;
  }


  /**
   * Program configuration details for the Broadcast TS muxing.
   * @return program
   */
  public BroadcastTsProgramConfiguration getProgram() {
    return program;
  }

  /**
   * Program configuration details for the Broadcast TS muxing.
   *
   * @param program
   *        Program configuration details for the Broadcast TS muxing.
   */
  public void setProgram(BroadcastTsProgramConfiguration program) {
    this.program = program;
  }


  public BroadcastTsMuxingConfiguration addVideoStreamsItem(BroadcastTsVideoInputStreamConfiguration videoStreamsItem) {
    this.videoStreams.add(videoStreamsItem);
    return this;
  }

  /**
   * Get videoStreams
   * @return videoStreams
   */
  public List<BroadcastTsVideoInputStreamConfiguration> getVideoStreams() {
    return videoStreams;
  }

  /**
   * Set videoStreams
   *
   * @param videoStreams
   */
  public void setVideoStreams(List<BroadcastTsVideoInputStreamConfiguration> videoStreams) {
    this.videoStreams = videoStreams;
  }


  public BroadcastTsMuxingConfiguration addAudioStreamsItem(BroadcastTsAudioInputStreamConfiguration audioStreamsItem) {
    this.audioStreams.add(audioStreamsItem);
    return this;
  }

  /**
   * Get audioStreams
   * @return audioStreams
   */
  public List<BroadcastTsAudioInputStreamConfiguration> getAudioStreams() {
    return audioStreams;
  }

  /**
   * Set audioStreams
   *
   * @param audioStreams
   */
  public void setAudioStreams(List<BroadcastTsAudioInputStreamConfiguration> audioStreams) {
    this.audioStreams = audioStreams;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BroadcastTsMuxingConfiguration broadcastTsMuxingConfiguration = (BroadcastTsMuxingConfiguration) o;
    return Objects.equals(this.transport, broadcastTsMuxingConfiguration.transport) &&
        Objects.equals(this.program, broadcastTsMuxingConfiguration.program) &&
        Objects.equals(this.videoStreams, broadcastTsMuxingConfiguration.videoStreams) &&
        Objects.equals(this.audioStreams, broadcastTsMuxingConfiguration.audioStreams);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transport, program, videoStreams, audioStreams);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BroadcastTsMuxingConfiguration {\n");
    
    sb.append("    transport: ").append(toIndentedString(transport)).append("\n");
    sb.append("    program: ").append(toIndentedString(program)).append("\n");
    sb.append("    videoStreams: ").append(toIndentedString(videoStreams)).append("\n");
    sb.append("    audioStreams: ").append(toIndentedString(audioStreams)).append("\n");
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

