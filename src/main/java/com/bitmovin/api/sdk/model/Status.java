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
 * Gets or Sets Status
 */
public enum Status {
  
  /**
   * The process has been created, but not started yet
   */
  CREATED("CREATED"),
  
  /**
   * The process has been enqueued for execution and will start as soon as resources are available
   */
  QUEUED("QUEUED"),
  
  /**
   * The process is being executed
   */
  RUNNING("RUNNING"),
  
  /**
   * The process was finished successfully. This is a final state
   */
  FINISHED("FINISHED"),
  
  /**
   * The process has stopped due to an error. This is a final state
   */
  ERROR("ERROR"),
  
  /**
   * The process has been canceled by the user. This is a final state
   */
  CANCELED("CANCELED"),
  
  /**
   * The process has finished successfully, but at least one transfer to a configured output failed. The transfer attempt can be retried.
   */
  TRANSFER_ERROR("TRANSFER_ERROR");

  private String value;

  Status(String value) {
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
  public static Status fromValue(String text) {
    for (Status b : Status.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

