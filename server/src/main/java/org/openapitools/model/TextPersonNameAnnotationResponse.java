package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.TextPersonNameAnnotation;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The response to a person names annotation request
 */
@ApiModel(description = "The response to a person names annotation request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-08-11T13:52:26.252409-07:00[America/Los_Angeles]")
public class TextPersonNameAnnotationResponse   {
  @JsonProperty("textPersonNameAnnotations")
  @Valid
  private List<TextPersonNameAnnotation> textPersonNameAnnotations = new ArrayList<>();

  public TextPersonNameAnnotationResponse textPersonNameAnnotations(List<TextPersonNameAnnotation> textPersonNameAnnotations) {
    this.textPersonNameAnnotations = textPersonNameAnnotations;
    return this;
  }

  public TextPersonNameAnnotationResponse addTextPersonNameAnnotationsItem(TextPersonNameAnnotation textPersonNameAnnotationsItem) {
    this.textPersonNameAnnotations.add(textPersonNameAnnotationsItem);
    return this;
  }

  /**
   * A list of person name annotations
   * @return textPersonNameAnnotations
  */
  @ApiModelProperty(required = true, value = "A list of person name annotations")
  @NotNull

  @Valid

  public List<TextPersonNameAnnotation> getTextPersonNameAnnotations() {
    return textPersonNameAnnotations;
  }

  public void setTextPersonNameAnnotations(List<TextPersonNameAnnotation> textPersonNameAnnotations) {
    this.textPersonNameAnnotations = textPersonNameAnnotations;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TextPersonNameAnnotationResponse textPersonNameAnnotationResponse = (TextPersonNameAnnotationResponse) o;
    return Objects.equals(this.textPersonNameAnnotations, textPersonNameAnnotationResponse.textPersonNameAnnotations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(textPersonNameAnnotations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TextPersonNameAnnotationResponse {\n");
    
    sb.append("    textPersonNameAnnotations: ").append(toIndentedString(textPersonNameAnnotations)).append("\n");
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

