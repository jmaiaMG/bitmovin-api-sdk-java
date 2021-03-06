package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * LiveHlsManifest
 */

public class LiveHlsManifest {
  @JsonProperty("manifestId")
  private String manifestId;

  @JsonProperty("timeshift")
  private Double timeshift;

  @JsonProperty("liveEdgeOffset")
  private Double liveEdgeOffset;

  @JsonProperty("insertProgramDateTime")
  private Boolean insertProgramDateTime;


  /**
   * HLS manifest ids (required)
   * @return manifestId
   */
  public String getManifestId() {
    return manifestId;
  }

  /**
   * HLS manifest ids (required)
   *
   * @param manifestId
   *        HLS manifest ids (required)
   */
  public void setManifestId(String manifestId) {
    this.manifestId = manifestId;
  }


  /**
   * Timeshift in seconds
   * @return timeshift
   */
  public Double getTimeshift() {
    return timeshift;
  }

  /**
   * Timeshift in seconds
   *
   * @param timeshift
   *        Timeshift in seconds
   */
  public void setTimeshift(Double timeshift) {
    this.timeshift = timeshift;
  }


  /**
   * Live edge offset in seconds
   * @return liveEdgeOffset
   */
  public Double getLiveEdgeOffset() {
    return liveEdgeOffset;
  }

  /**
   * Live edge offset in seconds
   *
   * @param liveEdgeOffset
   *        Live edge offset in seconds
   */
  public void setLiveEdgeOffset(Double liveEdgeOffset) {
    this.liveEdgeOffset = liveEdgeOffset;
  }


  /**
   * Specifies if the EXT-X-PROGRAM-DATETIME tag will be included
   * @return insertProgramDateTime
   */
  public Boolean getInsertProgramDateTime() {
    return insertProgramDateTime;
  }

  /**
   * Specifies if the EXT-X-PROGRAM-DATETIME tag will be included
   *
   * @param insertProgramDateTime
   *        Specifies if the EXT-X-PROGRAM-DATETIME tag will be included
   */
  public void setInsertProgramDateTime(Boolean insertProgramDateTime) {
    this.insertProgramDateTime = insertProgramDateTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LiveHlsManifest liveHlsManifest = (LiveHlsManifest) o;
    return Objects.equals(this.manifestId, liveHlsManifest.manifestId) &&
        Objects.equals(this.timeshift, liveHlsManifest.timeshift) &&
        Objects.equals(this.liveEdgeOffset, liveHlsManifest.liveEdgeOffset) &&
        Objects.equals(this.insertProgramDateTime, liveHlsManifest.insertProgramDateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(manifestId, timeshift, liveEdgeOffset, insertProgramDateTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LiveHlsManifest {\n");
    
    sb.append("    manifestId: ").append(toIndentedString(manifestId)).append("\n");
    sb.append("    timeshift: ").append(toIndentedString(timeshift)).append("\n");
    sb.append("    liveEdgeOffset: ").append(toIndentedString(liveEdgeOffset)).append("\n");
    sb.append("    insertProgramDateTime: ").append(toIndentedString(insertProgramDateTime)).append("\n");
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

