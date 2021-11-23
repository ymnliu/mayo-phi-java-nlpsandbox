package org.openapitools.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * The type of this tool
 */
public enum ToolType {
  
  CONTACT_ANNOTATOR("nlpsandbox:contact-annotator"),
  
  COVID_SYMPTOM_ANNOTATOR("nlpsandbox:covid-symptom-annotator"),
  
  DATA_NODE("nlpsandbox:data-node"),
  
  DATE_ANNOTATOR("nlpsandbox:date-annotator"),
  
  ID_ANNOTATOR("nlpsandbox:id-annotator"),
  
  LOCATION_ANNOTATOR("nlpsandbox:location-annotator"),
  
  PERSON_NAME_ANNOTATOR("nlpsandbox:person-name-annotator"),
  
  PHI_ANNOTATOR("nlpsandbox:phi-annotator"),
  
  PHI_DEIDENTIFIER("nlpsandbox:phi-deidentifier");

  private String value;

  ToolType(String value) {
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
  public static ToolType fromValue(String value) {
    for (ToolType b : ToolType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

