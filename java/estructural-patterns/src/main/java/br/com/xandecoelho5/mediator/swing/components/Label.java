package br.com.xandecoelho5.mediator.swing.components;

import br.com.xandecoelho5.mediator.swing.mediator.Mediator;

import javax.swing.*;
import java.awt.*;
import java.io.Serial;

public class Label extends JLabel {
	@Serial
	private static final long serialVersionUID = 4136663121512778435L;
	private final Mediator mediator;
	
	public Label(Mediator mediator) {
		super("Times Clicked: 0");
		setFont(new Font(getFont().getName(), Font.BOLD, 30));

		this.mediator = mediator;
	}

	public void refresh() {
		super.setText("Times Clicked: " + mediator.getCounterValue());
	}
}
