package com.dp.push.abstractfactory.impl;

import com.dp.push.abstractfactory.model.PushNotification;
import com.dp.push.abstractfactory.enumeration.PushType;

/**
 * @author syedshahul.
 */
public class APNS extends Message {
	private PushType pushType;
	private PushNotification pushNotification;

	public APNS(PushType pushType, PushNotification pushNotification) {
		this.pushType = pushType;
		pushNotification.setPushType(pushType.name());
		this.pushNotification=pushNotification;
	}

	@Override
	protected void init() {
		System.out.println("APNS->init...");
	}

	@Override
	protected void process() {
		System.out.println("APNS->process...");
	}

	@Override
	protected void postProcess() {
		System.out.println("APNS->postProcess...");
	}

	@Override
	protected void push() {
		System.out.println("APNS->push...");
	}

	@Override
	protected String getType() {
		return this.pushType.name();
	}

	@Override
	protected PushNotification getMessage() {
		return this.pushNotification;
	}

	public PushType getPushType() {
		return pushType;
	}

	public void setPushType(final PushType pushType) {
		this.pushType = pushType;
	}

	public PushNotification getPushNotification() {
		return pushNotification;
	}

	public void setPushNotification(final PushNotification pushNotification) {
		this.pushNotification = pushNotification;
	}
}
