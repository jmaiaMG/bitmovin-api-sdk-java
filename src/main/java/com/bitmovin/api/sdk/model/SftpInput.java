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
 * SftpInput
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = false, defaultImpl = SftpInput.class)
public class SftpInput extends Input {
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


  /**
   * Host Url or IP of the SFTP server (required)
   * @return host
   */
  public String getHost() {
    return host;
  }

  /**
   * Host Url or IP of the SFTP server (required)
   *
   * @param host
   *        Host Url or IP of the SFTP server (required)
   */
  public void setHost(String host) {
    this.host = host;
  }


  /**
   * Port to use, standard for SFTP: 22
   * @return port
   */
  public Integer getPort() {
    return port;
  }

  /**
   * Port to use, standard for SFTP: 22
   *
   * @param port
   *        Port to use, standard for SFTP: 22
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
   * Your SFTP Username
   * @return username
   */
  public String getUsername() {
    return username;
  }

  /**
   * Your SFTP Username
   *
   * @param username
   *        Your SFTP Username
   */
  public void setUsername(String username) {
    this.username = username;
  }


  /**
   * Your SFTP password
   * @return password
   */
  public String getPassword() {
    return password;
  }

  /**
   * Your SFTP password
   *
   * @param password
   *        Your SFTP password
   */
  public void setPassword(String password) {
    this.password = password;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SftpInput sftpInput = (SftpInput) o;
    return Objects.equals(this.host, sftpInput.host) &&
        Objects.equals(this.port, sftpInput.port) &&
        Objects.equals(this.passive, sftpInput.passive) &&
        Objects.equals(this.username, sftpInput.username) &&
        Objects.equals(this.password, sftpInput.password) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(host, port, passive, username, password, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SftpInput {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    passive: ").append(toIndentedString(passive)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
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

