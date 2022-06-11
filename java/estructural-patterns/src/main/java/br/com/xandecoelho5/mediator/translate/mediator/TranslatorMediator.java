package br.com.xandecoelho5.mediator.translate.mediator;

import br.com.xandecoelho5.mediator.translate.model.User;
import br.com.xandecoelho5.mediator.translate.services.Translator;

public class TranslatorMediator extends Mediator {

	private final Translator translator = new Translator();

	protected String getMessage(String message, User to, User from) {
		return translator.getTranslation(from.getLanguage(), to.getLanguage(), message);
	}
}
