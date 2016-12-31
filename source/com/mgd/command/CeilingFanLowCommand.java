package com.mgd.command;

import com.mgd.appliance.CeilingFan;
import com.mgd.appliance.CeilingFan.FanSpeed;

public class CeilingFanLowCommand implements Command {
	private CeilingFan fan;

	public CeilingFanLowCommand(CeilingFan fan){
		this.fan = fan;
	}

	@Override
	public void execute(){
		fan.setSpeed(FanSpeed.LOW);
	}
}
