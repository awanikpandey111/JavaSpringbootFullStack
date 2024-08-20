package com.basicSpring.spring1;

import com.basicSpring.spring1.game.MarioGame;
import com.basicSpring.spring1.game.PacmanGame;
import com.basicSpring.spring1.game.SuperContraGame;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.basicSpring.spring1.game.GameRunner;
import com.basicSpring.spring1.game.GamingConsole;

/**
 * 
 */
public class App03GamingSpringBeans {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try(		
				var context=new AnnotationConfigApplicationContext(GamingConfiguration.class);

				){
			context.getBean(GamingConsole.class).up();
			context.getBean(GameRunner.class).run();
		}

	}

}
