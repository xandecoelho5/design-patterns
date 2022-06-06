package br.com.xandecoelho5.abstractfactory.apple.factory;

import br.com.xandecoelho5.abstractfactory.apple.factory.abstractFactory.CountryRulesAbstractFactory;
import br.com.xandecoelho5.abstractfactory.apple.model.iphone.IPhone;
import br.com.xandecoelho5.abstractfactory.apple.model.iphone.IPhoneX;
import br.com.xandecoelho5.abstractfactory.apple.model.iphone.IPhoneXSMax;

public class IPhoneXFactory extends IPhoneFactory {

	public IPhoneXFactory(CountryRulesAbstractFactory rules) {
		super(rules);
	}

	public IPhone createIPhone(String level) {
		if(level.equals("standard")) {
			return new IPhoneX(rules);
		} else if(level.equals("highEnd")) {
			return new IPhoneXSMax(rules);
		} else return null;
	}

}
