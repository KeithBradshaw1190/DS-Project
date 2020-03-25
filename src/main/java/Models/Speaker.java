package Models;

public class Speaker {
private String device,deviceName;
private boolean On, mute;
private int volume;

public Speaker(){
		this.device="Speaker";
		this.On=true;
		this.deviceName="Custom Name";
		this.volume=20;
		this.mute=false;
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

public boolean isOn() {
	return On;
}

public void setOn(boolean On) {
	this.On = On;
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


