package br.com.xandecoelho5.facade.callCenter.isolated.services;

import br.com.xandecoelho5.facade.callCenter.isolated.model.Card;
import br.com.xandecoelho5.facade.callCenter.isolated.model.Register;

import java.util.List;

public class SecurityService {
	private final CardService cardService;
	private final RegisterService registerService;
	
	public SecurityService(CardService cardService, RegisterService registerService) {
		this.cardService = cardService;
		this.registerService = registerService;
	}

	public List<Register> blockCard(Card card) {
		System.out.println("Blocking card:" + card);
		List<Register> pendingRegistries = registerService.getRegistersByCard(card);
		cardService.removeCard(card);
		registerService.deleteCardRegistries(card);
		return pendingRegistries;
	}
}
