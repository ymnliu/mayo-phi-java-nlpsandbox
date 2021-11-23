package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.Tool;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A list of tool dependencies
 */
@ApiModel(description = "A list of tool dependencies")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-08-11T13:52:26.252409-07:00[America/Los_Angeles]")
public class ToolDependencies   {
  @JsonProperty("tools")
  @Valid
  private List<Tool> tools = new ArrayList<>();

  public ToolDependencies tools(List<Tool> tools) {
    this.tools = tools;
    return this;
  }

  public ToolDependencies addToolsItem(Tool toolsItem) {
    this.tools.add(toolsItem);
    return this;
  }

  /**
   * A list of tools
   * @return tools
  */
  @ApiModelProperty(required = true, value = "A list of tools")
  @NotNull

  @Valid

  public List<Tool> getTools() {
    return tools;
  }

  public void setTools(List<Tool> tools) {
    this.tools = tools;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolDependencies toolDependencies = (ToolDependencies) o;
    return Objects.equals(this.tools, toolDependencies.tools);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tools);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolDependencies {\n");
    
    sb.append("    tools: ").append(toIndentedString(tools)).append("\n");
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

