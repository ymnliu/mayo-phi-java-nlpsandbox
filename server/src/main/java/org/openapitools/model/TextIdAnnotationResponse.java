package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.TextIdAnnotation;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The response to an ID annotation request
 */
@ApiModel(description = "The response to an ID annotation request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-08-11T13:52:26.252409-07:00[America/Los_Angeles]")
public class TextIdAnnotationResponse   {
  @JsonProperty("textIdAnnotations")
  @Valid
  private List<TextIdAnnotation> textIdAnnotations = new ArrayList<>();

  public TextIdAnnotationResponse textIdAnnotations(List<TextIdAnnotation> textIdAnnotations) {
    this.textIdAnnotations = textIdAnnotations;
    return this;
  }

  public TextIdAnnotationResponse addTextIdAnnotationsItem(TextIdAnnotation textIdAnnotationsItem) {
    this.textIdAnnotations.add(textIdAnnotationsItem);
    return this;
  }

  /**
   * A list of ID annotations
   * @return textIdAnnotations
  */
  @ApiModelProperty(required = true, value = "A list of ID annotations")
  @NotNull

  @Valid

  public List<TextIdAnnotation> getTextIdAnnotations() {
    return textIdAnnotations;
  }

  public void setTextIdAnnotations(List<TextIdAnnotation> textIdAnnotations) {
    this.textIdAnnotations = textIdAnnotations;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TextIdAnnotationResponse textIdAnnotationResponse = (TextIdAnnotationResponse) o;
    return Objects.equals(this.textIdAnnotations, textIdAnnotationResponse.textIdAnnotations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(textIdAnnotations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TextIdAnnotationResponse {\n");
    
    sb.append("    textIdAnnotations: ").append(toIndentedString(textIdAnnotations)).append("\n");
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

