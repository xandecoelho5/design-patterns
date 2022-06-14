package br.com.xandecoelho5.state.pacman;

import br.com.xandecoelho5.state.pacman.states.GhostState;
import br.com.xandecoelho5.state.pacman.states.WanderMazeState;

public class Ghost {
	private GhostState state = WanderMazeState.getInstance();

	public GhostState getState() {
		return state;
	}

	public void setState(GhostState state) {
		System.out.printf("Changing from %s to %s%n",
				this.state.getClass().getSimpleName(),
				state.getClass().getSimpleName());
		this.state = state;
	}
	
	public void spotPacman() {
		state.spotPacman(this);
	}

	public void losePacman() {
		state.losePacman(this);
	}

	public void pacmanTurnsSpecial() {
		state.pacmanTurnsSpecial(this);		
	}

	public void pacmanTurnsNormal() {
		state.pacmanTurnsNormal(this);
	}

	public void eatenByPacman() {
		state.eatenByPacman(this);
	}

	public void reachTheBase() {
		state.reachTheBase(this);
	}
}
