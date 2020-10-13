package com.device42.client.parser;

import com.device42.client.model.Device;
import com.device42.client.model.SoftwareDetails;
import java.util.ArrayList;
import java.util.List;
import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BasicSoftwareDetailsListJsonParser extends AbstractJsonObjectListParser<SoftwareDetails>  {

  private static Logger logger = LoggerFactory.getLogger(BasicSoftwareDetailsListJsonParser.class);
  private BasicSoftwareDetailsJsonParser softwareDetailsJsonParser = new BasicSoftwareDetailsJsonParser();

  @Override
  public List<SoftwareDetails> parse(JSONObject json) throws JSONException {
    JSONArray jsonArray = json.getJSONArray("software_details");
    storeLimits(json);
    List<SoftwareDetails> res = new ArrayList<>(jsonArray.length());
    for (int i = 0; i < jsonArray.length(); i++) {
      res.add(softwareDetailsJsonParser.parse(jsonArray.getJSONObject(i)));
    }
    return res;
  }
}
