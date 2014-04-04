package com.dp.push.abstractfactory.impl;

import com.dp.push.abstractfactory.MessageAbstractFactory;

/**
 * @author syedshahul.
 */
public class MessageFactory {
	public static Message getMessage(MessageAbstractFactory factory){
		return factory.generate();
	}
}
