package com.basicSpring.spring1.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
//	MarioGame game;
	private GamingConsole game;
	public GameRunner(@Qualifier("SperContraGameQualifier")GamingConsole game) {
		this.game=game;
	}
	
	public void run() {
		System.out.println("Running game "+game);
		game.up();
		game.down();
		game.left();
		game.right();
	}
}
