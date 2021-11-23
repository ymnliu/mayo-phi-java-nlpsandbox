package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TextLocationAnnotationAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-08-11T13:52:26.252409-07:00[America/Los_Angeles]")
public class TextLocationAnnotationAllOf   {
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

  public TextLocationAnnotationAllOf locationType(LocationTypeEnum locationType) {
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
    TextLocationAnnotationAllOf textLocationAnnotationAllOf = (TextLocationAnnotationAllOf) o;
    return Objects.equals(this.locationType, textLocationAnnotationAllOf.locationType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(locationType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TextLocationAnnotationAllOf {\n");
    
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

