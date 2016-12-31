package com.mgd.appliance;

public class CeilingFan{
	public enum FanSpeed{
		NONE,
		LOW,
		MEDIUM,
		HIGH
	};

	private String room;
	private boolean on;
	private FanSpeed speed;

	public CeilingFan(String room){
		this.room = room;

		on = false;
		speed = FanSpeed.NONE;
	}

	public FanSpeed getFanSpeed() { return speed; }
	public boolean getIsOn() { return on; }
	public String getRoom() { return room; }

	public void setSpeed(FanSpeed speed) { 
		this.speed = speed; 
		
		System.out.println("The " + room + " fan has been set to speed " 
				+ speed.name());
	}
	public void turnOn() {
		on = true; 
		System.out.println("The " + room + " fan is on");
	}
	public void turnOff() { 
		on = false; 
		System.out.println("The " + room + " fan is off");
	}
}


