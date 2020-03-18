package Models;

public class TV {
	private String device,deviceName, currentChannel;
	private boolean onOff;
	private int volume;
	
	public TV() {
		this.device="TV";

	}
	
	
	public String getDevice() {
		return device;
	}

	public void setDevice(String device) {
		this.device = device;
	}

	

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


	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}
	
}
