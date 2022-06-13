package br.com.xandecoelho5.command.alexa.commands;

import br.com.xandecoelho5.command.alexa.lights.GenericLight;

public class TurnLightOnCommand implements Command {
	private final GenericLight light;

	public TurnLightOnCommand(GenericLight light) {
		this.light = light;
	}

	@Override
	public void execute() {
		light.turnOn();
	}
}
