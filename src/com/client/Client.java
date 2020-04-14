package com.client;

import com.factory.Phone1Factory;
import com.factory.Phone2Factory;
import com.factory.Phone3Factory;
import com.factory.PhoneFactory;

public class Client {

	public static void main(String[] args) {

		System.out.println(PhoneFactory.getPhone(new Phone1Factory("2", "2", "normal", false, false)));
		System.out.println(PhoneFactory.getPhone(new Phone2Factory("2", "2", "good", false, false)));
		System.out.println(PhoneFactory.getPhone(new Phone3Factory("6", "6", "Excellent", true, true)));

	}

}
