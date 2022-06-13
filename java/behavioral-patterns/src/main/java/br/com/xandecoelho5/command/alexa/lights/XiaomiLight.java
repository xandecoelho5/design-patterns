package br.com.xandecoelho5.command.alexa.lights;

public class XiaomiLight implements GenericLight {
	
	public void turnOn() {
		System.out.println("The XiaomiLight is On");
	}
	
	public void turnOff() {
		System.out.println("The XiaomiLight is Off");
	}
}
