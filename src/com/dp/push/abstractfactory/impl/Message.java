package com.dp.push.abstractfactory.impl;

import com.dp.push.abstractfactory.model.PushNotification;

/**
 * @author syedshahul.
 */
public abstract class Message {

	protected abstract void init();
	protected abstract void process();
	protected abstract void postProcess();
	protected abstract void push();
	protected abstract String getType();
	protected abstract PushNotification getMessage();

	@Override
	public String toString(){
		return this.getMessage().toString();
	}
}
