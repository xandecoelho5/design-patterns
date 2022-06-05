package br.com.xandecoelho5.factory.apple;

import br.com.xandecoelho5.factory.apple.factory.IPhoneFactory;
import br.com.xandecoelho5.factory.apple.model.IPhone;
import br.com.xandecoelho5.factory.apple.model.enums.IPhoneType;
import br.com.xandecoelho5.factory.apple.model.enums.IPhoneVersion;

public class Client {
	
	public static void main(String[] args) {
		IPhone iPhone;

		iPhone = IPhoneFactory.createIPhone(IPhoneVersion.V_11, IPhoneType.STANDARD);
		iPhone.getHardware();
		System.out.println("#######################################################");

		iPhone = IPhoneFactory.createIPhone(IPhoneVersion.V_11, IPhoneType.HIGHEND);
		iPhone.getHardware();
		System.out.println("#######################################################");

		iPhone = IPhoneFactory.createIPhone(IPhoneVersion.V_X, IPhoneType.STANDARD);
		iPhone.getHardware();
		System.out.println("#######################################################");

		iPhone = IPhoneFactory.createIPhone(IPhoneVersion.V_X, IPhoneType.HIGHEND);
		iPhone.getHardware();
	}
}
