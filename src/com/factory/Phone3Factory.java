package com.factory;

import com.factory.impl.Phone1;
import com.factory.impl.Phone3;

public class Phone3Factory implements AbstarctPhoneFactory {

	private String ram;
	private String storage;
	private String processor;
	private boolean isBluetoothEnabled;
	private boolean isWiFiEnabled;

	public Phone3Factory(String ram, String storage, String processor, boolean isBluetoothEnabled, boolean isWiFiEnabled) {
		super();
		this.ram = ram;
		this.storage = storage;
		this.processor = processor;
		this.isBluetoothEnabled = isBluetoothEnabled;
		this.isWiFiEnabled = isWiFiEnabled;
	}
	
	@Override
	public Phone createPhone() {
		return  new Phone3(ram, storage, processor, isBluetoothEnabled, isWiFiEnabled);
	}

}
