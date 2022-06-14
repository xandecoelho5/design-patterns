package br.com.xandecoelho5.observer.swing;

import javax.swing.*;
import java.io.Serial;

public class Button extends JButton {
    @Serial
    private static final long serialVersionUID = -6974338600947333550L;

    public Button(String text, Label... labels) {
        super(text);

        addActionListener(e -> {
            for (Label label : labels) {
                label.increment();
            }
        });
    }
}
