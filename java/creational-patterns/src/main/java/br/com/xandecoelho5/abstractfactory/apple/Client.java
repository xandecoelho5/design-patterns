package br.com.xandecoelho5.abstractfactory.apple;

import br.com.xandecoelho5.abstractfactory.apple.factory.IPhone11Factory;
import br.com.xandecoelho5.abstractfactory.apple.factory.IPhoneFactory;
import br.com.xandecoelho5.abstractfactory.apple.factory.IPhoneXFactory;
import br.com.xandecoelho5.abstractfactory.apple.factory.abstractFactory.BrazilianRulesAbstractFactory;
import br.com.xandecoelho5.abstractfactory.apple.factory.abstractFactory.CountryRulesAbstractFactory;
import br.com.xandecoelho5.abstractfactory.apple.factory.abstractFactory.USRulesAbstractFactory;
import br.com.xandecoelho5.abstractfactory.apple.model.iphone.IPhone;

public class Client {
	
	public static void main(String[] args) {
		CountryRulesAbstractFactory rules = new BrazilianRulesAbstractFactory();
		IPhoneFactory iPhoneXFactory = new IPhoneXFactory(rules);
		IPhoneFactory iPhone11Factory = new IPhone11Factory(rules);
		IPhone iPhone;

		System.out.println("Ordering an brazilian Iphone11");
		iPhone = iPhone11Factory.orderIPhone("standard");

		System.out.println("\nOrdering a brazilian IphoneX");
		iPhone = iPhoneXFactory.orderIPhone("standard");

		rules = new USRulesAbstractFactory();
		iPhoneXFactory = new IPhoneXFactory(rules);
		iPhone11Factory = new IPhone11Factory(rules);

		System.out.println("\nOrdering an US Iphone11");
		iPhone = iPhone11Factory.orderIPhone("standard");

		System.out.println("\nOrdering a US IphoneX");
		iPhone = iPhoneXFactory.orderIPhone("standard");
	}
}
