package com.basicSpring.spring1;

import com.basicSpring.spring1.game.MarioGame;
import com.basicSpring.spring1.game.PacmanGame;
import com.basicSpring.spring1.game.SuperContraGame;
import com.basicSpring.spring1.game.GameRunner;

/**
 * 
 */
public class App01GamingBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		var game=new MarioGame();
//		var game=new SuperContraGame();
		var game =new PacmanGame();//object creation
		var gameRunner=new GameRunner(game);//object creation + wiring of dependencies
		//game is a dependency of GameRunner
		
		
		gameRunner.run();

	}

}
