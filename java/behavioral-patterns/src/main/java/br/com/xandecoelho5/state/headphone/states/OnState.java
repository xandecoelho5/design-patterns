package br.com.xandecoelho5.state.headphone.states;

import br.com.xandecoelho5.state.headphone.HeadPhone;

public class OnState implements HPState {
	private static final HPState instance = new OnState();
	private OnState() {}

	@Override
	public void click(HeadPhone hp) {
		hp.setPlaying(true);
		System.out.println("> Resume Player");
		hp.setState(PlayingState.getInstance());
	}

	@Override
	public void longClick(HeadPhone hp) {
		hp.setOn(false);
		System.out.println("> Turning Off");
		hp.setState(OffState.getInstance());
	}

	public static HPState getInstance() {
		return instance;
	}

}
