package com.mgd;

import com.mgd.appliance.*;

public class SmartHome{
	public static void main(String [] args){
		SmartHome home = new SmartHome();
		home.runSim();
	}

	private Light livingroomLight;

	public SmartHome(){
		livingroomLight = new Light("Living Room",
				new int [] {255, 255, 0});
	}

	public void runSim(){
		System.out.println(livingroomLight.toString());
	}
}
