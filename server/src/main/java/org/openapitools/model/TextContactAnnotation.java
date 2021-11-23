package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.TextAnnotation;
import org.openapitools.model.TextContactAnnotationAllOf;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A contact annotation in a text
 */
@ApiModel(description = "A contact annotation in a text")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-08-11T13:52:26.252409-07:00[America/Los_Angeles]")
public class TextContactAnnotation   {
  @JsonProperty("start")
  private Integer start;

  @JsonProperty("length")
  private Integer length;

  @JsonProperty("text")
  private String text;

  @JsonProperty("confidence")
  private Float confidence;

  /**
   * Type of contact information
   */
  public enum ContactTypeEnum {
    EMAIL("email"),
    
    FAX("fax"),
    
    IP_ADDRESS("ip_address"),
    
    PHONE("phone"),
    
    URL("url"),
    
    OTHER("other");

    private String value;

    ContactTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ContactTypeEnum fromValue(String value) {
      for (ContactTypeEnum b : ContactTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("contactType")
  private ContactTypeEnum contactType;

  public TextContactAnnotation start(Integer start) {
    this.start = start;
    return this;
  }

  /**
   * The position of the first character
   * @return start
  */
  @ApiModelProperty(required = true, value = "The position of the first character")
  @NotNull


  public Integer getStart() {
    return start;
  }

  public void setStart(Integer start) {
    this.start = start;
  }

  public TextContactAnnotation length(Integer length) {
    this.length = length;
    return this;
  }

  /**
   * The length of the annotation
   * @return length
  */
  @ApiModelProperty(required = true, value = "The length of the annotation")
  @NotNull


  public Integer getLength() {
    return length;
  }

  public void setLength(Integer length) {
    this.length = length;
  }

  public TextContactAnnotation text(String text) {
    this.text = text;
    return this;
  }

  /**
   * The string annotated
   * @return text
  */
  @ApiModelProperty(required = true, value = "The string annotated")
  @NotNull


  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public TextContactAnnotation confidence(Float confidence) {
    this.confidence = confidence;
    return this;
  }

  /**
   * The confidence in the accuracy of the annotation
   * minimum: 0
   * maximum: 100
   * @return confidence
  */
  @ApiModelProperty(required = true, value = "The confidence in the accuracy of the annotation")
  @NotNull

@DecimalMin("0") @DecimalMax("100") 
  public Float getConfidence() {
    return confidence;
  }

  public void setConfidence(Float confidence) {
    this.confidence = confidence;
  }

  public TextContactAnnotation contactType(ContactTypeEnum contactType) {
    this.contactType = contactType;
    return this;
  }

  /**
   * Type of contact information
   * @return contactType
  */
  @ApiModelProperty(required = true, value = "Type of contact information")
  @NotNull


  public ContactTypeEnum getContactType() {
    return contactType;
  }

  public void setContactType(ContactTypeEnum contactType) {
    this.contactType = contactType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TextContactAnnotation textContactAnnotation = (TextContactAnnotation) o;
    return Objects.equals(this.start, textContactAnnotation.start) &&
        Objects.equals(this.length, textContactAnnotation.length) &&
        Objects.equals(this.text, textContactAnnotation.text) &&
        Objects.equals(this.confidence, textContactAnnotation.confidence) &&
        Objects.equals(this.contactType, textContactAnnotation.contactType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(start, length, text, confidence, contactType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TextContactAnnotation {\n");
    
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    length: ").append(toIndentedString(length)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
    sb.append("    contactType: ").append(toIndentedString(contactType)).append("\n");
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

