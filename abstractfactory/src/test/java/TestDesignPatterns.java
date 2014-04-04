import com.dp.push.abstractfactory.impl.APNSFactory;
import com.dp.push.abstractfactory.impl.GCMFactory;
import com.dp.push.abstractfactory.impl.Message;
import com.dp.push.abstractfactory.impl.MessageFactory;
import com.dp.push.abstractfactory.model.PushNotification;
import org.testng.annotations.Test;

/**
 * @author syedshahul.
 */
@Test
public class TestDesignPatterns {
	@Test
	public void testAbstractFactory() throws Exception {
		GCMFactory gcmFactory = new GCMFactory(new PushNotification("GCM push " +
				                                                            "text", "sender", "GCM",
		                                                            "gcm device " +
				                                                            "token" ));

		gcmFactory.generate();
		Message gcm = MessageFactory.getMessage(gcmFactory);
		System.out.println("Result gcm : "+gcm);

		APNSFactory apnsFactory = new APNSFactory(new PushNotification
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
