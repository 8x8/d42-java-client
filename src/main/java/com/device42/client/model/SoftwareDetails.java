package com.device42.client.model;

public class SoftwareDetails {

  private Boolean countInLicensing;
  private String device;
  private String deviceId;
  private String firstDetected;
  private long id;
  private String installDate;
  private String lastUpdated;
  private String licenseUseCount;
  private String software;
  private String softwareAlias;
  private String softwareId;
  private String user;
  private String userId;
  private String vendor;
  private String vendorId;
  private String version;

  public Boolean getCountInLicensing() {
    return countInLicensing;
  }

  public void setCountInLicensing(Boolean countInLicensing) {
    this.countInLicensing = countInLicensing;
  }

  public String getDevice() {
    return device;
  }

  public void setDevice(String device) {
    this.device = device;
  }

  public String getDeviceId() {
    return deviceId;
  }

  public void setDeviceId(String deviceId) {
    this.deviceId = deviceId;
  }

  public String getFirstDetected() {
    return firstDetected;
  }

  public void setFirstDetected(String firstDetected) {
    this.firstDetected = firstDetected;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getInstallDate() {
    return installDate;
  }

  public void setInstallDate(String installDate) {
    this.installDate = installDate;
  }

  public String getLastUpdated() {
    return lastUpdated;
  }

  public void setLastUpdated(String lastUpdated) {
    this.lastUpdated = lastUpdated;
  }

  public String getLicenseUseCount() {
    return licenseUseCount;
  }

  public void setLicenseUseCount(String licenseUseCount) {
    this.licenseUseCount = licenseUseCount;
  }

  public String getSoftware() {
    return software;
  }

  public void setSoftware(String software) {
    this.software = software;
  }

  public String getSoftwareAlias() {
    return softwareAlias;
  }

  public void setSoftwareAlias(String softwareAlias) {
    this.softwareAlias = softwareAlias;
  }

  public String getSoftwareId() {
    return softwareId;
  }

  public void setSoftwareId(String softwareId) {
    this.softwareId = softwareId;
  }

  public String getUser() {
    return user;
  }

  public void setUser(String user) {
    this.user = user;
  }

  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public String getVendor() {
    return vendor;
  }

  public void setVendor(String vendor) {
    this.vendor = vendor;
  }

  public String getVendorId() {
    return vendorId;
  }

  public void setVendorId(String vendorId) {
    this.vendorId = vendorId;
  }

  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }


  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("SoftwareDetails{");
    sb.append("countInLicensing=").append(countInLicensing);
    sb.append(", device='").append(device).append('\'');
    sb.append(", deviceId='").append(deviceId).append('\'');
    sb.append(", firstDetected='").append(firstDetected).append('\'');
    sb.append(", id=").append(id);
    sb.append(", installDate='").append(installDate).append('\'');
    sb.append(", lastUpdated='").append(lastUpdated).append('\'');
    sb.append(", licenseUseCount='").append(licenseUseCount).append('\'');
    sb.append(", software='").append(software).append('\'');
    sb.append(", softwareAlias='").append(softwareAlias).append('\'');
    sb.append(", softwareId='").append(softwareId).append('\'');
    sb.append(", user='").append(user).append('\'');
    sb.append(", userId='").append(userId).append('\'');
    sb.append(", vendor='").append(vendor).append('\'');
    sb.append(", vendorId='").append(vendorId).append('\'');
    sb.append(", version='").append(version).append('\'');
    sb.append('}');
    return sb.toString();
  }
}
