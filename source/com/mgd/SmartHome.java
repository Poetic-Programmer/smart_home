package com.mgd;

import com.mgd.appliance.*;
import com.mgd.command.*;

public class SmartHome{
	public static void main(String [] args){
		SmartHome home = new SmartHome();
		home.runSim();
	}

	private Light livingroomLight;
	private CeilingFan ceilingFan;

	public SmartHome(){
		livingroomLight = new Light("Living Room",
				new int [] {255, 255, 0});
		ceilingFan = new CeilingFan("Living Room");
	}

	public void runSim(){
		Command lightOnCommand = new LightOnCommand(livingroomLight);
		Command lightOffCommand = new LightOffCommand(livingroomLight);
		Command ceilingFanLowCommand = new CeilingFanLowCommand(ceilingFan);

		lightOnCommand.execute();
		lightOffCommand.execute();
		ceilingFanLowCommand.execute();
	}
}
