package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.MediaStream;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * VideoStream
 */

public class VideoStream extends MediaStream {
  @JsonProperty("fps")
  private String fps;

  @JsonProperty("bitrate")
  private String bitrate;

  @JsonProperty("rate")
  private Long rate;

  @JsonProperty("width")
  private Integer width;

  @JsonProperty("height")
  private Integer height;

  @JsonProperty("par")
  private Double par;

  @JsonProperty("rotation")
  private Integer rotation;


  /**
   * Frame rate of the video
   * @return fps
   */
  public String getFps() {
    return fps;
  }

  /**
   * Frame rate of the video
   *
   * @param fps
   *        Frame rate of the video
   */
  public void setFps(String fps) {
    this.fps = fps;
  }


  /**
   * Bitrate in bps
   * @return bitrate
   */
  public String getBitrate() {
    return bitrate;
  }

  /**
   * Bitrate in bps
   *
   * @param bitrate
   *        Bitrate in bps
   */
  public void setBitrate(String bitrate) {
    this.bitrate = bitrate;
  }


  /**
   * Bitrate in bps (the same as bitrate, but represented as an integer value)
   * @return rate
   */
  public Long getRate() {
    return rate;
  }

  /**
   * Bitrate in bps (the same as bitrate, but represented as an integer value)
   *
   * @param rate
   *        Bitrate in bps (the same as bitrate, but represented as an integer value)
   */
  public void setRate(Long rate) {
    this.rate = rate;
  }


  /**
   * Width of the video (required)
   * @return width
   */
  public Integer getWidth() {
    return width;
  }

  /**
   * Width of the video (required)
   *
   * @param width
   *        Width of the video (required)
   */
  public void setWidth(Integer width) {
    this.width = width;
  }


  /**
   * Height of the video (required)
   * @return height
   */
  public Integer getHeight() {
    return height;
  }

  /**
   * Height of the video (required)
   *
   * @param height
   *        Height of the video (required)
   */
  public void setHeight(Integer height) {
    this.height = height;
  }


  /**
   * Pixel aspect ratio of the video. Default is 1.0
   * @return par
   */
  public Double getPar() {
    return par;
  }

  /**
   * Pixel aspect ratio of the video. Default is 1.0
   *
   * @param par
   *        Pixel aspect ratio of the video. Default is 1.0
   */
  public void setPar(Double par) {
    this.par = par;
  }


  /**
   * Rotation of the video for mobile devices. Default is 0.
   * @return rotation
   */
  public Integer getRotation() {
    return rotation;
  }

  /**
   * Rotation of the video for mobile devices. Default is 0.
   *
   * @param rotation
   *        Rotation of the video for mobile devices. Default is 0.
   */
  public void setRotation(Integer rotation) {
    this.rotation = rotation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VideoStream videoStream = (VideoStream) o;
    return Objects.equals(this.fps, videoStream.fps) &&
        Objects.equals(this.bitrate, videoStream.bitrate) &&
        Objects.equals(this.rate, videoStream.rate) &&
        Objects.equals(this.width, videoStream.width) &&
        Objects.equals(this.height, videoStream.height) &&
        Objects.equals(this.par, videoStream.par) &&
        Objects.equals(this.rotation, videoStream.rotation) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fps, bitrate, rate, width, height, par, rotation, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VideoStream {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    fps: ").append(toIndentedString(fps)).append("\n");
    sb.append("    bitrate: ").append(toIndentedString(bitrate)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    par: ").append(toIndentedString(par)).append("\n");
    sb.append("    rotation: ").append(toIndentedString(rotation)).append("\n");
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

