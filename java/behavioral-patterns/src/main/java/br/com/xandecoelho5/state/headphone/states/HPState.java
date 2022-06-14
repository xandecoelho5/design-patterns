package br.com.xandecoelho5.state.headphone.states;

import br.com.xandecoelho5.state.headphone.HeadPhone;

public interface HPState {
	void click(HeadPhone hp);
	void longClick(HeadPhone hp);
}
