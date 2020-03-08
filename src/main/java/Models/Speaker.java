package Models;

public class Speaker {
private String deviceName;
private boolean onOff, mute;
private int volume;

public Speaker() {
	
}

public String getDeviceName() {
	return deviceName;
}

public void setDeviceName(String deviceName) {
	this.deviceName = deviceName;
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


