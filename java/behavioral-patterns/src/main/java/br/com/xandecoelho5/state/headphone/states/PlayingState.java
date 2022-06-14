package br.com.xandecoelho5.state.headphone.states;

import br.com.xandecoelho5.state.headphone.HeadPhone;

public class PlayingState implements HPState {
	private static final HPState instance = new PlayingState();
	private PlayingState() {}

	@Override
	public void click(HeadPhone hp) {
		hp.setPlaying(false);
		System.out.println("> Stop Player");
		hp.setState(OnState.getInstance());
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
