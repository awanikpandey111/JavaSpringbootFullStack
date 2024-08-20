package com.basicSpring.spring1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.basicSpring.spring1.game.GameRunner;
import com.basicSpring.spring1.game.GamingConsole;
import com.basicSpring.spring1.game.PacmanGame;

@Configuration
public class GamingConfiguration {
	
	@Bean
	public GamingConsole game() {
		var game=new PacmanGame(); 
		return game;
	}
	
	@Bean
	public GameRunner gameRunner(GamingConsole game) {
		var gameRunner=new GameRunner(game);
		return gameRunner;
	}
	
}
