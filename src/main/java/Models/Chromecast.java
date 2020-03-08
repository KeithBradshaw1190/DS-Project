package Models;

public class Chromecast {
	private String deviceName, currentAppName;
	private boolean onOff, mute;
	private int volume;
	
	public Chromecast() {}

	public String getDeviceName() {
		return deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	public String getCurrentAppName() {
		return currentAppName;
	}

	public void setCurrentAppName(String currentAppName) {
		this.currentAppName = currentAppName;
	}

	public boolean isOnOff() {
		return onOff;
	}

	public void setOnOff(boolean onOff) {
		this.onOff = onOff;
	}

	public boolean isMute() {
		return mute;
	}

	public void setMute(boolean mute) {
		this.mute = mute;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	
}
