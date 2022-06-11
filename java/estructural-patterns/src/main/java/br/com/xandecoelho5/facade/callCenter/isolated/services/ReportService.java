package br.com.xandecoelho5.facade.callCenter.isolated.services;

import br.com.xandecoelho5.facade.callCenter.isolated.model.Card;
import br.com.xandecoelho5.facade.callCenter.isolated.model.Register;

import java.util.List;

public class ReportService {
	private final RegisterService registerService;
	
	public ReportService(RegisterService registerService) {
		this.registerService = registerService;
	}

	public void getSumary(Card card) {
		List<Register> registers = registerService.getRegistersByCard(card);
		for(Register reg: registers) {
			System.out.printf("%s\t%.2f\t%s%n",
					reg.getStoreName(),
					reg.getValue(),
					reg.getDate().toString()
					);
		}
	}

}
