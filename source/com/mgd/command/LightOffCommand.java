package com.mgd.command;

import com.mgd.appliance.Light;

public class LightOffCommand implements Command{
	private Light light;

	public LightOffCommand(Light light){
		this.light = light;
	}

	@Override
	public void execute() {
		light.turnOff();
	}
}
