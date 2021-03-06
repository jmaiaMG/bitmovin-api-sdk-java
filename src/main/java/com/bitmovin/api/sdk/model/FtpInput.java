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
 * FtpInput
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = false, defaultImpl = FtpInput.class)
public class FtpInput extends Input {
  @JsonProperty("host")
  private String host;

  @JsonProperty("port")
  private Integer port;

  @JsonProperty("passive")
  private Boolean passive;

  @JsonProperty("username")
  private String username;

  @JsonProperty("password")
  private String password;

  @JsonProperty("remoteVerificationEnabled")
  private Boolean remoteVerificationEnabled;


  /**
   * Host URL or IP of the FTP server (required)
   * @return host
   */
  public String getHost() {
    return host;
  }

  /**
   * Host URL or IP of the FTP server (required)
   *
   * @param host
   *        Host URL or IP of the FTP server (required)
   */
  public void setHost(String host) {
    this.host = host;
  }


  /**
   * Port to use, standard for FTP: 21
   * @return port
   */
  public Integer getPort() {
    return port;
  }

  /**
   * Port to use, standard for FTP: 21
   *
   * @param port
   *        Port to use, standard for FTP: 21
   */
  public void setPort(Integer port) {
    this.port = port;
  }


  /**
   * Use passive mode. Default is true.
   * @return passive
   */
  public Boolean getPassive() {
    return passive;
  }

  /**
   * Use passive mode. Default is true.
   *
   * @param passive
   *        Use passive mode. Default is true.
   */
  public void setPassive(Boolean passive) {
    this.passive = passive;
  }


  /**
   * Your FTP Username
   * @return username
   */
  public String getUsername() {
    return username;
  }

  /**
   * Your FTP Username
   *
   * @param username
   *        Your FTP Username
   */
  public void setUsername(String username) {
    this.username = username;
  }


  /**
   * Your FTP password
   * @return password
   */
  public String getPassword() {
    return password;
  }

  /**
   * Your FTP password
   *
   * @param password
   *        Your FTP password
   */
  public void setPassword(String password) {
    this.password = password;
  }


  /**
   * Ensure that connections originate from the declared ftp host. Default is true.
   * @return remoteVerificationEnabled
   */
  public Boolean getRemoteVerificationEnabled() {
    return remoteVerificationEnabled;
  }

  /**
   * Ensure that connections originate from the declared ftp host. Default is true.
   *
   * @param remoteVerificationEnabled
   *        Ensure that connections originate from the declared ftp host. Default is true.
   */
  public void setRemoteVerificationEnabled(Boolean remoteVerificationEnabled) {
    this.remoteVerificationEnabled = remoteVerificationEnabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FtpInput ftpInput = (FtpInput) o;
    return Objects.equals(this.host, ftpInput.host) &&
        Objects.equals(this.port, ftpInput.port) &&
        Objects.equals(this.passive, ftpInput.passive) &&
        Objects.equals(this.username, ftpInput.username) &&
        Objects.equals(this.password, ftpInput.password) &&
        Objects.equals(this.remoteVerificationEnabled, ftpInput.remoteVerificationEnabled) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(host, port, passive, username, password, remoteVerificationEnabled, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FtpInput {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    passive: ").append(toIndentedString(passive)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    remoteVerificationEnabled: ").append(toIndentedString(remoteVerificationEnabled)).append("\n");
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

