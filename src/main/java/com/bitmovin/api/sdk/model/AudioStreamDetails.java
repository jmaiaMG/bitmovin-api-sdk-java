package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.StreamDetails;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * AudioStreamDetails
 */

public class AudioStreamDetails extends StreamDetails {
  @JsonProperty("sampleRate")
  private Integer sampleRate;

  @JsonProperty("bitrate")
  private Integer bitrate;

  @JsonProperty("language")
  private String language;

  @JsonProperty("hearingImpaired")
  private Boolean hearingImpaired;


  /**
   * Get sampleRate
   * @return sampleRate
   */
  public Integer getSampleRate() {
    return sampleRate;
  }

  public void setSampleRate(Integer sampleRate) {
    this.sampleRate = sampleRate;
  }


  /**
   * Get bitrate
   * @return bitrate
   */
  public Integer getBitrate() {
    return bitrate;
  }

  public void setBitrate(Integer bitrate) {
    this.bitrate = bitrate;
  }


  /**
   * Get language
   * @return language
   */
  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }


  /**
   * Get hearingImpaired
   * @return hearingImpaired
   */
  public Boolean getHearingImpaired() {
    return hearingImpaired;
  }

  public void setHearingImpaired(Boolean hearingImpaired) {
    this.hearingImpaired = hearingImpaired;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AudioStreamDetails audioStreamDetails = (AudioStreamDetails) o;
    return Objects.equals(this.sampleRate, audioStreamDetails.sampleRate) &&
        Objects.equals(this.bitrate, audioStreamDetails.bitrate) &&
        Objects.equals(this.language, audioStreamDetails.language) &&
        Objects.equals(this.hearingImpaired, audioStreamDetails.hearingImpaired) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sampleRate, bitrate, language, hearingImpaired, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AudioStreamDetails {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    sampleRate: ").append(toIndentedString(sampleRate)).append("\n");
    sb.append("    bitrate: ").append(toIndentedString(bitrate)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    hearingImpaired: ").append(toIndentedString(hearingImpaired)).append("\n");
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
