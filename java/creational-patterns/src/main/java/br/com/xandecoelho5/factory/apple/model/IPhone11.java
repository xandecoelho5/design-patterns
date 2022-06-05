package br.com.xandecoelho5.factory.apple.model;

public class IPhone11 extends IPhone {

	@Override
	public void getHardware() {
		System.out.println("Hardware list IPhone11");
		System.out.println("\t- 6.1in Screen");
		System.out.println("\t- A13 Chipset");
		System.out.println("\t- 4Gb RAM");
		System.out.println("\t- 256Gb Memory");
	}
}
