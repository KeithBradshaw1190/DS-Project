package Models;

public class TV {
	private String device,deviceName, currentChannel;
	private boolean on;
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

	public boolean isOn() {
		return on;
	}

	public void setOn(boolean on) {
		this.on = on;
	}


	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}
	
}
