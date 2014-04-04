package com.dp.push.abstractfactory.impl;

import com.dp.push.abstractfactory.enumeration.PushType;
import com.dp.push.abstractfactory.model.PushNotification;

/**
 * @author syedshahul.
 */
public class GCM extends Message {
	private PushType pushType;
  private PushNotification pushNotification;

	public GCM(PushType pushType, PushNotification pushNotification) {
		this.pushType = pushType;
		pushNotification.setPushType(pushType.name());
		this.pushNotification=pushNotification;
	}

	@Override
	protected void init() {
		System.out.println("GCM->init...");
	}

	@Override
	protected void process() {
		System.out.println("GCM->process...");
	}

	@Override
	protected void postProcess() {
		System.out.println("GCM->postProcess...");
	}

	@Override
	protected void push() {
		System.out.println("GCM->push...");
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
