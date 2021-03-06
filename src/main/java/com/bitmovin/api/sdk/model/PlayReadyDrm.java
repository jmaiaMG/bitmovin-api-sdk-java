package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.Drm;
import com.bitmovin.api.sdk.model.EncodingOutput;
import com.bitmovin.api.sdk.model.PlayReadyAdditionalInformation;
import com.bitmovin.api.sdk.model.PlayReadyEncryptionMethod;
import java.util.Date;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * PlayReadyDrm
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = false, defaultImpl = PlayReadyDrm.class)
public class PlayReadyDrm extends Drm {
  @JsonProperty("key")
  private String key;

  @JsonProperty("keySeed")
  private String keySeed;

  @JsonProperty("laUrl")
  private String laUrl;

  @JsonProperty("pssh")
  private String pssh;

  @JsonProperty("method")
  private PlayReadyEncryptionMethod method;

  @JsonProperty("kid")
  private String kid;

  @JsonProperty("additionalInformation")
  private PlayReadyAdditionalInformation additionalInformation;


  /**
   * 16 byte encryption key, 32 hexadecimal characters. Either key or keySeed is required
   * @return key
   */
  public String getKey() {
    return key;
  }

  /**
   * 16 byte encryption key, 32 hexadecimal characters. Either key or keySeed is required
   *
   * @param key
   *        16 byte encryption key, 32 hexadecimal characters. Either key or keySeed is required
   */
  public void setKey(String key) {
    this.key = key;
  }


  /**
   * Key seed to generate key. Either key or keySeed is required
   * @return keySeed
   */
  public String getKeySeed() {
    return keySeed;
  }

  /**
   * Key seed to generate key. Either key or keySeed is required
   *
   * @param keySeed
   *        Key seed to generate key. Either key or keySeed is required
   */
  public void setKeySeed(String keySeed) {
    this.keySeed = keySeed;
  }


  /**
   * URL of the license server
   * @return laUrl
   */
  public String getLaUrl() {
    return laUrl;
  }

  /**
   * URL of the license server
   *
   * @param laUrl
   *        URL of the license server
   */
  public void setLaUrl(String laUrl) {
    this.laUrl = laUrl;
  }


  /**
   * Base64 encoded pssh payload
   * @return pssh
   */
  public String getPssh() {
    return pssh;
  }

  /**
   * Base64 encoded pssh payload
   *
   * @param pssh
   *        Base64 encoded pssh payload
   */
  public void setPssh(String pssh) {
    this.pssh = pssh;
  }


  /**
   * Get method
   * @return method
   */
  public PlayReadyEncryptionMethod getMethod() {
    return method;
  }

  /**
   * Set method
   *
   * @param method
   */
  public void setMethod(PlayReadyEncryptionMethod method) {
    this.method = method;
  }


  /**
   * Key identifier
   * @return kid
   */
  public String getKid() {
    return kid;
  }

  /**
   * Key identifier
   *
   * @param kid
   *        Key identifier
   */
  public void setKid(String kid) {
    this.kid = kid;
  }


  /**
   * Get additionalInformation
   * @return additionalInformation
   */
  public PlayReadyAdditionalInformation getAdditionalInformation() {
    return additionalInformation;
  }

  /**
   * Set additionalInformation
   *
   * @param additionalInformation
   */
  public void setAdditionalInformation(PlayReadyAdditionalInformation additionalInformation) {
    this.additionalInformation = additionalInformation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlayReadyDrm playReadyDrm = (PlayReadyDrm) o;
    return Objects.equals(this.key, playReadyDrm.key) &&
        Objects.equals(this.keySeed, playReadyDrm.keySeed) &&
        Objects.equals(this.laUrl, playReadyDrm.laUrl) &&
        Objects.equals(this.pssh, playReadyDrm.pssh) &&
        Objects.equals(this.method, playReadyDrm.method) &&
        Objects.equals(this.kid, playReadyDrm.kid) &&
        Objects.equals(this.additionalInformation, playReadyDrm.additionalInformation) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, keySeed, laUrl, pssh, method, kid, additionalInformation, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlayReadyDrm {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    keySeed: ").append(toIndentedString(keySeed)).append("\n");
    sb.append("    laUrl: ").append(toIndentedString(laUrl)).append("\n");
    sb.append("    pssh: ").append(toIndentedString(pssh)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    kid: ").append(toIndentedString(kid)).append("\n");
    sb.append("    additionalInformation: ").append(toIndentedString(additionalInformation)).append("\n");
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

