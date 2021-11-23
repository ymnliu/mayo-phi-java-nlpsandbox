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
 * TextIdAnnotationAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-08-11T13:52:26.252409-07:00[America/Los_Angeles]")
public class TextIdAnnotationAllOf   {
  /**
   * Type of ID information
   */
  public enum IdTypeEnum {
    ACCOUNT("account"),
    
    BIO_ID("bio_id"),
    
    DEVICE("device"),
    
    HEALTH_PLAN("health_plan"),
    
    ID_NUMBER("id_number"),
    
    LICENSE("license"),
    
    MEDICAL_RECORD("medical_record"),
    
    SSN("ssn"),
    
    VEHICLE("vehicle"),
    
    OTHER("other");

    private String value;

    IdTypeEnum(String value) {
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
    public static IdTypeEnum fromValue(String value) {
      for (IdTypeEnum b : IdTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("idType")
  private IdTypeEnum idType;

  public TextIdAnnotationAllOf idType(IdTypeEnum idType) {
    this.idType = idType;
    return this;
  }

  /**
   * Type of ID information
   * @return idType
  */
  @ApiModelProperty(required = true, value = "Type of ID information")
  @NotNull


  public IdTypeEnum getIdType() {
    return idType;
  }

  public void setIdType(IdTypeEnum idType) {
    this.idType = idType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TextIdAnnotationAllOf textIdAnnotationAllOf = (TextIdAnnotationAllOf) o;
    return Objects.equals(this.idType, textIdAnnotationAllOf.idType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TextIdAnnotationAllOf {\n");
    
    sb.append("    idType: ").append(toIndentedString(idType)).append("\n");
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

