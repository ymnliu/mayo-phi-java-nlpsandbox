package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A clinical note
 */
@ApiModel(description = "A clinical note")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-08-11T13:52:26.252409-07:00[America/Los_Angeles]")
public class Note   {
  @JsonProperty("identifier")
  private String identifier;

  @JsonProperty("text")
  private String text;

  @JsonProperty("type")
  private String type;

  @JsonProperty("patientId")
  private String patientId;

  public Note identifier(String identifier) {
    this.identifier = identifier;
    return this;
  }

  /**
   * The ID of the clinical note
   * @return identifier
  */
  @ApiModelProperty(example = "awesome-note", required = true, value = "The ID of the clinical note")
  @NotNull

@Pattern(regexp="^[a-z0-9]+(?:-[a-z0-9]+)*$") @Size(min=3,max=60) 
  public String getIdentifier() {
    return identifier;
  }

  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }

  public Note text(String text) {
    this.text = text;
    return this;
  }

  /**
   * The content of the clinical note
   * @return text
  */
  @ApiModelProperty(required = true, value = "The content of the clinical note")
  @NotNull


  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public Note type(String type) {
    this.type = type;
    return this;
  }

  /**
   * The note type (LOINC concept)
   * @return type
  */
  @ApiModelProperty(required = true, value = "The note type (LOINC concept)")
  @NotNull


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Note patientId(String patientId) {
    this.patientId = patientId;
    return this;
  }

  /**
   * The ID of the FHIR patient
   * @return patientId
  */
  @ApiModelProperty(example = "awesome-patient", required = true, value = "The ID of the FHIR patient")
  @NotNull

@Pattern(regexp="^[a-z0-9]+(?:-[a-z0-9]+)*$") @Size(min=3,max=60) 
  public String getPatientId() {
    return patientId;
  }

  public void setPatientId(String patientId) {
    this.patientId = patientId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Note note = (Note) o;
    return Objects.equals(this.identifier, note.identifier) &&
        Objects.equals(this.text, note.text) &&
        Objects.equals(this.type, note.type) &&
        Objects.equals(this.patientId, note.patientId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identifier, text, type, patientId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Note {\n");
    
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    patientId: ").append(toIndentedString(patientId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

