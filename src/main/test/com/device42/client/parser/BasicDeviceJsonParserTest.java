package com.device42.client.parser;

import static org.junit.jupiter.api.Assertions.*;

import com.device42.client.model.Device;
import com.device42.client.model.IpAddress;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class BasicDeviceJsonParserTest {
  private static Logger logger = LoggerFactory.getLogger(BasicDeviceJsonParserTest.class);

  private ObjectMapper mapper = new ObjectMapper();
  private BasicDeviceJsonParser parser;
  private Device device = new Device();
  @BeforeEach
  void setUp() {
    parser = new BasicDeviceJsonParser();
    device.setId(1);
    device.setTags(new String[0]);
  }

  @Test
  void parse() throws JsonProcessingException, JSONException {
    String json = mapper.writeValueAsString(device);
    JSONObject jsonObject = new JSONObject(json);
    Device result = parser.parse(jsonObject);
    assertEquals(device.getId(), result.getId());
  }


  @Test
  void parseIpAddress() throws JsonProcessingException, JSONException {
    IpAddress[] ipAddresses = new IpAddress[3];
    IpAddress ipAddress = new IpAddress();
    ipAddress.setIp("10.10.10.10");
    ipAddress.setMacaddress("test");
    ipAddresses[0] = ipAddress;
    ipAddresses[1] = ipAddress;
    ipAddresses[2] = ipAddress;
    device.setIpAddresses(ipAddresses);
    String json = mapper.writeValueAsString(device);

    System.out.println(json);
    JSONObject jsonObject = new JSONObject(json);
    Device result = parser.parse(jsonObject);
    assertEquals(device.getId(), result.getId());
    assertEquals(device.getIpAddresses().length, result.getIpAddresses().length);
    assertEquals(device.getIpAddresses()[0].getIp(), result.getIpAddresses()[0].getIp());
  }

}