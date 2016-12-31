package com.mgd.appliance;

public class Light{
	private static final int MIN_LIGHT_LEVEL = 0;
	private static final int MAX_LIGHT_LEVEL = 100;

	private String room;
	private boolean on; 
	private int level;
	private int [] colour;

	public Light(String room, int [] colour) {
		if(colour.length != 3){
			System.out.println("Invalid size for colour value!");
			throw new RuntimeException();
		}

		this.room = room;
		this.colour = colour;
		on = false;
		level = MIN_LIGHT_LEVEL;
	}

	public boolean getIsOn() { return on; }
	public int getLevel() { return level; }
	public float getRed() { return colour[0]; }
	public float getGreen() { return colour[1]; }
	public float getBlue() { return colour[2]; }

	public void turnOn (){ 
		on = true; 
		System.out.println("The " + room + " light is on");
	}
	public void turnOff(){
		on = false; 
		System.out.println("The " + room + " light is off");
	}
	public void setRed(int red) {
		colour[0] = red;
		System.out.println("The " + room + " red value is set to " + red);
	}
	public void setGreen(int green) { 
		colour[1] = green;
		System.out.println("The " + room + " green value is set to " + green);
	}
	public void setBlue(int blue) {
		colour[2] = blue;
		System.out.println("The " + room + " blue value is set to " + blue);
	}
	public void setLevel(int level) { 
		this.level = getClampedLevel(level);
		System.out.println("The " + room + " level is set to " + this.level);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("<-------------------LIGHT------------------->\n");
		builder.append("Location: " + room + "\n");
		builder.append("Is On: " + (on ? "Yes" : "No") + "\n");
		builder.append("Level: " + level + "\n");
		builder.append("Colour [R, G, B]: [" + colour[0] + ", " + colour[1] + ", " + colour[2] + "]\n");
		builder.append("=============================================\n");
		return builder.toString();
	}

	private int getClampedLevel(int level){
		if(level <= MIN_LIGHT_LEVEL) return MIN_LIGHT_LEVEL;
		if(level >= MAX_LIGHT_LEVEL) return MAX_LIGHT_LEVEL;
		return level;
	}
}
