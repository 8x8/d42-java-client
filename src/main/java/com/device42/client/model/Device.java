package com.device42.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Device {
	private long id;
	private String name;
	private String hardwareModel;
	private String serialNo;
	private String assetNo;
	private String serviceLevel;
	private String type;
	private String virtualHostName;
	private String manufacturer;
	private String uuid;
	private String rack;
	private String[] tags;
	private IpAddress[] ipAddresses;
	private String customer;
	private String os;
	private String osarch;
	private String osver;
	private String osverno;


	public Device() {
	}

	public String getAssetNo() {
		return assetNo;
	}

	public String getHardwareModel() {
		return hardwareModel;
	}

	@JsonProperty("device_id")
	public long getId() {
		return id;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public String getName() {
		return name;
	}

	public String getRack() {
		return rack;
	}

	public String getSerialNo() {
		return serialNo;
	}

	public String getServiceLevel() {
		return serviceLevel;
	}

	public String getType() {
		return type;
	}

	public String getUuid() {
		return uuid;
	}

	public String getVirtualHostName() {
		return virtualHostName;
	}

	public void setAssetNo(String assetNo) {
		this.assetNo = assetNo;
	}

	public void setHardwareModel(String hardwareModel) {
		this.hardwareModel = hardwareModel;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setRack(String rack) {
		this.rack = rack;
	}

	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}

	public void setServiceLevel(String serviceLevel) {
		this.serviceLevel = serviceLevel;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public void setVirtualHostName(String virtualHostName) {
		this.virtualHostName = virtualHostName;
	}

	@Override
	public String toString() {
		return "Device [id=" + id + ", name=" + name + ", hardwareModel=" + hardwareModel + ", serialNo=" + serialNo
				+ ", assetNo=" + assetNo + ", serviceLevel=" + serviceLevel + ", type=" + type + ", virtualHostName="
				+ virtualHostName + ", manufacturer=" + manufacturer + ", uuid=" + uuid + ", rack=" + rack
				+ ", customer=" + customer + ", tags=" + tags + ", os=" + os + ", osarch=" + osarch + ", osver="
				+ osver + ", osverno=" + osverno + "]";
	}

	public String[] getTags() {
		return tags;
	}

	public void setTags(String[] tags) {
		this.tags = tags;
	}

	public IpAddress[] getIpAddresses() {
		return ipAddresses;
	}

	@JsonProperty("ip_addresses")
	public void setIpAddresses(IpAddress[] ipAddresses) {
		this.ipAddresses = ipAddresses;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public String getOsarch() {
		return osarch;
	}

	public void setOsarch(String osarch) {
		this.osarch = osarch;
	}

	public String getOsver() {
		return osver;
	}

	public void setOsver(String osver) {
		this.osver = osver;
	}

	public String getOsverno() {
		return osverno;
	}

	public void setOsverno(String osverno) {
		this.osverno = osverno;
	}
}
