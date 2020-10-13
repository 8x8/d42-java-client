package com.device42.client.parser;

import com.device42.client.model.Device;
import com.device42.client.model.SoftwareDetails;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BasicSoftwareDetailsJsonParser implements JsonObjectParser<SoftwareDetails>  {

  private static Logger logger = LoggerFactory.getLogger(BasicSoftwareDetailsJsonParser.class);

  @Override
  public SoftwareDetails parse(JSONObject json) throws JSONException {
    logger.debug(json.toString());
    SoftwareDetails softwareDetails = new SoftwareDetails();
    softwareDetails.setId(json.getLong("device_id"));
    softwareDetails.setVersion(json.getString("version"));

    softwareDetails.setDevice(json.getString("device"));
    softwareDetails.setFirstDetected(json.getString("first_detected"));
    softwareDetails.setInstallDate(json.getString("install_date"));
    softwareDetails.setLastUpdated(json.getString("last_updated"));
    softwareDetails.setLicenseUseCount(json.getString("license_use_count"));
    softwareDetails.setSoftware(json.getString("software"));
    softwareDetails.setSoftwareAlias(json.getString("software_alias"));
    softwareDetails.setSoftwareId(json.getString("software_id"));
    softwareDetails.setUser(json.getString("user"));
    softwareDetails.setUserId(json.getString("user_id"));
    softwareDetails.setVendor(json.getString("vendor"));
    softwareDetails.setVendorId(json.getString("vendor_id"));

    String cil =json.getString("count_in_licensing");
    if(cil.toLowerCase().equals("true")) {
      softwareDetails.setCountInLicensing(true);
    } else {
      softwareDetails.setCountInLicensing(false);
    }


    return softwareDetails;
  }
}
