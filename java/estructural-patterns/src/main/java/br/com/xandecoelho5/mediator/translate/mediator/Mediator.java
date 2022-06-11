package br.com.xandecoelho5.mediator.translate.mediator;

import br.com.xandecoelho5.mediator.translate.model.User;

import java.util.HashMap;
import java.util.Map;

public abstract class Mediator {
	protected Map<String, User> users = new HashMap<>();

	public void addUser(User user) {
		System.out.printf("'%s' is in the room%n", user.getName());
		users.put(user.getName(), user);
	}
	
	public void removeUser(User user) {
		System.out.printf("'%s' is out%n", user.getName());
		users.remove(user.getName());
	}

	public void sendMessage(String message, User to, User from) {
		if (to == null) {
			for (User user : users.values()) {
				if (user.getName().equals(from.getName()))
					continue;
				user.receiveMessage(getMessage(message, user, from), from);
			}
		} else {
			to.receiveMessage(getMessage(message, to, from), from);
		}
	}

	protected abstract String getMessage(String message, User to, User from);
}
