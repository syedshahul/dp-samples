package com.dp.push.abstractfactory.model;


/**
 * @author syedshahul.
 */
public class PushNotification {
	private String text;
	private String pushType;
	private String sender;
	private String deviceType;
	private String deviceToken;

	public PushNotification(final String text, final String sender,
	                        final String deviceType, final String deviceToken) {
		this.text = text;
		this.sender = sender;
		this.deviceType = deviceType;
		this.deviceToken = deviceToken;
	}

	public String getText() {
		return text;
	}

	public void setText(final String text) {
		this.text = text;
	}

	public String getPushType() {
		return pushType;
	}

	public void setPushType(final String pushType) {
		this.pushType = pushType;
	}

	public String getSender() {
		return sender;
	}

	public void setSender(final String sender) {
		this.sender = sender;
	}

	public String getDeviceType() {
		return deviceType;
	}

	public void setDeviceType(final String deviceType) {
		this.deviceType = deviceType;
	}

	public String getDeviceToken() {
		return deviceToken;
	}

	public void setDeviceToken(final String deviceToken) {
		this.deviceToken = deviceToken;
	}

	@Override
	public String toString() {
		return "PushNotification{" +
				"text='" + text + '\'' +
				", pushType='" + pushType + '\'' +
				", sender='" + sender + '\'' +
				", deviceType='" + deviceType + '\'' +
				", deviceToken='" + deviceToken + '\'' +
				'}';
	}
}
