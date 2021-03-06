package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.BitmovinResponse;
import com.bitmovin.api.sdk.model.ErrorDetails;
import com.bitmovin.api.sdk.model.Message;
import com.bitmovin.api.sdk.model.Status;
import com.bitmovin.api.sdk.model.Subtask;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * Task
 */

public class Task extends BitmovinResponse {
  @JsonProperty("status")
  private Status status;

  @JsonProperty("eta")
  private Double eta;

  @JsonProperty("progress")
  private Integer progress;

  @JsonProperty("subtasks")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<Subtask> subtasks = new ArrayList<Subtask>();

  @JsonProperty("messages")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<Message> messages = new ArrayList<Message>();

  @JsonProperty("createdAt")
  private Date createdAt;

  @JsonProperty("queuedAt")
  private Date queuedAt;

  @JsonProperty("runningAt")
  private Date runningAt;

  @JsonProperty("finishedAt")
  private Date finishedAt;

  @JsonProperty("errorAt")
  private Date errorAt;

  @JsonProperty("error")
  private ErrorDetails error;


  /**
   * Current status (required)
   * @return status
   */
  public Status getStatus() {
    return status;
  }

  /**
   * Current status (required)
   *
   * @param status
   *        Current status (required)
   */
  public void setStatus(Status status) {
    this.status = status;
  }


  /**
   * Estimated ETA in seconds
   * @return eta
   */
  public Double getEta() {
    return eta;
  }

  /**
   * Estimated ETA in seconds
   *
   * @param eta
   *        Estimated ETA in seconds
   */
  public void setEta(Double eta) {
    this.eta = eta;
  }


  /**
   * Progress in percent
   * @return progress
   */
  public Integer getProgress() {
    return progress;
  }

  /**
   * Progress in percent
   *
   * @param progress
   *        Progress in percent
   */
  public void setProgress(Integer progress) {
    this.progress = progress;
  }


  public Task addSubtasksItem(Subtask subtasksItem) {
    this.subtasks.add(subtasksItem);
    return this;
  }

  /**
   * List of subtasks
   * @return subtasks
   */
  public List<Subtask> getSubtasks() {
    return subtasks;
  }

  /**
   * List of subtasks
   *
   * @param subtasks
   *        List of subtasks
   */
  public void setSubtasks(List<Subtask> subtasks) {
    this.subtasks = subtasks;
  }


  public Task addMessagesItem(Message messagesItem) {
    this.messages.add(messagesItem);
    return this;
  }

  /**
   * Task specific messages
   * @return messages
   */
  public List<Message> getMessages() {
    return messages;
  }

  /**
   * Task specific messages
   *
   * @param messages
   *        Task specific messages
   */
  public void setMessages(List<Message> messages) {
    this.messages = messages;
  }


  /**
   * Timestamp when the task was created, formatted in UTC: YYYY-MM-DDThh:mm:ssZ
   * @return createdAt
   */
  public Date getCreatedAt() {
    return createdAt;
  }

  /**
   * Timestamp when the task was created, formatted in UTC: YYYY-MM-DDThh:mm:ssZ
   *
   * @param createdAt
   *        Timestamp when the task was created, formatted in UTC: YYYY-MM-DDThh:mm:ssZ
   */
  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }


  /**
   * Timestamp when the task status changed to \&quot;QUEUED\&quot;, formatted in UTC: YYYY-MM-DDThh:mm:ssZ
   * @return queuedAt
   */
  public Date getQueuedAt() {
    return queuedAt;
  }

  /**
   * Timestamp when the task status changed to \&quot;QUEUED\&quot;, formatted in UTC: YYYY-MM-DDThh:mm:ssZ
   *
   * @param queuedAt
   *        Timestamp when the task status changed to \&quot;QUEUED\&quot;, formatted in UTC: YYYY-MM-DDThh:mm:ssZ
   */
  public void setQueuedAt(Date queuedAt) {
    this.queuedAt = queuedAt;
  }


  /**
   * Timestamp when the task status changed to to \&quot;RUNNING\&quot;, formatted in UTC: YYYY-MM-DDThh:mm:ssZ
   * @return runningAt
   */
  public Date getRunningAt() {
    return runningAt;
  }

  /**
   * Timestamp when the task status changed to to \&quot;RUNNING\&quot;, formatted in UTC: YYYY-MM-DDThh:mm:ssZ
   *
   * @param runningAt
   *        Timestamp when the task status changed to to \&quot;RUNNING\&quot;, formatted in UTC: YYYY-MM-DDThh:mm:ssZ
   */
  public void setRunningAt(Date runningAt) {
    this.runningAt = runningAt;
  }


  /**
   * Timestamp when the task status changed to \&quot;FINISHED\&quot;, formatted in UTC: YYYY-MM-DDThh:mm:ssZ
   * @return finishedAt
   */
  public Date getFinishedAt() {
    return finishedAt;
  }

  /**
   * Timestamp when the task status changed to \&quot;FINISHED\&quot;, formatted in UTC: YYYY-MM-DDThh:mm:ssZ
   *
   * @param finishedAt
   *        Timestamp when the task status changed to \&quot;FINISHED\&quot;, formatted in UTC: YYYY-MM-DDThh:mm:ssZ
   */
  public void setFinishedAt(Date finishedAt) {
    this.finishedAt = finishedAt;
  }


  /**
   * Timestamp when the task status changed to \&quot;ERROR\&quot;, formatted in UTC: YYYY-MM-DDThh:mm:ssZ
   * @return errorAt
   */
  public Date getErrorAt() {
    return errorAt;
  }

  /**
   * Timestamp when the task status changed to \&quot;ERROR\&quot;, formatted in UTC: YYYY-MM-DDThh:mm:ssZ
   *
   * @param errorAt
   *        Timestamp when the task status changed to \&quot;ERROR\&quot;, formatted in UTC: YYYY-MM-DDThh:mm:ssZ
   */
  public void setErrorAt(Date errorAt) {
    this.errorAt = errorAt;
  }


  /**
   * Additional optional error details
   * @return error
   */
  public ErrorDetails getError() {
    return error;
  }

  /**
   * Additional optional error details
   *
   * @param error
   *        Additional optional error details
   */
  public void setError(ErrorDetails error) {
    this.error = error;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Task task = (Task) o;
    return Objects.equals(this.status, task.status) &&
        Objects.equals(this.eta, task.eta) &&
        Objects.equals(this.progress, task.progress) &&
        Objects.equals(this.subtasks, task.subtasks) &&
        Objects.equals(this.messages, task.messages) &&
        Objects.equals(this.createdAt, task.createdAt) &&
        Objects.equals(this.queuedAt, task.queuedAt) &&
        Objects.equals(this.runningAt, task.runningAt) &&
        Objects.equals(this.finishedAt, task.finishedAt) &&
        Objects.equals(this.errorAt, task.errorAt) &&
        Objects.equals(this.error, task.error) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, eta, progress, subtasks, messages, createdAt, queuedAt, runningAt, finishedAt, errorAt, error, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Task {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    eta: ").append(toIndentedString(eta)).append("\n");
    sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
    sb.append("    subtasks: ").append(toIndentedString(subtasks)).append("\n");
    sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    queuedAt: ").append(toIndentedString(queuedAt)).append("\n");
    sb.append("    runningAt: ").append(toIndentedString(runningAt)).append("\n");
    sb.append("    finishedAt: ").append(toIndentedString(finishedAt)).append("\n");
    sb.append("    errorAt: ").append(toIndentedString(errorAt)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
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

