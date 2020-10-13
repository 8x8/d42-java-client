package com.device42.client.parser;

import com.device42.client.model.Device;
import com.device42.client.model.IpAddress;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

public class BasicDeviceJsonParser implements JsonObjectParser<Device> {

  /**
   * todo: Note, this is a horrendous use of ObjectMapper. I just need to make progress!~
   */
  private ObjectMapper mapper = new ObjectMapper();

  @Override
  public Device parse(JSONObject json) throws JSONException {
    Device device = new Device();
    device.setId(json.getLong("device_id"));
    device.setName(json.getString("name"));
    device.setHardwareModel(json.has("hw_model") ? json.getString("hw_model") : "");
    device.setSerialNo(json.has("serial_no") ? json.getString("serial_no") : "");
    device.setAssetNo(json.has("asset_no") ? json.getString("asset_no") : "");
    device.setServiceLevel(json.has("service_level") ? json.getString("service_level") : "");
    device.setType(json.has("type") ? json.getString("type") : "");
    device.setVirtualHostName(
        json.has("virtual_host_name") ? json.getString("virtual_host_name") : "");
    device.setManufacturer(json.has("manufacturer") ? json.getString("manufacturer") : "");
    device.setUuid(json.has("uuid") ? json.getString("uuid") : "");
    device.setRack(json.has("rack") ? json.getString("rack") : "");
    device.setOs(json.has("os") ? json.getString("os") : "");
    device.setOsarch(json.has("osarch") ? json.getString("osarch") : "");
    device.setOsver(json.has("osver") ? json.getString("osver") : "");
    device.setOsverno(json.has("osverno") ? json.getString("osverno") : "");

    if (json.has("ip_addresses")) {
      String ipStr = json.getString("ip_addresses");
      if (ipStr != null) {
        try {
          IpAddress[] ipAddresses = mapper.readValue(ipStr, IpAddress[].class);
          device.setIpAddresses(ipAddresses);
        } catch (JsonProcessingException e) {
          throw new JSONException(e);
        }
      }
    }

    if (json.has("tags")) {

      JSONArray tagsArray = json.getJSONArray("tags");
      String[] tags = new String[tagsArray.length()];
      for (int i = 0; i < tagsArray.length(); i++) {
        tags[i] = tagsArray.getString(i);
      }
      device.setTags(tags);
    }
    return device;
  }
}
