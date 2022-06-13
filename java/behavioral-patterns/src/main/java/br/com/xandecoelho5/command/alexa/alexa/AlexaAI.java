package br.com.xandecoelho5.command.alexa.alexa;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class AlexaAI {
	private final Map<String, String[]> associations;
	
	public AlexaAI() {
		associations = new HashMap<>();
	}
	
	public void addAssociation(String key, String[] association) {
		associations.put(key, association);
	}
	
	public String getFindAssociations(String request) {
		for(String[] association: associations.values()) {
			if (Stream.of(association).allMatch(request::contains)) {
				return getKeyFromAssociations(association);
			}
		}
		return null;
	}

	private String getKeyFromAssociations(String... keywords) {
		return associations
			      .entrySet()
			      .stream()
			      .filter(entry -> Arrays.equals(keywords, entry.getValue()))
			      .map(Map.Entry::getKey)
			      .findFirst().get();
	}
}
