package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.CodecConfiguration;
import java.util.Date;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * AudioConfiguration
 */

public class AudioConfiguration extends CodecConfiguration {
  @JsonProperty("bitrate")
  private Long bitrate;

  @JsonProperty("rate")
  private Double rate;


  /**
   * Target bitrate for the encoded audio in bps (required)
   * @return bitrate
   */
  public Long getBitrate() {
    return bitrate;
  }

  /**
   * Target bitrate for the encoded audio in bps (required)
   *
   * @param bitrate
   *        Target bitrate for the encoded audio in bps (required)
   */
  public void setBitrate(Long bitrate) {
    this.bitrate = bitrate;
  }


  /**
   * Audio sampling rate Hz
   * @return rate
   */
  public Double getRate() {
    return rate;
  }

  /**
   * Audio sampling rate Hz
   *
   * @param rate
   *        Audio sampling rate Hz
   */
  public void setRate(Double rate) {
    this.rate = rate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AudioConfiguration audioConfiguration = (AudioConfiguration) o;
    return Objects.equals(this.bitrate, audioConfiguration.bitrate) &&
        Objects.equals(this.rate, audioConfiguration.rate) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bitrate, rate, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AudioConfiguration {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    bitrate: ").append(toIndentedString(bitrate)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
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

