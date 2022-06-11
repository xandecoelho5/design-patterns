package br.com.xandecoelho5.mediator.translate.mediator;

import br.com.xandecoelho5.mediator.translate.model.User;

public class ChatMediator extends Mediator {

	public String getMessage(String message, User to, User from) {
		return message;
	}
}
