package br.com.xandecoelho5.mediator.swing.components;

import br.com.xandecoelho5.mediator.swing.mediator.Mediator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serial;

public class ResetButton extends JButton {
	@Serial
	private static final long serialVersionUID = -6170178595314483794L;
	
	public ResetButton(Mediator mediator) {
		super("Reset");
		
		this.addActionListener(e -> mediator.reset());
	}
}
