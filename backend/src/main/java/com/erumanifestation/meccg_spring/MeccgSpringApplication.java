package com.erumanifestation.meccg_spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.erumanifestation.meccg_spring.model.GameContext;
import com.erumanifestation.meccg_spring.model.state.MainMenu;


@SpringBootApplication
public class MeccgSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(MeccgSpringApplication.class, args);

		GameContext gameContext = new GameContext(new MainMenu());

        // Simulate the game loop
        while (true) {
            gameContext.execute();
            // Add a break condition to exit the loop (e.g., when the game is over)
        }
	}

}
