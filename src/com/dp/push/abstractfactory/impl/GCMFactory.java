package com.dp.push.abstractfactory.impl;

import com.dp.push.abstractfactory.MessageAbstractFactory;
import com.dp.push.abstractfactory.enumeration.PushType;
import com.dp.push.abstractfactory.model.PushNotification;

/**
 * @author syedshahul.
 */
public class GCMFactory implements MessageAbstractFactory {
	private PushNotification pushNotification;

	public GCMFactory(final PushNotification pushNotification) {
		this.pushNotification = pushNotification;
	}

	@Override
	public Message generate() {
		System.out.println("GCMFactory->generate starts...");
		GCM gcm = new GCM(PushType.GCM, pushNotification);
		gcm.init();
		gcm.process();
		gcm.postProcess();
		System.out.println("GCMFactory->generate ends ");
		return gcm;
	}
}
