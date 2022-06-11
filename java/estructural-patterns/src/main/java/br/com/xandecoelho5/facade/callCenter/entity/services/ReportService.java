package br.com.xandecoelho5.facade.callCenter.entity.services;

import br.com.xandecoelho5.facade.callCenter.entity.model.Card;
import br.com.xandecoelho5.facade.callCenter.entity.model.Register;

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
