package br.com.xandecoelho5.mediator.translate.model;

import br.com.xandecoelho5.mediator.translate.mediator.Mediator;

public class EnglishUser extends User {

	public EnglishUser(String name, Mediator mediator) {
		super(name, mediator, Language.ENGLISH);
	}
	
}
