package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.BitmovinResource;
import java.util.Date;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * Tenant
 */

public class Tenant extends BitmovinResource {
  @JsonProperty("eMail")
  private String eMail;


  /**
   * Email address of the tenant. (required)
   * @return eMail
   */
  public String getEMail() {
    return eMail;
  }

  /**
   * Email address of the tenant. (required)
   *
   * @param eMail
   *        Email address of the tenant. (required)
   */
  public void setEMail(String eMail) {
    this.eMail = eMail;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Tenant tenant = (Tenant) o;
    return Objects.equals(this.eMail, tenant.eMail) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eMail, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Tenant {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    eMail: ").append(toIndentedString(eMail)).append("\n");
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

