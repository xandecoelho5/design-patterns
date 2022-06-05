package br.com.xandecoelho5.factory.apple.model;

public class IPhone11Pro extends IPhone {

	@Override
	public void getHardware() {
		System.out.println("Hardware list IPhone11Pro");
		System.out.println("\t- 6.5in Screen");
		System.out.println("\t- A13 Chipset");
		System.out.println("\t- 4Gb RAM");
		System.out.println("\t- 512Gb Memory");
	}
}
