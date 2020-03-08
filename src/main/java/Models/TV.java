package Models;

public class TV {
	private String deviceName, currentChannel;
	private boolean onOff, mute;
	private int volume;
	
	public TV() {}

	public String getDeviceName() {
		return deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	public String getCurrentChannel() {
		return currentChannel;
	}

	public void setCurrentChannel(String currentChannel) {
		this.currentChannel = currentChannel;
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
