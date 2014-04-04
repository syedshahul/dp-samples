package com.dp.push.abstractfactory.impl;

import com.dp.push.abstractfactory.enumeration.PushType;
import com.dp.push.abstractfactory.model.PushNotification;

/**
 * @author syedshahul.
 */
public class MSPN extends Message {
	private PushType pushType;
	private PushNotification pushNotification;

	public MSPN(PushType pushType, PushNotification pushNotification) {
		this.pushType = pushType;
		pushNotification.setPushType(pushType.name());
		this.pushNotification=pushNotification;
	}

	@Override
	protected void init() {
		System.out.println("MSPN->init...");
	}

	@Override
	protected void process() {
		System.out.println("MSPN->process...");
	}

	@Override
	protected void postProcess() {
		System.out.println("MSPN->postProcess...");
	}

	@Override
	protected void push() {
		System.out.println("MSPN->push...");
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
