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
 * Gets or Sets BAdapt
 */
public enum BAdapt {
  
  /**
   * Very fast, but not recommended
   */
  NONE("NONE"),
  
  /**
   * A good balance between speed and quality
   */
  FAST("FAST"),
  
  /**
   * Best Quality, but slow with high bframes
   */
  FULL("FULL");

  private String value;

  BAdapt(String value) {
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
  public static BAdapt fromValue(String text) {
    for (BAdapt b : BAdapt.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

