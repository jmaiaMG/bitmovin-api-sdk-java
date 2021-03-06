package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.Input;
import java.util.Date;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * AsperaInput
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = false, defaultImpl = AsperaInput.class)
public class AsperaInput extends Input {
  @JsonProperty("minBandwidth")
  private String minBandwidth;

  @JsonProperty("maxBandwidth")
  private String maxBandwidth;

  @JsonProperty("host")
  private String host;

  @JsonProperty("username")
  private String username;

  @JsonProperty("password")
  private String password;

  @JsonProperty("token")
  private String token;

  @JsonProperty("sshPort")
  private Integer sshPort;

  @JsonProperty("faspPort")
  private Integer faspPort;


  /**
   * Minimal download bandwidth. Examples: 100k, 100m, 100g
   * @return minBandwidth
   */
  public String getMinBandwidth() {
    return minBandwidth;
  }

  /**
   * Minimal download bandwidth. Examples: 100k, 100m, 100g
   *
   * @param minBandwidth
   *        Minimal download bandwidth. Examples: 100k, 100m, 100g
   */
  public void setMinBandwidth(String minBandwidth) {
    this.minBandwidth = minBandwidth;
  }


  /**
   * Maximal download bandwidth. Examples: 100k, 100m, 100g
   * @return maxBandwidth
   */
  public String getMaxBandwidth() {
    return maxBandwidth;
  }

  /**
   * Maximal download bandwidth. Examples: 100k, 100m, 100g
   *
   * @param maxBandwidth
   *        Maximal download bandwidth. Examples: 100k, 100m, 100g
   */
  public void setMaxBandwidth(String maxBandwidth) {
    this.maxBandwidth = maxBandwidth;
  }


  /**
   * Host to use for Aspera transfers (required)
   * @return host
   */
  public String getHost() {
    return host;
  }

  /**
   * Host to use for Aspera transfers (required)
   *
   * @param host
   *        Host to use for Aspera transfers (required)
   */
  public void setHost(String host) {
    this.host = host;
  }


  /**
   * Username to log into Aspera host (either password and user must be set or token)
   * @return username
   */
  public String getUsername() {
    return username;
  }

  /**
   * Username to log into Aspera host (either password and user must be set or token)
   *
   * @param username
   *        Username to log into Aspera host (either password and user must be set or token)
   */
  public void setUsername(String username) {
    this.username = username;
  }


  /**
   * corresponding password (either password and user must be set or token)
   * @return password
   */
  public String getPassword() {
    return password;
  }

  /**
   * corresponding password (either password and user must be set or token)
   *
   * @param password
   *        corresponding password (either password and user must be set or token)
   */
  public void setPassword(String password) {
    this.password = password;
  }


  /**
   * Token used for authentication (either password and user must be set or token)
   * @return token
   */
  public String getToken() {
    return token;
  }

  /**
   * Token used for authentication (either password and user must be set or token)
   *
   * @param token
   *        Token used for authentication (either password and user must be set or token)
   */
  public void setToken(String token) {
    this.token = token;
  }


  /**
   * Set the TCP port to be used for fasp session initiation
   * @return sshPort
   */
  public Integer getSshPort() {
    return sshPort;
  }

  /**
   * Set the TCP port to be used for fasp session initiation
   *
   * @param sshPort
   *        Set the TCP port to be used for fasp session initiation
   */
  public void setSshPort(Integer sshPort) {
    this.sshPort = sshPort;
  }


  /**
   * Set the UDP port to be used by fasp for data transfer
   * @return faspPort
   */
  public Integer getFaspPort() {
    return faspPort;
  }

  /**
   * Set the UDP port to be used by fasp for data transfer
   *
   * @param faspPort
   *        Set the UDP port to be used by fasp for data transfer
   */
  public void setFaspPort(Integer faspPort) {
    this.faspPort = faspPort;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AsperaInput asperaInput = (AsperaInput) o;
    return Objects.equals(this.minBandwidth, asperaInput.minBandwidth) &&
        Objects.equals(this.maxBandwidth, asperaInput.maxBandwidth) &&
        Objects.equals(this.host, asperaInput.host) &&
        Objects.equals(this.username, asperaInput.username) &&
        Objects.equals(this.password, asperaInput.password) &&
        Objects.equals(this.token, asperaInput.token) &&
        Objects.equals(this.sshPort, asperaInput.sshPort) &&
        Objects.equals(this.faspPort, asperaInput.faspPort) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(minBandwidth, maxBandwidth, host, username, password, token, sshPort, faspPort, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AsperaInput {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    minBandwidth: ").append(toIndentedString(minBandwidth)).append("\n");
    sb.append("    maxBandwidth: ").append(toIndentedString(maxBandwidth)).append("\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    sshPort: ").append(toIndentedString(sshPort)).append("\n");
    sb.append("    faspPort: ").append(toIndentedString(faspPort)).append("\n");
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

