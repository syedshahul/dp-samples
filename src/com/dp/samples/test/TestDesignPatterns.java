package com.dp.samples.test;

import com.dp.push.abstractfactory.impl.APNSFactory;
import com.dp.push.abstractfactory.impl.GCM;
import com.dp.push.abstractfactory.impl.GCMFactory;
import com.dp.push.abstractfactory.impl.Message;
import com.dp.push.abstractfactory.impl.MessageFactory;
import com.dp.push.abstractfactory.model.PushNotification;
import com.dp.samples.abstractfactory.impl.Computer;
import com.dp.samples.abstractfactory.impl.ComputerFactory;
import com.dp.samples.abstractfactory.impl.PCFactory;
import com.dp.samples.abstractfactory.impl.ServerFactory;

/**
 * @author syedshahul.
 * @see :http://www.journaldev.com/1418/abstract-factory-design-pattern-in-java
 * @see : http://howtodoinjava.com/2012/10/29/abstract-factory-pattern-in-java/
 *
 */
public class TestDesignPatterns {

	public static void main(String[] args) {
		testAbstractFactory();
	}

	private static void testAbstractFactory() {
		Computer pc = ComputerFactory
				.getComputer(new PCFactory("2 GB", "500 GB", "2.4 GHz"));
		Computer server =ComputerFactory.getComputer(new ServerFactory("16 GB","1 TB","2.9 GHz"));
		System.out.println("AbstractFactory PC Config::"+pc);
		System.out.println("AbstractFactory Server Config::"+server);

		GCMFactory gcmFactory = new GCMFactory(new PushNotification("GCM push " +
				                                                            "text", "sender", "GCM",
		                                                            "gcm device " +
				                                    "token" ));

		gcmFactory.generate();
		Message gcm = MessageFactory.getMessage(gcmFactory);
		System.out.println("Result gcm : "+gcm);

	 APNSFactory apnsFactory = new APNSFactory(new
			                                           PushNotification
			                                           ("APNS push " +
					                                            "text",
			                                            "sender",
			                                            "APNS",
			                                            "APNS device " +
					                                            "token" ));

		apnsFactory.generate();

		Message apns = MessageFactory.getMessage(apnsFactory);
		System.out.println("Result apns : "+apns);
	}
}
