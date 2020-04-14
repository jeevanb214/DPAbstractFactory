package com.factory.impl;

import com.factory.Phone;

public class Phone1 implements Phone {

	private String ram;
	private String storage;
	private String processor;
	private boolean isBluetoothEnabled;
	private boolean isWiFiEnabled;

	public Phone1(String ram, String storage, String processor, boolean isBluetoothEnabled, boolean isWiFiEnabled) {
		super();
		this.ram = ram;
		this.storage = storage;
		this.processor = processor;
		this.isBluetoothEnabled = isBluetoothEnabled;
		this.isWiFiEnabled = isWiFiEnabled;
	}

	@Override
	public String ram() {
		return this.ram;
	}

	@Override
	public String storage() {
		return this.storage;
	}

	@Override
	public String processor() {
		return this.processor;
	}

	@Override
	public boolean isBluetoothEnabled() {
		return this.isBluetoothEnabled;
	}

	@Override
	public boolean isWiFiEnabled() {
		return this.isWiFiEnabled;
	}

	@Override
	public String toString() {
		return "ram:" + ram + " storage:" + storage + " processor:" + processor + " isBluetoothEnabled:"
				+ isBluetoothEnabled + " isWiFiEnabled:" + isWiFiEnabled + "\n";
	}

}
