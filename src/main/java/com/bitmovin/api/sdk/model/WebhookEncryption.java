package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.EncryptionType;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * WebhookEncryption
 */

public class WebhookEncryption {
  @JsonProperty("type")
  private EncryptionType type;

  @JsonProperty("key")
  private String key;


  /**
   * The encryption algorithm used for the webhook (required)
   * @return type
   */
  public EncryptionType getType() {
    return type;
  }

  /**
   * The encryption algorithm used for the webhook (required)
   *
   * @param type
   *        The encryption algorithm used for the webhook (required)
   */
  public void setType(EncryptionType type) {
    this.type = type;
  }


  /**
   * The key of the encryption (required)
   * @return key
   */
  public String getKey() {
    return key;
  }

  /**
   * The key of the encryption (required)
   *
   * @param key
   *        The key of the encryption (required)
   */
  public void setKey(String key) {
    this.key = key;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookEncryption webhookEncryption = (WebhookEncryption) o;
    return Objects.equals(this.type, webhookEncryption.type) &&
        Objects.equals(this.key, webhookEncryption.key);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, key);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookEncryption {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
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

