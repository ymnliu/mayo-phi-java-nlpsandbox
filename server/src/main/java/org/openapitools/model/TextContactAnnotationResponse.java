package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.TextContactAnnotation;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The response to a contact annotation request
 */
@ApiModel(description = "The response to a contact annotation request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-08-11T13:52:26.252409-07:00[America/Los_Angeles]")
public class TextContactAnnotationResponse   {
  @JsonProperty("textContactAnnotations")
  @Valid
  private List<TextContactAnnotation> textContactAnnotations = new ArrayList<>();

  public TextContactAnnotationResponse textContactAnnotations(List<TextContactAnnotation> textContactAnnotations) {
    this.textContactAnnotations = textContactAnnotations;
    return this;
  }

  public TextContactAnnotationResponse addTextContactAnnotationsItem(TextContactAnnotation textContactAnnotationsItem) {
    this.textContactAnnotations.add(textContactAnnotationsItem);
    return this;
  }

  /**
   * A list of contact annotations
   * @return textContactAnnotations
  */
  @ApiModelProperty(required = true, value = "A list of contact annotations")
  @NotNull

  @Valid

  public List<TextContactAnnotation> getTextContactAnnotations() {
    return textContactAnnotations;
  }

  public void setTextContactAnnotations(List<TextContactAnnotation> textContactAnnotations) {
    this.textContactAnnotations = textContactAnnotations;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TextContactAnnotationResponse textContactAnnotationResponse = (TextContactAnnotationResponse) o;
    return Objects.equals(this.textContactAnnotations, textContactAnnotationResponse.textContactAnnotations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(textContactAnnotations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TextContactAnnotationResponse {\n");
    
    sb.append("    textContactAnnotations: ").append(toIndentedString(textContactAnnotations)).append("\n");
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

