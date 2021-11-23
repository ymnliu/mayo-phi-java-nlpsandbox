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
 * TextDateAnnotationAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-08-11T13:52:26.252409-07:00[America/Los_Angeles]")
public class TextDateAnnotationAllOf   {
  @JsonProperty("dateFormat")
  private String dateFormat;

  public TextDateAnnotationAllOf dateFormat(String dateFormat) {
    this.dateFormat = dateFormat;
    return this;
  }

  /**
   * Date format (ISO 8601)
   * @return dateFormat
  */
  @ApiModelProperty(example = "MM/DD/YYYY", value = "Date format (ISO 8601)")


  public String getDateFormat() {
    return dateFormat;
  }

  public void setDateFormat(String dateFormat) {
    this.dateFormat = dateFormat;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TextDateAnnotationAllOf textDateAnnotationAllOf = (TextDateAnnotationAllOf) o;
    return Objects.equals(this.dateFormat, textDateAnnotationAllOf.dateFormat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateFormat);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TextDateAnnotationAllOf {\n");
    
    sb.append("    dateFormat: ").append(toIndentedString(dateFormat)).append("\n");
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

