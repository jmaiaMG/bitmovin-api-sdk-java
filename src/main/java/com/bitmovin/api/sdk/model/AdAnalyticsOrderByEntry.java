package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.AdAnalyticsAttribute;
import com.bitmovin.api.sdk.model.AnalyticsOrder;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * AdAnalyticsOrderByEntry
 */

public class AdAnalyticsOrderByEntry {
  @JsonProperty("name")
  private AdAnalyticsAttribute name;

  @JsonProperty("order")
  private AnalyticsOrder order;


  /**
   * Get name
   * @return name
   */
  public AdAnalyticsAttribute getName() {
    return name;
  }

  /**
   * Set name
   *
   * @param name
   */
  public void setName(AdAnalyticsAttribute name) {
    this.name = name;
  }


  /**
   * Get order
   * @return order
   */
  public AnalyticsOrder getOrder() {
    return order;
  }

  /**
   * Set order
   *
   * @param order
   */
  public void setOrder(AnalyticsOrder order) {
    this.order = order;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdAnalyticsOrderByEntry adAnalyticsOrderByEntry = (AdAnalyticsOrderByEntry) o;
    return Objects.equals(this.name, adAnalyticsOrderByEntry.name) &&
        Objects.equals(this.order, adAnalyticsOrderByEntry.order);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, order);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdAnalyticsOrderByEntry {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
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

