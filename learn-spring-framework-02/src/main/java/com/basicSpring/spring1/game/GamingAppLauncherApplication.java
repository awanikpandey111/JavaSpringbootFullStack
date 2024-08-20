package com.basicSpring.spring1.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 
 */

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("package com.basicSpring.spring1.game")
public class GamingAppLauncherApplication {
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		try(		
				var context=new AnnotationConfigApplicationContext(GamingAppLauncherApplication.class);

				){
			context.getBean(GamingConsole.class).up();
			context.getBean(GameRunner.class).run();
		}

	}

}
