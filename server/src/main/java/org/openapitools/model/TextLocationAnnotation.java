package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.TextAnnotation;
import org.openapitools.model.TextLocationAnnotationAllOf;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A location annotation in a text
 */
@ApiModel(description = "A location annotation in a text")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-08-11T13:52:26.252409-07:00[America/Los_Angeles]")
public class TextLocationAnnotation   {
  @JsonProperty("start")
  private Integer start;

  @JsonProperty("length")
  private Integer length;

  @JsonProperty("text")
  private String text;

  @JsonProperty("confidence")
  private Float confidence;

  /**
   * Type of location
   */
  public enum LocationTypeEnum {
    CITY("city"),
    
    COUNTRY("country"),
    
    DEPARTMENT("department"),
    
    HOSPITAL("hospital"),
    
    ORGANIZATION("organization"),
    
    OTHER("other"),
    
    ROOM("room"),
    
    STATE("state"),
    
    STREET("street"),
    
    ZIP("zip");

    private String value;

    LocationTypeEnum(String value) {
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
    public static LocationTypeEnum fromValue(String value) {
      for (LocationTypeEnum b : LocationTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("locationType")
  private LocationTypeEnum locationType;

  public TextLocationAnnotation start(Integer start) {
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

  public TextLocationAnnotation length(Integer length) {
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

  public TextLocationAnnotation text(String text) {
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

  public TextLocationAnnotation confidence(Float confidence) {
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

  public TextLocationAnnotation locationType(LocationTypeEnum locationType) {
    this.locationType = locationType;
    return this;
  }

  /**
   * Type of location
   * @return locationType
  */
  @ApiModelProperty(required = true, value = "Type of location")
  @NotNull


  public LocationTypeEnum getLocationType() {
    return locationType;
  }

  public void setLocationType(LocationTypeEnum locationType) {
    this.locationType = locationType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TextLocationAnnotation textLocationAnnotation = (TextLocationAnnotation) o;
    return Objects.equals(this.start, textLocationAnnotation.start) &&
        Objects.equals(this.length, textLocationAnnotation.length) &&
        Objects.equals(this.text, textLocationAnnotation.text) &&
        Objects.equals(this.confidence, textLocationAnnotation.confidence) &&
        Objects.equals(this.locationType, textLocationAnnotation.locationType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(start, length, text, confidence, locationType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TextLocationAnnotation {\n");
    
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    length: ").append(toIndentedString(length)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
    sb.append("    locationType: ").append(toIndentedString(locationType)).append("\n");
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

