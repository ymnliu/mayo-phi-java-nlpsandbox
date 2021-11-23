package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.TextLocationAnnotation;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The response to a locations annotation request
 */
@ApiModel(description = "The response to a locations annotation request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-08-11T13:52:26.252409-07:00[America/Los_Angeles]")
public class TextLocationAnnotationResponse   {
  @JsonProperty("textLocationAnnotations")
  @Valid
  private List<TextLocationAnnotation> textLocationAnnotations = new ArrayList<>();

  public TextLocationAnnotationResponse textLocationAnnotations(List<TextLocationAnnotation> textLocationAnnotations) {
    this.textLocationAnnotations = textLocationAnnotations;
    return this;
  }

  public TextLocationAnnotationResponse addTextLocationAnnotationsItem(TextLocationAnnotation textLocationAnnotationsItem) {
    this.textLocationAnnotations.add(textLocationAnnotationsItem);
    return this;
  }

  /**
   * A list of location annotations
   * @return textLocationAnnotations
  */
  @ApiModelProperty(required = true, value = "A list of location annotations")
  @NotNull

  @Valid

  public List<TextLocationAnnotation> getTextLocationAnnotations() {
    return textLocationAnnotations;
  }

  public void setTextLocationAnnotations(List<TextLocationAnnotation> textLocationAnnotations) {
    this.textLocationAnnotations = textLocationAnnotations;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TextLocationAnnotationResponse textLocationAnnotationResponse = (TextLocationAnnotationResponse) o;
    return Objects.equals(this.textLocationAnnotations, textLocationAnnotationResponse.textLocationAnnotations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(textLocationAnnotations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TextLocationAnnotationResponse {\n");
    
    sb.append("    textLocationAnnotations: ").append(toIndentedString(textLocationAnnotations)).append("\n");
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

