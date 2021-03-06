package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets AdaptiveQuantMode
 */
public enum AdaptiveQuantMode {
  
  /**
   * Disable adaptive quantization
   */
  DISABLED("DISABLED"),
  
  /**
   * Redistributes bits within each frame
   */
  VARIANCE("VARIANCE"),
  
  /**
   * Redistributes bits across the whole video
   */
  AUTO_VARIANCE("AUTO_VARIANCE"),
  
  /**
   * Redistributes bits across the whole video with a bias to dark scenes
   */
  AUTO_VARIANCE_DARK_SCENES("AUTO_VARIANCE_DARK_SCENES");

  private String value;

  AdaptiveQuantMode(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static AdaptiveQuantMode fromValue(String text) {
    for (AdaptiveQuantMode b : AdaptiveQuantMode.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

