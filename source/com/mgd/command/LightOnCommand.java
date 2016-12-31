package com.mgd.command;

import com.mgd.appliance.Light;

public class LightOnCommand implements Command {
	private Light light;

	public LightOnCommand(Light light){
		this.light = light;
	}

	@Override
	public void execute() {
		light.turnOn();
		light.setLevel(30);
	}
}
