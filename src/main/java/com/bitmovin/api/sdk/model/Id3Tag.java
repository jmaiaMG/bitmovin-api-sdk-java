package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.BitmovinResource;
import com.bitmovin.api.sdk.model.Id3TagPositionMode;
import java.util.Date;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * Id3Tag
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = false, defaultImpl = Id3Tag.class)
@JsonSubTypes({
  @JsonSubTypes.Type(value = RawId3Tag.class, name = "RAW"),
  @JsonSubTypes.Type(value = FrameIdId3Tag.class, name = "FRAME_ID"),
  @JsonSubTypes.Type(value = PlaintextId3Tag.class, name = "PLAIN_TEXT"),
})

public class Id3Tag extends BitmovinResource {
  @JsonProperty("positionMode")
  private Id3TagPositionMode positionMode;

  @JsonProperty("frame")
  private Long frame;

  @JsonProperty("time")
  private Double time;


  /**
   * Get positionMode
   * @return positionMode
   */
  public Id3TagPositionMode getPositionMode() {
    return positionMode;
  }

  /**
   * Set positionMode
   *
   * @param positionMode
   */
  public void setPositionMode(Id3TagPositionMode positionMode) {
    this.positionMode = positionMode;
  }


  /**
   * Frame number at which the Tag should be inserted
   * @return frame
   */
  public Long getFrame() {
    return frame;
  }

  /**
   * Frame number at which the Tag should be inserted
   *
   * @param frame
   *        Frame number at which the Tag should be inserted
   */
  public void setFrame(Long frame) {
    this.frame = frame;
  }


  /**
   * Time in seconds where the Tag should be inserted
   * @return time
   */
  public Double getTime() {
    return time;
  }

  /**
   * Time in seconds where the Tag should be inserted
   *
   * @param time
   *        Time in seconds where the Tag should be inserted
   */
  public void setTime(Double time) {
    this.time = time;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Id3Tag id3Tag = (Id3Tag) o;
    return Objects.equals(this.positionMode, id3Tag.positionMode) &&
        Objects.equals(this.frame, id3Tag.frame) &&
        Objects.equals(this.time, id3Tag.time) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(positionMode, frame, time, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Id3Tag {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    positionMode: ").append(toIndentedString(positionMode)).append("\n");
    sb.append("    frame: ").append(toIndentedString(frame)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
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

