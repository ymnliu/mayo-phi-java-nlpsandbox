package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.TextDateAnnotation;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The response to a dates annotation request
 */
@ApiModel(description = "The response to a dates annotation request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-08-11T13:52:26.252409-07:00[America/Los_Angeles]")
public class TextDateAnnotationResponse   {
  @JsonProperty("textDateAnnotations")
  @Valid
  private List<TextDateAnnotation> textDateAnnotations = new ArrayList<>();

  public TextDateAnnotationResponse textDateAnnotations(List<TextDateAnnotation> textDateAnnotations) {
    this.textDateAnnotations = textDateAnnotations;
    return this;
  }

  public TextDateAnnotationResponse addTextDateAnnotationsItem(TextDateAnnotation textDateAnnotationsItem) {
    this.textDateAnnotations.add(textDateAnnotationsItem);
    return this;
  }

  /**
   * A list of date annotations
   * @return textDateAnnotations
  */
  @ApiModelProperty(required = true, value = "A list of date annotations")
  @NotNull

  @Valid

  public List<TextDateAnnotation> getTextDateAnnotations() {
    return textDateAnnotations;
  }

  public void setTextDateAnnotations(List<TextDateAnnotation> textDateAnnotations) {
    this.textDateAnnotations = textDateAnnotations;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TextDateAnnotationResponse textDateAnnotationResponse = (TextDateAnnotationResponse) o;
    return Objects.equals(this.textDateAnnotations, textDateAnnotationResponse.textDateAnnotations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(textDateAnnotations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TextDateAnnotationResponse {\n");
    
    sb.append("    textDateAnnotations: ").append(toIndentedString(textDateAnnotations)).append("\n");
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

