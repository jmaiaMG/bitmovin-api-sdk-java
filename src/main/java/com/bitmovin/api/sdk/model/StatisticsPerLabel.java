package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.BillableEncodingFeatureMinutes;
import com.bitmovin.api.sdk.model.BillableEncodingMinutes;
import com.bitmovin.api.sdk.model.EgressInformation;
import com.bitmovin.api.sdk.model.Statistics;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * StatisticsPerLabel
 */

public class StatisticsPerLabel extends Statistics {
  @JsonProperty("label")
  private String label;

  @JsonProperty("billableMinutes")
  private Double billableMinutes;

  @JsonProperty("billableEncodingMinutes")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<BillableEncodingMinutes> billableEncodingMinutes = new ArrayList<BillableEncodingMinutes>();

  @JsonProperty("billableTransmuxingMinutes")
  private Double billableTransmuxingMinutes;

  @JsonProperty("billableFeatureMinutes")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<BillableEncodingFeatureMinutes> billableFeatureMinutes = new ArrayList<BillableEncodingFeatureMinutes>();

  @JsonProperty("billableEgressBytes")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<EgressInformation> billableEgressBytes = new ArrayList<EgressInformation>();


  /**
   * An optional error message, when the event is in error state (occurs at event: ERROR) (required)
   * @return label
   */
  public String getLabel() {
    return label;
  }

  /**
   * An optional error message, when the event is in error state (occurs at event: ERROR) (required)
   *
   * @param label
   *        An optional error message, when the event is in error state (occurs at event: ERROR) (required)
   */
  public void setLabel(String label) {
    this.label = label;
  }


  /**
   * The billable minutes.
   * @return billableMinutes
   */
  public Double getBillableMinutes() {
    return billableMinutes;
  }

  /**
   * The billable minutes.
   *
   * @param billableMinutes
   *        The billable minutes.
   */
  public void setBillableMinutes(Double billableMinutes) {
    this.billableMinutes = billableMinutes;
  }

  /**
   * Billable minutes for each encoding configuration
   * @return billableEncodingMinutes
   */
  public List<BillableEncodingMinutes> getBillableEncodingMinutes() {
    return billableEncodingMinutes;
  }


  /**
   * Billable minutes for muxings.
   * @return billableTransmuxingMinutes
   */
  public Double getBillableTransmuxingMinutes() {
    return billableTransmuxingMinutes;
  }

  /**
   * Billable minutes for muxings.
   *
   * @param billableTransmuxingMinutes
   *        Billable minutes for muxings.
   */
  public void setBillableTransmuxingMinutes(Double billableTransmuxingMinutes) {
    this.billableTransmuxingMinutes = billableTransmuxingMinutes;
  }

  /**
   * Billable minutes for features
   * @return billableFeatureMinutes
   */
  public List<BillableEncodingFeatureMinutes> getBillableFeatureMinutes() {
    return billableFeatureMinutes;
  }

  /**
   * Billable egress output
   * @return billableEgressBytes
   */
  public List<EgressInformation> getBillableEgressBytes() {
    return billableEgressBytes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatisticsPerLabel statisticsPerLabel = (StatisticsPerLabel) o;
    return Objects.equals(this.label, statisticsPerLabel.label) &&
        Objects.equals(this.billableMinutes, statisticsPerLabel.billableMinutes) &&
        Objects.equals(this.billableEncodingMinutes, statisticsPerLabel.billableEncodingMinutes) &&
        Objects.equals(this.billableTransmuxingMinutes, statisticsPerLabel.billableTransmuxingMinutes) &&
        Objects.equals(this.billableFeatureMinutes, statisticsPerLabel.billableFeatureMinutes) &&
        Objects.equals(this.billableEgressBytes, statisticsPerLabel.billableEgressBytes) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(label, billableMinutes, billableEncodingMinutes, billableTransmuxingMinutes, billableFeatureMinutes, billableEgressBytes, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatisticsPerLabel {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    billableMinutes: ").append(toIndentedString(billableMinutes)).append("\n");
    sb.append("    billableEncodingMinutes: ").append(toIndentedString(billableEncodingMinutes)).append("\n");
    sb.append("    billableTransmuxingMinutes: ").append(toIndentedString(billableTransmuxingMinutes)).append("\n");
    sb.append("    billableFeatureMinutes: ").append(toIndentedString(billableFeatureMinutes)).append("\n");
    sb.append("    billableEgressBytes: ").append(toIndentedString(billableEgressBytes)).append("\n");
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

