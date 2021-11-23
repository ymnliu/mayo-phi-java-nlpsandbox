package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;
import org.openapitools.model.License;
import org.openapitools.model.ToolType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Information about an NLP tool
 */
@ApiModel(description = "Information about an NLP tool")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-08-11T13:52:26.252409-07:00[America/Los_Angeles]")
public class Tool   {
  @JsonProperty("name")
  private String name;

  @JsonProperty("version")
  private String version;

  @JsonProperty("license")
  private License license;

  @JsonProperty("repository")
  private String repository;

  @JsonProperty("description")
  private String description;

  @JsonProperty("author")
  private String author;

  @JsonProperty("authorEmail")
  private String authorEmail;

  @JsonProperty("url")
  private URI url;

  @JsonProperty("type")
  private ToolType type;

  @JsonProperty("apiVersion")
  private String apiVersion;

  public Tool name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The tool name
   * @return name
  */
  @ApiModelProperty(required = true, value = "The tool name")
  @NotNull

@Pattern(regexp="^[a-z0-9]+(?:-[a-z0-9]+)*$") @Size(min=3,max=60) 
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Tool version(String version) {
    this.version = version;
    return this;
  }

  /**
   * The version of the tool (SemVer string)
   * @return version
  */
  @ApiModelProperty(required = true, value = "The version of the tool (SemVer string)")
  @NotNull

@Pattern(regexp="^(0|[1-9]\\d*)\\.(0|[1-9]\\d*)\\.(0|[1-9]\\d*)(?:-((?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*)(?:\\.(?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*))*))?(?:\\+([0-9a-zA-Z-]+(?:\\.[0-9a-zA-Z-]+)*))?$") @Size(min=1) 
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public Tool license(License license) {
    this.license = license;
    return this;
  }

  /**
   * Get license
   * @return license
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public License getLicense() {
    return license;
  }

  public void setLicense(License license) {
    this.license = license;
  }

  public Tool repository(String repository) {
    this.repository = repository;
    return this;
  }

  /**
   * The place where the code lives
   * @return repository
  */
  @ApiModelProperty(required = true, value = "The place where the code lives")
  @NotNull


  public String getRepository() {
    return repository;
  }

  public void setRepository(String repository) {
    this.repository = repository;
  }

  public Tool description(String description) {
    this.description = description;
    return this;
  }

  /**
   * A short, one-sentence summary of the tool
   * @return description
  */
  @ApiModelProperty(required = true, value = "A short, one-sentence summary of the tool")
  @NotNull

@Size(max=280) 
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Tool author(String author) {
    this.author = author;
    return this;
  }

  /**
   * The author of the tool
   * @return author
  */
  @ApiModelProperty(required = true, value = "The author of the tool")
  @NotNull


  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public Tool authorEmail(String authorEmail) {
    this.authorEmail = authorEmail;
    return this;
  }

  /**
   * The email address of the author
   * @return authorEmail
  */
  @ApiModelProperty(required = true, value = "The email address of the author")
  @NotNull

@javax.validation.constraints.Email
  public String getAuthorEmail() {
    return authorEmail;
  }

  public void setAuthorEmail(String authorEmail) {
    this.authorEmail = authorEmail;
  }

  public Tool url(URI url) {
    this.url = url;
    return this;
  }

  /**
   * The URL to the homepage of the tool
   * @return url
  */
  @ApiModelProperty(required = true, value = "The URL to the homepage of the tool")
  @NotNull

  @Valid

  public URI getUrl() {
    return url;
  }

  public void setUrl(URI url) {
    this.url = url;
  }

  public Tool type(ToolType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public ToolType getType() {
    return type;
  }

  public void setType(ToolType type) {
    this.type = type;
  }

  public Tool apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

  /**
   * The version of the tool OpenAPI specification
   * @return apiVersion
  */
  @ApiModelProperty(required = true, value = "The version of the tool OpenAPI specification")
  @NotNull

@Pattern(regexp="^(0|[1-9]\\d*)\\.(0|[1-9]\\d*)\\.(0|[1-9]\\d*)(?:-((?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*)(?:\\.(?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*))*))?(?:\\+([0-9a-zA-Z-]+(?:\\.[0-9a-zA-Z-]+)*))?$") @Size(min=1) 
  public String getApiVersion() {
    return apiVersion;
  }

  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Tool tool = (Tool) o;
    return Objects.equals(this.name, tool.name) &&
        Objects.equals(this.version, tool.version) &&
        Objects.equals(this.license, tool.license) &&
        Objects.equals(this.repository, tool.repository) &&
        Objects.equals(this.description, tool.description) &&
        Objects.equals(this.author, tool.author) &&
        Objects.equals(this.authorEmail, tool.authorEmail) &&
        Objects.equals(this.url, tool.url) &&
        Objects.equals(this.type, tool.type) &&
        Objects.equals(this.apiVersion, tool.apiVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, version, license, repository, description, author, authorEmail, url, type, apiVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Tool {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    license: ").append(toIndentedString(license)).append("\n");
    sb.append("    repository: ").append(toIndentedString(repository)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    authorEmail: ").append(toIndentedString(authorEmail)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
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

