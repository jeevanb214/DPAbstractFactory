package com.factory;

import com.factory.impl.Phone1;
import com.factory.impl.Phone2;
import com.factory.impl.Phone3;

public class PhoneFactory {

	public PhoneFactory() {

	}

	public static Phone getPhone(AbstarctPhoneFactory apf) {

		return apf.createPhone();
	}

}
