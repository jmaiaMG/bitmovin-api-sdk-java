package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.StandardMediaInfo;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * SubtitlesMediaInfo
 */

public class SubtitlesMediaInfo extends StandardMediaInfo {
  @JsonProperty("forced")
  private Boolean forced;


  /**
   * A value of true indicates that the Rendition contains content which is considered essential to play.
   * @return forced
   */
  public Boolean getForced() {
    return forced;
  }

  /**
   * A value of true indicates that the Rendition contains content which is considered essential to play.
   *
   * @param forced
   *        A value of true indicates that the Rendition contains content which is considered essential to play.
   */
  public void setForced(Boolean forced) {
    this.forced = forced;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubtitlesMediaInfo subtitlesMediaInfo = (SubtitlesMediaInfo) o;
    return Objects.equals(this.forced, subtitlesMediaInfo.forced) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(forced, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubtitlesMediaInfo {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    forced: ").append(toIndentedString(forced)).append("\n");
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

