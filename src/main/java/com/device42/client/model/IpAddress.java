package com.device42.client.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *   "ip_addresses": [
 *     {
 *       "ip": "10.1.10.11",
 *       "label": "",
 *       "macaddress": "00:14:bf:aa:46:18",
 *       "subnet": "Infra-10.1.10.0/24(Infrastructure Services)",
 *       "subnet_id": "4",
 *       "type": "1"
 *     }
 *   ],
 */
public class IpAddress {

  private String ip;
  private String label;
  private String macaddress;
  private String subnet;
  private String subnet_id;
  private String type;

  public String getIp() {
    return ip;
  }

  public void setIp(String ip) {
    this.ip = ip;
  }

  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public String getMacaddress() {
    return macaddress;
  }

  public void setMacaddress(String macaddress) {
    this.macaddress = macaddress;
  }

  public String getSubnet() {
    return subnet;
  }

  public void setSubnet(String subnet) {
    this.subnet = subnet;
  }

  public String getSubnet_id() {
    return subnet_id;
  }

  public void setSubnet_id(String subnet_id) {
    this.subnet_id = subnet_id;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


}
