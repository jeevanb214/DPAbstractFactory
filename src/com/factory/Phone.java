package com.factory;

public interface Phone {

	public abstract String ram();
	public abstract String storage();
	public abstract String processor();
	
	public boolean isBluetoothEnabled();
	public boolean isWiFiEnabled();
	
	
}

