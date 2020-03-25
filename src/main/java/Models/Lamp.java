package Models;

public class Lamp {
	private String device,deviceName;
	private boolean on;
	private int brightness;
	
	public Lamp(){
		this.device="Lamp";
		this.on=true;
		this.deviceName="Custom Lamp Name";
		this.brightness=22;
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
		return on;
	}

	public void setOn(boolean on) {
		this.on = on;
	}

	public int getBrightness() {
		return brightness;
	}

	public void setBrightness(int brightness) {
		this.brightness = brightness;
	}
	
}
