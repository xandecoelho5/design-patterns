package br.com.xandecoelho5.abstractfactory.apple.factory;

import br.com.xandecoelho5.abstractfactory.apple.factory.abstractFactory.CountryRulesAbstractFactory;
import br.com.xandecoelho5.abstractfactory.apple.model.iphone.IPhone;
import br.com.xandecoelho5.abstractfactory.apple.model.iphone.IPhone11;
import br.com.xandecoelho5.abstractfactory.apple.model.iphone.IPhone11Pro;

public class IPhone11Factory extends IPhoneFactory {

	public IPhone11Factory(CountryRulesAbstractFactory rules) {
		super(rules);
	}

	public IPhone createIPhone(String level) {
		if(level.equals("standard")) {
			return new IPhone11(rules);
		} else if(level.equals("highEnd")) {
			return new IPhone11Pro(rules);
		} else return null;
	}

}
