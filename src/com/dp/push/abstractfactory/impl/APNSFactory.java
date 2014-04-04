package com.dp.push.abstractfactory.impl;

import com.dp.push.abstractfactory.MessageAbstractFactory;
import com.dp.push.abstractfactory.enumeration.PushType;
import com.dp.push.abstractfactory.model.PushNotification;

/**
 * @author syedshahul.
 */
public class APNSFactory implements MessageAbstractFactory{
	private PushNotification pushNotification;

	public APNSFactory(final PushNotification pushNotification) {
		this.pushNotification = pushNotification;
	}

	@Override
	public Message generate() {
		System.out.println("APNSFactory->generate ");
		APNS apns = new APNS(PushType.APNS, pushNotification);
		apns.init();
		apns.process();
		apns.postProcess();
		apns.push();
		System.out.println("APNSFactory->generate ends ");
		return apns;
	}
}
