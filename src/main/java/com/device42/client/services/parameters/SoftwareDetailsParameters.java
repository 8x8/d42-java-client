package com.device42.client.services.parameters;

import com.device42.client.util.Device42ClientException;
import com.device42.client.util.StringUtil;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SoftwareDetailsParameters  extends AbstractInputLimitParameters  {

  private static Logger logger = LoggerFactory.getLogger(SoftwareDetailsParameters.class);
  public static class SoftwareDetailsParametersBuilder {
    private static final String[] DEFAULT_COLUMNS = {
        "count_in_licensing", "device", "device_id", "first_detected", "id",
        "install_date", "last_updated", "license_use_count", "software", "software_alias",
        "user", "user_id", "vendor", "vendor_id", "version"
    };

    private List<String> columns;
    private Map<String, String> parameters;
    private int limit;
    private int offset;

    public SoftwareDetailsParametersBuilder() {
      this.columns = Arrays.asList(DEFAULT_COLUMNS);
      this.parameters = new HashMap<>();
    }

    public SoftwareDetailsParametersBuilder(List<String> columns) {
      if (columns == null || columns.isEmpty()) {
        throw new Device42ClientException("List device's columns must not be null or empty.");
      }
      this.columns = columns;
      this.parameters = new HashMap<>();
    }

    public SoftwareDetailsParameters build() {
      return new SoftwareDetailsParameters(columns, parameters, limit, offset);
    }

    public SoftwareDetailsParameters.SoftwareDetailsParametersBuilder limit(int limit) {
      this.limit = limit;
      return this;
    }

    public SoftwareDetailsParameters.SoftwareDetailsParametersBuilder offset(int offset) {
      this.offset = offset;
      return this;
    }

    public SoftwareDetailsParameters.SoftwareDetailsParametersBuilder parameter(String parameter, String value) {
      this.parameters.put(parameter, value);
      return this;
    }
  }

  private List<String> columns;
  private Map<String, String> parameters;


  private SoftwareDetailsParameters(
      List<String> columns,
      Map<String, String> parameters,
      int limit,
      int offset) {
    this.columns = columns;
    this.parameters = parameters;
    addLimit(limit);
    addOffset(offset);
  }

  @Override
  public Map<String, String> parametersMap() {
    Map<String, String> parametersMap = new HashMap<>();
    parametersMap.put("include_cols", StringUtil.stringJoin(",", columns));
    for (Map.Entry<String, String> parameterEntry : parameters.entrySet()) {
      parametersMap.put(parameterEntry.getKey(), parameterEntry.getValue());
    }
    addLimits(parametersMap);
    return parametersMap;
  }

}
