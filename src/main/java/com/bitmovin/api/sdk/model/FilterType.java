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
 * Gets or Sets FilterType
 */
public enum FilterType {
  
  
  CROP("CROP"),
  
  
  CONFORM("CONFORM"),
  
  
  WATERMARK("WATERMARK"),
  
  
  ENHANCED_WATERMARK("ENHANCED_WATERMARK"),
  
  
  ROTATE("ROTATE"),
  
  
  DEINTERLACE("DEINTERLACE"),
  
  
  AUDIO_MIX("AUDIO_MIX"),
  
  
  DENOISE_HQDN3D("DENOISE_HQDN3D"),
  
  
  TEXT("TEXT"),
  
  
  UNSHARP("UNSHARP"),
  
  
  SCALE("SCALE"),
  
  
  INTERLACE("INTERLACE"),
  
  
  AUDIO_VOLUME("AUDIO_VOLUME"),
  
  
  EBU_R128_SINGLE_PASS("EBU_R128_SINGLE_PASS");

  private String value;

  FilterType(String value) {
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
  public static FilterType fromValue(String text) {
    for (FilterType b : FilterType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

