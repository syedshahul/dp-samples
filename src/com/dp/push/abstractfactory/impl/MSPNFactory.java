package com.dp.push.abstractfactory.impl;

import com.dp.push.abstractfactory.MessageAbstractFactory;
import com.dp.push.abstractfactory.enumeration.PushType;
import com.dp.push.abstractfactory.model.PushNotification;

/**
 * @author syedshahul.
 */
public class MSPNFactory implements MessageAbstractFactory {
	private PushNotification pushNotification;

	public MSPNFactory(final PushNotification pushNotification) {
		this.pushNotification = pushNotification;
	}

	@Override
	public Message generate() {
		System.out.println("MSPNFactory->generate ");
		MSPN mspn =  new MSPN(PushType.MSPN, pushNotification);
		mspn.init();
		mspn.process();
		mspn.postProcess();
		mspn.push();
		System.out.println("MSPNFactory->generate ends ");
		return mspn;
	}
}
