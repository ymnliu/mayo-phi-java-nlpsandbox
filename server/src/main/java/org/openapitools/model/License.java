package org.openapitools.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * The license (license keyword used by GitHub)
 */
public enum License {
  
  AFL_3_0("afl-3.0"),
  
  APACHE_2_0("apache-2.0"),
  
  ARTISTIC_2_0("artistic-2.0"),
  
  BSL_1_0("bsl-1.0"),
  
  BSD_2_CLAUSE("bsd-2-clause"),
  
  BSD_3_CLAUSE("bsd-3-clause"),
  
  BSD_3_CLAUSE_CLEAR("bsd-3-clause-clear"),
  
  CC("cc"),
  
  CC0_1_0("cc0-1.0"),
  
  CC_BY_4_0("cc-by-4.0"),
  
  CC_BY_SA_4_0("cc-by-sa-4.0"),
  
  WTFPL("wtfpl"),
  
  ECL_2_0("ecl-2.0"),
  
  EPL_1_0("epl-1.0"),
  
  EPL_2_0("epl-2.0"),
  
  EUPL_1_1("eupl-1.1"),
  
  AGPL_3_0("agpl-3.0"),
  
  GPL("gpl"),
  
  GPL_2_0("gpl-2.0"),
  
  GPL_3_0("gpl-3.0"),
  
  LGPL("lgpl"),
  
  LGPL_2_1("lgpl-2.1"),
  
  LGPL_3_0("lgpl-3.0"),
  
  ISC("isc"),
  
  LPPL_1_3C("lppl-1.3c"),
  
  MS_PL("ms-pl"),
  
  MIT("mit"),
  
  MPL_2_0("mpl-2.0"),
  
  OSL_3_0("osl-3.0"),
  
  POSTGRESQL("postgresql"),
  
  OFL_1_1("ofl-1.1"),
  
  NCSA("ncsa"),
  
  UNLICENSE("unlicense"),
  
  ZLIB("zlib"),
  
  NONE("none");

  private String value;

  License(String value) {
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
  public static License fromValue(String value) {
    for (License b : License.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

