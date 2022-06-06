package br.com.xandecoelho5.abstractfactory.apple.factory.abstractFactory;

import br.com.xandecoelho5.abstractfactory.apple.model.certificate.Certificate;
import br.com.xandecoelho5.abstractfactory.apple.model.packing.Packing;

public interface CountryRulesAbstractFactory {
	Certificate getCertificates();
	
	Packing getPacking();
}
